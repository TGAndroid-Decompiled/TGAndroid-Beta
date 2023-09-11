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
import android.text.Spannable;
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
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.CopyUtilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.TextStyleSpan;
public class EditTextCaption extends EditTextBoldCursor {
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private AlertDialog creationLinkDialog;
    private EditTextCaptionDelegate delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private float offsetY;
    private final Theme.ResourcesProvider resourcesProvider;
    private int selectionEnd;
    private int selectionStart;
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
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = resourcesProvider;
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
        textStyleRun.flags |= LiteMode.FLAG_CHAT_BLUR;
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

    public void makeSelectedUrl() {
        final int selectionEnd;
        AlertDialogDecor.Builder builder = new AlertDialogDecor.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString("CreateLink", R.string.CreateLink));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(this, getContext()) {
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
        builder.setView(editTextBoldCursor);
        final int i = this.selectionStart;
        if (i >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EditTextCaption.this.lambda$makeSelectedUrl$0(i, selectionEnd, editTextBoldCursor, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        AlertDialog create = builder.create();
        this.creationLinkDialog = create;
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                EditTextCaption.this.lambda$makeSelectedUrl$1(dialogInterface);
            }
        });
        this.creationLinkDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                EditTextCaption.lambda$makeSelectedUrl$2(EditTextBoldCursor.this, dialogInterface);
            }
        });
        this.creationLinkDialog.showDelayed(250L);
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

    public void lambda$makeSelectedUrl$0(int i, int i2, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface, int i3) {
        Editable text = getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof AnimatedEmojiSpan)) {
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

    public void lambda$makeSelectedUrl$1(DialogInterface dialogInterface) {
        this.creationLinkDialog = null;
        requestFocus();
    }

    public static void lambda$makeSelectedUrl$2(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
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
        return Build.VERSION.SDK_INT >= 23 ? new ActionMode.Callback2(this) {
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
                if (callback3 instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback3).onGetContentRect(actionMode, view, rect);
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
        } else if (i == R.id.menu_bold) {
            makeSelectedBold();
            return true;
        } else if (i == R.id.menu_italic) {
            makeSelectedItalic();
            return true;
        } else if (i == R.id.menu_mono) {
            makeSelectedMono();
            return true;
        } else if (i == R.id.menu_link) {
            makeSelectedUrl();
            return true;
        } else if (i == R.id.menu_strike) {
            makeSelectedStrike();
            return true;
        } else if (i == R.id.menu_underline) {
            makeSelectedUnderline();
            return true;
        } else if (i == R.id.menu_spoiler) {
            makeSelectedSpoiler();
            return true;
        } else {
            return false;
        }
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
        int i3 = indexOf + 1;
        CharSequence subSequence = text.subSequence(0, i3);
        int ceil = (int) Math.ceil(paint.measureText(text, 0, i3));
        this.userNameLength = subSequence.length();
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - ceil;
        CharSequence ellipsize = TextUtils.ellipsize(this.caption, paint, measuredWidth, TextUtils.TruncateAt.END);
        this.xOffset = ceil;
        try {
            StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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

    public void setOffsetY(float f) {
        this.offsetY = f;
        invalidate();
    }

    public float getOffsetY() {
        return this.offsetY;
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
        int i = 0;
        int size = actionList.size();
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
                    Spannable fromHTML = CopyUtilities.fromHTML(primaryClip.getItemAt(0).getHtmlText());
                    Emoji.replaceEmoji((CharSequence) fromHTML, getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false, (int[]) null);
                    AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) fromHTML.getSpans(0, fromHTML.length(), AnimatedEmojiSpan.class);
                    if (animatedEmojiSpanArr != null) {
                        for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                            animatedEmojiSpan.applyFontMetrics(getPaint().getFontMetricsInt(), AnimatedEmojiDrawable.getCacheTypeForEnterView());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    setText(getText().replace(max, Math.min(getText().length(), getSelectionEnd()), fromHTML));
                    setSelection(fromHTML.length() + max, max + fromHTML.length());
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
                } else if (i == 16908320) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(max2, min));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (max2 != 0) {
                        spannableStringBuilder.append(getText().subSequence(0, max2));
                    }
                    if (min != getText().length()) {
                        spannableStringBuilder.append(getText().subSequence(min, getText().length()));
                    }
                    setText(spannableStringBuilder);
                    setSelection(max2, max2);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return super.onTextContextMenuItem(i);
    }
}
