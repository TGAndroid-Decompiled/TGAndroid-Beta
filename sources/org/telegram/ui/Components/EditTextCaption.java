package org.telegram.ui.Components;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.CopyUtilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper$$ExternalSyntheticApiModelOutline4;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.TextStyleSpan;

public class EditTextCaption extends EditTextBoldCursor {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private AlertDialog creationLinkDialog;
    private EditTextCaptionDelegate delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final Theme.ResourcesProvider resourcesProvider;
    private int selectionEnd;
    private int selectionStart;
    private int triesCount;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public interface EditTextCaptionDelegate {
        void onSpansChanged();
    }

    protected void onContextMenuClose() {
    }

    protected void onContextMenuOpen() {
    }

    protected void onLineCountChanged(int i, int i2) {
    }

    public EditTextCaption(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.triesCount = 0;
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = resourcesProvider;
        this.quoteColor = Theme.getColor(Theme.key_chat_inQuote, resourcesProvider);
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (EditTextCaption.this.lineCount != EditTextCaption.this.getLineCount()) {
                    if (!EditTextCaption.this.isInitLineCount && EditTextCaption.this.getMeasuredWidth() > 0) {
                        EditTextCaption editTextCaption = EditTextCaption.this;
                        editTextCaption.onLineCountChanged(editTextCaption.lineCount, EditTextCaption.this.getLineCount());
                    }
                    EditTextCaption editTextCaption2 = EditTextCaption.this;
                    editTextCaption2.lineCount = editTextCaption2.getLineCount();
                }
            }
        });
        setClipToPadding(true);
    }

    public void setCaption(String str) {
        String str2 = this.caption;
        if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
            return;
        }
        String str3 = this.caption;
        if (str3 == null || !str3.equals(str)) {
            this.caption = str;
            if (str != null) {
                this.caption = str.replace('\n', ' ');
            }
            requestLayout();
        }
    }

    public void setDelegate(EditTextCaptionDelegate editTextCaptionDelegate) {
        this.delegate = editTextCaptionDelegate;
    }

    public void setAllowTextEntitiesIntersection(boolean z) {
        this.allowTextEntitiesIntersection = z;
    }

    public void makeSelectedBold() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 1;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun));
    }

    public void makeSelectedSpoiler() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 256;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun));
        invalidateSpoilers();
    }

    public void makeSelectedItalic() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 2;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun));
    }

    public void makeSelectedMono() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 4;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun));
    }

    public void makeSelectedStrike() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 8;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun));
    }

    public void makeSelectedUnderline() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 16;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedQuote(boolean z) {
        int selectionEnd;
        int i = this.selectionStart;
        if (i >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        int putQuoteToEditable = QuoteSpan.putQuoteToEditable(getText(), i, selectionEnd, z);
        if (putQuoteToEditable >= 0) {
            setSelection(putQuoteToEditable);
            resetFontMetricsCache();
        }
        invalidateQuotes(true);
        invalidateSpoilers();
    }

    public void makeSelectedUrl() {
        Object builder;
        final int selectionEnd;
        CharSequence charSequence;
        if (this.adaptiveCreateLinkDialog) {
            builder = new AlertDialogDecor.Builder(getContext(), this.resourcesProvider);
        } else {
            builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        }
        ?? r2 = builder;
        r2.setTitle(LocaleController.getString("CreateLink", R.string.CreateLink));
        ?? frameLayout = new FrameLayout(getContext());
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext()) {
            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824));
            }
        };
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setText("http://");
        editTextBoldCursor.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        editTextBoldCursor.setHintText(LocaleController.getString("URL", R.string.URL));
        editTextBoldCursor.setHeaderHintColor(getThemedColor(Theme.key_windowBackgroundWhiteBlueHeader));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeader(true);
        editTextBoldCursor.setLineColors(getThemedColor(Theme.key_windowBackgroundWhiteInputField), getThemedColor(Theme.key_windowBackgroundWhiteInputFieldActivated), getThemedColor(Theme.key_text_RedRegular));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.requestFocus();
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(getThemedColor(Theme.key_chat_inTextSelectionHighlight));
        editTextBoldCursor.setHandlesColor(getThemedColor(Theme.key_chat_TextSelectionCursor));
        frameLayout.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -1, 119));
        final TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Paste));
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhiteBlueText2);
        textView.setTextColor(themedColor);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(themedColor, 0.12f), Theme.multAlpha(themedColor, 0.15f)));
        ScaleStateListAnimator.apply(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                EditTextCaption.this.lambda$makeSelectedUrl$0(editTextBoldCursor, textView);
            }
        };
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                EditTextCaption.this.lambda$makeSelectedUrl$1(editTextBoldCursor, runnable, view);
            }
        });
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence2, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence2, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                runnable.run();
            }
        });
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequence = null;
            }
            if (charSequence != null) {
                editTextBoldCursor.setText(charSequence);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
            }
        }
        runnable.run();
        r2.setView(frameLayout);
        final int i = this.selectionStart;
        if (i >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        r2.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EditTextCaption.this.lambda$makeSelectedUrl$2(i, selectionEnd, editTextBoldCursor, dialogInterface, i2);
            }
        });
        r2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        if (this.adaptiveCreateLinkDialog) {
            AlertDialog create = r2.create();
            this.creationLinkDialog = create;
            create.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    EditTextCaption.this.lambda$makeSelectedUrl$3(dialogInterface);
                }
            });
            this.creationLinkDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    EditTextCaption.lambda$makeSelectedUrl$4(EditTextBoldCursor.this, dialogInterface);
                }
            });
            this.creationLinkDialog.showDelayed(250L);
        } else {
            r2.show().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    EditTextCaption.lambda$makeSelectedUrl$5(EditTextBoldCursor.this, dialogInterface);
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int dp = AndroidUtilities.dp(24.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
            marginLayoutParams.height = AndroidUtilities.dp(36.0f);
            editTextBoldCursor.setLayoutParams(marginLayoutParams);
        }
        editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
    }

    public void lambda$makeSelectedUrl$0(EditTextBoldCursor editTextBoldCursor, TextView textView) {
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z = (TextUtils.isEmpty(editTextBoldCursor.getText()) || TextUtils.equals(editTextBoldCursor.getText().toString(), "http://")) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        textView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(300L).start();
    }

    public void lambda$makeSelectedUrl$1(EditTextBoldCursor editTextBoldCursor, Runnable runnable, View view) {
        CharSequence charSequence;
        try {
            charSequence = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(getContext());
        } catch (Exception e) {
            FileLog.e(e);
            charSequence = null;
        }
        if (charSequence != null) {
            editTextBoldCursor.setText(charSequence);
            editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
        }
        runnable.run();
    }

    public void lambda$makeSelectedUrl$2(int i, int i2, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface, int i3) {
        Editable text = getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof AnimatedEmojiSpan) && !(characterStyle instanceof QuoteSpan.QuoteStyleSpan)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i) {
                        text.setSpan(characterStyle, spanStart, i, 33);
                    }
                    if (spanEnd > i2) {
                        text.setSpan(characterStyle, i2, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(new URLSpanReplacement(editTextBoldCursor.getText().toString()), i, i2, 33);
        } catch (Exception unused) {
        }
        EditTextCaptionDelegate editTextCaptionDelegate = this.delegate;
        if (editTextCaptionDelegate != null) {
            editTextCaptionDelegate.onSpansChanged();
        }
    }

    public void lambda$makeSelectedUrl$3(DialogInterface dialogInterface) {
        this.creationLinkDialog = null;
        requestFocus();
    }

    public static void lambda$makeSelectedUrl$4(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$makeSelectedUrl$5(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public boolean closeCreationLinkDialog() {
        AlertDialog alertDialog = this.creationLinkDialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return false;
        }
        this.creationLinkDialog.dismiss();
        return true;
    }

    public void makeSelectedRegular() {
        applyTextStyleToSelection(null);
    }

    public void setSelectionOverride(int i, int i2) {
        this.selectionStart = i;
        this.selectionEnd = i2;
    }

    private void applyTextStyleToSelection(TextStyleSpan textStyleSpan) {
        int selectionEnd;
        int i = this.selectionStart;
        if (i >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(textStyleSpan, i, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (textStyleSpan == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            QuoteSpan[] quoteSpanArr = (QuoteSpan[]) text.getSpans(i, selectionEnd, QuoteSpan.class);
            for (int i2 = 0; i2 < quoteSpanArr.length; i2++) {
                text.removeSpan(quoteSpanArr[i2]);
                text.removeSpan(quoteSpanArr[i2].styleSpan);
                QuoteSpan.QuoteCollapsedPart quoteCollapsedPart = quoteSpanArr[i2].collapsedSpan;
                if (quoteCollapsedPart != null) {
                    text.removeSpan(quoteCollapsedPart);
                }
            }
            if (quoteSpanArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        EditTextCaptionDelegate editTextCaptionDelegate = this.delegate;
        if (editTextCaptionDelegate != null) {
            editTextCaptionDelegate.onSpansChanged();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z) {
        if (Build.VERSION.SDK_INT >= 23 || z || !this.copyPasteShowed) {
            try {
                super.onWindowFocusChanged(z);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    private ActionMode.Callback overrideCallback(final ActionMode.Callback callback) {
        final ActionMode.Callback callback2 = new ActionMode.Callback() {
            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                EditTextCaption.this.copyPasteShowed = true;
                EditTextCaption.this.onContextMenuOpen();
                return callback.onCreateActionMode(actionMode, menu);
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return callback.onPrepareActionMode(actionMode, menu);
            }

            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                if (EditTextCaption.this.performMenuAction(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return callback.onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
                EditTextCaption.this.copyPasteShowed = false;
                EditTextCaption.this.onContextMenuClose();
                callback.onDestroyActionMode(actionMode);
            }
        };
        return Build.VERSION.SDK_INT >= 23 ? new ActionMode.Callback2() {
            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return callback2.onCreateActionMode(actionMode, menu);
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return callback2.onPrepareActionMode(actionMode, menu);
            }

            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return callback2.onActionItemClicked(actionMode, menuItem);
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
                callback2.onDestroyActionMode(actionMode);
            }

            @Override
            public void onGetContentRect(ActionMode actionMode, View view, android.graphics.Rect rect) {
                ActionMode.Callback callback3 = callback;
                if (EditTextBoldCursor$ActionModeCallback2Wrapper$$ExternalSyntheticApiModelOutline0.m(callback3)) {
                    TextSelectionHelper$$ExternalSyntheticApiModelOutline4.m(callback3).onGetContentRect(actionMode, view, rect);
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                }
            }
        } : callback2;
    }

    public boolean performMenuAction(int i) {
        if (i == R.id.menu_regular) {
            makeSelectedRegular();
            return true;
        }
        if (i == R.id.menu_bold) {
            makeSelectedBold();
            return true;
        }
        if (i == R.id.menu_italic) {
            makeSelectedItalic();
            return true;
        }
        if (i == R.id.menu_mono) {
            makeSelectedMono();
            return true;
        }
        if (i == R.id.menu_link) {
            makeSelectedUrl();
            return true;
        }
        if (i == R.id.menu_strike) {
            makeSelectedStrike();
            return true;
        }
        if (i == R.id.menu_underline) {
            makeSelectedUnderline();
            return true;
        }
        if (i == R.id.menu_spoiler) {
            makeSelectedSpoiler();
            return true;
        }
        if (i != R.id.menu_quote) {
            return false;
        }
        makeSelectedQuote();
        return true;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return super.startActionMode(overrideCallback(callback), i);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(overrideCallback(callback));
    }

    @Override
    @SuppressLint({"DrawAllocation"})
    public void onMeasure(int i, int i2) {
        int indexOf;
        try {
            this.isInitLineCount = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
            super.onMeasure(i, i2);
            if (this.isInitLineCount) {
                this.lineCount = getLineCount();
            }
            this.isInitLineCount = false;
        } catch (Exception e) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(51.0f));
            FileLog.e(e);
        }
        this.captionLayout = null;
        String str = this.caption;
        if (str == null || str.length() <= 0) {
            return;
        }
        Editable text = getText();
        if (text.length() <= 1 || text.charAt(0) != '@' || (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) == -1) {
            return;
        }
        TextPaint paint = getPaint();
        CharSequence subSequence = text.subSequence(0, indexOf + 1);
        int ceil = (int) Math.ceil(paint.measureText(text, 0, r13));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        this.userNameLength = subSequence.length();
        int i3 = measuredWidth - ceil;
        CharSequence ellipsize = TextUtils.ellipsize(this.caption, paint, i3, TextUtils.TruncateAt.END);
        this.xOffset = ceil;
        try {
            StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.captionLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.xOffset = (int) (this.xOffset + (-this.captionLayout.getLineLeft(0)));
            }
            this.yOffset = ((getMeasuredHeight() - this.captionLayout.getLineBottom(0)) / 2) + AndroidUtilities.dp(0.5f);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public String getCaption() {
        return this.caption;
    }

    @Override
    public void setHintColor(int i) {
        super.setHintColor(i);
        this.hintColor = i;
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.offsetY);
        super.onDraw(canvas);
        try {
            if (this.captionLayout != null && this.userNameLength == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.hintColor);
                canvas.save();
                canvas.translate(this.xOffset, this.yOffset);
                this.captionLayout.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        canvas.restore();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.caption)) {
            wrap.setHintText(this.caption);
        }
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = wrap.getActionList();
        int size = actionList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = actionList.get(i);
            if (accessibilityActionCompat.getId() == 268435456) {
                wrap.removeAction(accessibilityActionCompat);
                break;
            }
            i++;
        }
        if (hasSelection()) {
            wrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_spoiler, LocaleController.getString("Spoiler", R.string.Spoiler)));
            wrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_bold, LocaleController.getString("Bold", R.string.Bold)));
            wrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_italic, LocaleController.getString("Italic", R.string.Italic)));
            wrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_mono, LocaleController.getString("Mono", R.string.Mono)));
            wrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_strike, LocaleController.getString("Strike", R.string.Strike)));
            wrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_underline, LocaleController.getString("Underline", R.string.Underline)));
            wrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_link, LocaleController.getString("CreateLink", R.string.CreateLink)));
            wrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_regular, LocaleController.getString("Regular", R.string.Regular)));
        }
    }

    @Override
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return performMenuAction(i) || super.performAccessibilityAction(i, bundle);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(CopyUtilities.fromHTML(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class);
                    if (animatedEmojiSpanArr != null) {
                        for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                            animatedEmojiSpan.applyFontMetrics(getPaint().getFontMetricsInt(), AnimatedEmojiDrawable.getCacheTypeForEnterView());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr = (QuoteSpan.QuoteStyleSpan[]) getText().getSpans(max, min, QuoteSpan.QuoteStyleSpan.class);
                    if (quoteStyleSpanArr != null && quoteStyleSpanArr.length > 0) {
                        QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr2 = (QuoteSpan.QuoteStyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), QuoteSpan.QuoteStyleSpan.class);
                        for (int i2 = 0; i2 < quoteStyleSpanArr2.length; i2++) {
                            spannableStringBuilder.removeSpan(quoteStyleSpanArr2[i2]);
                            spannableStringBuilder.removeSpan(quoteStyleSpanArr2[i2].span);
                        }
                    } else {
                        QuoteSpan.normalizeQuotes(spannableStringBuilder);
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            try {
                if (i == 16908321) {
                    AndroidUtilities.addToClipboard(getText().subSequence(Math.max(0, getSelectionStart()), Math.min(getText().length(), getSelectionEnd())));
                    return true;
                }
                if (i == 16908320) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(max2, min2));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (max2 != 0) {
                        spannableStringBuilder2.append(getText().subSequence(0, max2));
                    }
                    if (min2 != getText().length()) {
                        spannableStringBuilder2.append(getText().subSequence(min2, getText().length()));
                    }
                    setText(spannableStringBuilder2);
                    setSelection(max2, max2);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return super.onTextContextMenuItem(i);
    }
}
