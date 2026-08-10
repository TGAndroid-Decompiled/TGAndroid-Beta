package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Rect;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.CopyUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.FloatingActionMode;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper$$ExternalSyntheticApiModelOutline6;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.LaunchActivity;

public class EditTextCaption extends EditTextBoldCursor implements FloatingToolbar.StyleDelegate {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
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
    private Text rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public interface EditTextCaptionDelegate {
        void onSpansChanged();
    }

    public interface InputDialogCallback {
        void run(String str);
    }

    public static void lambda$makeSelectedDate$1() {
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

    protected void notifySpansChanged() {
        EditTextCaptionDelegate editTextCaptionDelegate = this.delegate;
        if (editTextCaptionDelegate != null) {
            editTextCaptionDelegate.onSpansChanged();
        }
    }

    public void setAllowTextEntitiesIntersection(boolean z) {
        this.allowTextEntitiesIntersection = z;
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.allowTextEntitiesIntersection;
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

    public void toggleStyleForSelection(int i) {
        if (getText() == null) {
            return;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0) {
            return;
        }
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        if (selectionStart >= selectionEnd) {
            return;
        }
        if ((getCurrentStyle(selectionStart, selectionEnd) & i) == 0) {
            int i2 = 4;
            if (i == 4) {
                i2 = 49435;
            } else if (i == 16384) {
                i2 = 32772;
            } else if (i == 32768) {
                i2 = 16388;
            }
            removeStyle(i2, selectionStart, selectionEnd);
            addStyle(i, selectionStart, selectionEnd);
            return;
        }
        removeStyle(i, selectionStart, selectionEnd);
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedQuote(boolean z) {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        int iPutQuoteToEditable = QuoteSpan.putQuoteToEditable(getText(), selectionStart, selectionEnd, z);
        if (iPutQuoteToEditable >= 0) {
            setSelection(iPutQuoteToEditable);
            resetFontMetricsCache();
        }
        invalidateQuotes(true);
        invalidateSpoilers();
    }

    public void makeSelectedDate() {
        final int selectionEnd;
        final int selectionStart = this.selectionStart;
        if (selectionStart >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        AlertsCreator.createFormattedDatePickerDialog(getContext(), new AlertsCreator.FormattedDatePickerDelegate() {
            @Override
            public final void didSelectDate(int i, int i2) {
                this.f$0.lambda$makeSelectedDate$0(selectionStart, selectionEnd, i, i2);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                EditTextCaption.lambda$makeSelectedDate$1();
            }
        }, this.resourcesProvider);
    }

    public void lambda$makeSelectedDate$0(int i, int i2, int i3, int i4) {
        Editable text = getText();
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 128;
        textStyleRun.start = i;
        textStyleRun.end = i2;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i3;
        tL_messageEntityFormattedDate.flags = i4;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new FormattedDateSpan(text.subSequence(i, i2).toString(), textStyleRun, tL_messageEntityFormattedDate), i, i2, 33);
        } catch (Exception unused) {
        }
        EditTextCaptionDelegate editTextCaptionDelegate = this.delegate;
        if (editTextCaptionDelegate != null) {
            editTextCaptionDelegate.onSpansChanged();
        }
    }

    public void translateSelected() {
        final int selectionEnd;
        final int selectionStart = this.selectionStart;
        if (selectionStart >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        CharSequence charSequenceSubSequence = getText().subSequence(selectionStart, selectionEnd);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        new TranslateAlert3(getContext(), safeLastFragment != null ? safeLastFragment.getResourceProvider() : null).setText(charSequenceSubSequence).setOnUse(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$translateSelected$2(selectionStart, selectionEnd, (CharSequence) obj);
            }
        }).show();
        setSelection(selectionStart, selectionEnd);
    }

    public void lambda$translateSelected$2(int i, int i2, CharSequence charSequence) {
        getText().replace(i, i2, charSequence);
        setSelection(i, charSequence.length() + i);
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void makeSelectedUrl(final Runnable runnable) {
        final int selectionEnd;
        final int selectionStart = this.selectionStart;
        if (selectionStart >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new InputDialogCallback() {
            @Override
            public final void run(String str) {
                this.f$0.lambda$makeSelectedUrl$3(selectionStart, selectionEnd, runnable, str);
            }
        });
    }

    public void lambda$makeSelectedUrl$3(int i, int i2, Runnable runnable, String str) {
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
            text.setSpan(createUrlSpan(str), i, i2, 33);
        } catch (Exception unused) {
        }
        EditTextCaptionDelegate editTextCaptionDelegate = this.delegate;
        if (editTextCaptionDelegate != null) {
            editTextCaptionDelegate.onSpansChanged();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    protected URLSpanReplacement createUrlSpan(String str) {
        return new URLSpanReplacement(str);
    }

    public void showInputDialog(String str, String str2, String str3, boolean z, InputDialogCallback inputDialogCallback) {
        showInputDialog(str, str2, str3, z, this.adaptiveCreateLinkDialog, inputDialogCallback);
    }

    public void showInputDialog(String str, String str2, String str3, final boolean z, boolean z2, final InputDialogCallback inputDialogCallback) {
        Object builder;
        CharSequence charSequenceCoerceToText;
        if (z2) {
            builder = new AlertDialogDecor.Builder(getContext(), this.resourcesProvider);
        } else {
            builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        }
        ?? r8 = builder;
        r8.setTitle(str);
        ?? frameLayout = new FrameLayout(getContext());
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext()) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824));
            }
        };
        String str4 = str3 == null ? "" : str3;
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setText(str4);
        editTextBoldCursor.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        editTextBoldCursor.setHintText(str2);
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
        textView.setVisibility(z ? 0 : 8);
        final String str5 = str4;
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showInputDialog$4(z, editTextBoldCursor, str5, textView);
            }
        };
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$showInputDialog$5(editTextBoldCursor, runnable, view);
            }
        });
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                runnable.run();
            }
        });
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequenceCoerceToText = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequenceCoerceToText = null;
            }
            if (charSequenceCoerceToText != null) {
                editTextBoldCursor.setText(charSequenceCoerceToText);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
            }
        }
        runnable.run();
        r8.setView(frameLayout);
        r8.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                EditTextCaption.lambda$showInputDialog$6(inputDialogCallback, editTextBoldCursor, alertDialog, i);
            }
        });
        r8.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        if (z2) {
            AlertDialog alertDialogCreate = r8.create();
            this.creationLinkDialog = alertDialogCreate;
            alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f$0.lambda$showInputDialog$7(dialogInterface);
                }
            });
            this.creationLinkDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    EditTextCaption.lambda$showInputDialog$8(editTextBoldCursor, dialogInterface);
                }
            });
            this.creationLinkDialog.showDelayed(250L);
        } else {
            r8.show().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    EditTextCaption.lambda$showInputDialog$9(editTextBoldCursor, dialogInterface);
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int iDp = AndroidUtilities.dp(24.0f);
            marginLayoutParams.leftMargin = iDp;
            marginLayoutParams.rightMargin = iDp;
            marginLayoutParams.height = AndroidUtilities.dp(36.0f);
            editTextBoldCursor.setLayoutParams(marginLayoutParams);
        }
        editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
    }

    public void lambda$showInputDialog$4(boolean z, EditTextBoldCursor editTextBoldCursor, String str, TextView textView) {
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z2 = z && (TextUtils.isEmpty(editTextBoldCursor.getText()) || TextUtils.equals(editTextBoldCursor.getText().toString(), str)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        textView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.7f).scaleY(z2 ? 1.0f : 0.7f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(300L).start();
    }

    public void lambda$showInputDialog$5(EditTextBoldCursor editTextBoldCursor, Runnable runnable, View view) {
        CharSequence charSequenceCoerceToText;
        try {
            charSequenceCoerceToText = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(getContext());
        } catch (Exception e) {
            FileLog.e(e);
            charSequenceCoerceToText = null;
        }
        if (charSequenceCoerceToText != null) {
            editTextBoldCursor.setText(charSequenceCoerceToText);
            editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
        }
        runnable.run();
    }

    public static void lambda$showInputDialog$6(InputDialogCallback inputDialogCallback, EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, int i) {
        inputDialogCallback.run(editTextBoldCursor.getText().toString().trim());
    }

    public void lambda$showInputDialog$7(DialogInterface dialogInterface) {
        this.creationLinkDialog = null;
        requestFocus();
    }

    public static void lambda$showInputDialog$8(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$showInputDialog$9(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public boolean closeCreationLinkDialog(boolean z) {
        AlertDialog alertDialog = this.creationLinkDialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return false;
        }
        if (!z) {
            return true;
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

    private static int spanStyleFlags(TextStyleSpan textStyleSpan) {
        int styleFlags = textStyleSpan.getStyleFlags();
        return (styleFlags & 512) != 0 ? styleFlags | 256 : styleFlags;
    }

    @Override
    public int getCurrentStyle(int i, int i2) {
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int iMax = Math.max(0, i);
        int iMin = Math.min(i2, text.length());
        if (iMax < 0 || iMin < 0 || iMax >= iMin) {
            return 0;
        }
        TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) text.getSpans(iMax, iMin, TextStyleSpan.class);
        int i3 = 0;
        for (int i4 : STYLE_FLAGS) {
            int i5 = iMax;
            boolean z = true;
            while (z && i5 < iMin) {
                z = false;
                for (int i6 = 0; i6 < textStyleSpanArr.length; i6++) {
                    if ((spanStyleFlags(textStyleSpanArr[i6]) & i4) != 0) {
                        int spanStart = text.getSpanStart(textStyleSpanArr[i6]);
                        int spanEnd = text.getSpanEnd(textStyleSpanArr[i6]);
                        if (spanStart <= i5 && spanEnd > i5) {
                            i5 = spanEnd;
                            z = true;
                        }
                    }
                }
            }
            if (i5 >= iMin) {
                i3 |= i4;
            }
        }
        return i3;
    }

    @Override
    public void addStyle(int i, int i2, int i3) {
        int iMin;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (iMin = Math.min(i3, text.length()))) {
            return;
        }
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags = i;
        MediaDataController.addStyleToText(new TextStyleSpan(textStyleRun), i2, iMin, text, true);
        if ((i & 256) != 0) {
            invalidateSpoilers();
        }
        EditTextCaptionDelegate editTextCaptionDelegate = this.delegate;
        if (editTextCaptionDelegate != null) {
            editTextCaptionDelegate.onSpansChanged();
        }
    }

    @Override
    public void removeStyle(int i, int i2, int i3) {
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3) {
            return;
        }
        int iMin = Math.min(i3, text.length());
        int i4 = i & 256;
        if (i4 != 0) {
            i |= 512;
        }
        for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) text.getSpans(i2, iMin, TextStyleSpan.class)) {
            int styleFlags = textStyleSpan.getStyleFlags();
            if ((styleFlags & i) != 0) {
                int spanStart = text.getSpanStart(textStyleSpan);
                int spanEnd = text.getSpanEnd(textStyleSpan);
                text.removeSpan(textStyleSpan);
                if (spanStart < i2) {
                    text.setSpan(new TextStyleSpan(new TextStyleSpan.TextStyleRun(textStyleSpan.getTextStyleRun())), spanStart, i2, 33);
                }
                if (spanEnd > iMin) {
                    text.setSpan(new TextStyleSpan(new TextStyleSpan.TextStyleRun(textStyleSpan.getTextStyleRun())), iMin, spanEnd, 33);
                }
                int iMax = Math.max(spanStart, i2);
                int iMin2 = Math.min(spanEnd, iMin);
                int i5 = styleFlags & (~i);
                if (i5 != 0 && iMax < iMin2) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun(textStyleSpan.getTextStyleRun());
                    textStyleRun.flags = i5;
                    text.setSpan(new TextStyleSpan(textStyleRun), iMax, iMin2, 33);
                }
            }
        }
        if (i4 != 0) {
            invalidateSpoilers();
        }
        EditTextCaptionDelegate editTextCaptionDelegate = this.delegate;
        if (editTextCaptionDelegate != null) {
            editTextCaptionDelegate.onSpansChanged();
        }
    }

    private void applyTextStyleToSelection(TextStyleSpan textStyleSpan) {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(textStyleSpan, selectionStart, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (textStyleSpan == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(selectionStart, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            QuoteSpan[] quoteSpanArr = (QuoteSpan[]) text.getSpans(selectionStart, selectionEnd, QuoteSpan.class);
            for (int i = 0; i < quoteSpanArr.length; i++) {
                text.removeSpan(quoteSpanArr[i]);
                text.removeSpan(quoteSpanArr[i].styleSpan);
                QuoteSpan.QuoteCollapsedPart quoteCollapsedPart = quoteSpanArr[i].collapsedSpan;
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
            public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
                ActionMode.Callback callback3 = callback;
                if (EditTextBoldCursor$ActionModeCallback2Wrapper$$ExternalSyntheticApiModelOutline0.m(callback3)) {
                    TextSelectionHelper$$ExternalSyntheticApiModelOutline6.m(callback3).onGetContentRect(actionMode, view, rect);
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
        if (i == R.id.menu_quote) {
            makeSelectedQuote();
            return true;
        }
        if (i == R.id.menu_date) {
            makeSelectedDate();
            return true;
        }
        if (i != R.id.menu_translate) {
            return false;
        }
        translateSelected();
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
    protected void onMeasure(int i, int i2) {
        int iIndexOf;
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
        if (text.length() <= 1 || text.charAt(0) != '@' || (iIndexOf = TextUtils.indexOf((CharSequence) text, ' ')) == -1) {
            return;
        }
        TextPaint paint = getPaint();
        CharSequence charSequenceSubSequence = text.subSequence(0, iIndexOf + 1);
        int iCeil = (int) Math.ceil(paint.measureText(text, 0, r13));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        this.userNameLength = charSequenceSubSequence.length();
        int i3 = measuredWidth - iCeil;
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.caption, paint, i3, TextUtils.TruncateAt.END);
        this.xOffset = iCeil;
        try {
            StaticLayout staticLayout = new StaticLayout(charSequenceEllipsize, getPaint(), i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.captionLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.xOffset = (int) (this.xOffset + (-this.captionLayout.getLineLeft(0)));
            }
            this.yOffset = ((getMeasuredHeight() - this.captionLayout.getLineBottom(0)) / 2) + AndroidUtilities.dp(0.5f);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public boolean isNearRightCaption(int i) {
        Layout layout = getLayout();
        if (layout == null || layout.getLineCount() <= 0) {
            return false;
        }
        return layout.getLineCount() > 1 || layout.getLineRight(0) + ((float) i) >= ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight()));
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
    protected void onDraw(Canvas canvas) {
        Layout layout;
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
        if (this.rightText != null && length() != 0 && (layout = getLayout()) != null && layout.getLineCount() > 0) {
            this.rightText.draw(canvas, layout.getLineRight(0), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), this.hintColor, 1.0f);
        }
        canvas.restore();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new Text(charSequence, 16.0f, getTypeface());
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.caption)) {
            accessibilityNodeInfoCompatWrap.setHintText(this.caption);
        }
        List actionList = accessibilityNodeInfoCompatWrap.getActionList();
        int size = actionList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat) actionList.get(i);
            if (accessibilityActionCompat.getId() == 268435456) {
                accessibilityNodeInfoCompatWrap.removeAction(accessibilityActionCompat);
                break;
            }
            i++;
        }
        if (hasSelection()) {
            accessibilityNodeInfoCompatWrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_spoiler, LocaleController.getString(R.string.Spoiler)));
            accessibilityNodeInfoCompatWrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_bold, LocaleController.getString(R.string.Bold)));
            accessibilityNodeInfoCompatWrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_italic, LocaleController.getString(R.string.Italic)));
            accessibilityNodeInfoCompatWrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_mono, LocaleController.getString(R.string.Mono)));
            accessibilityNodeInfoCompatWrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_strike, LocaleController.getString(R.string.Strike)));
            accessibilityNodeInfoCompatWrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_underline, LocaleController.getString(R.string.Underline)));
            accessibilityNodeInfoCompatWrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_link, LocaleController.getString(R.string.CreateLink)));
            accessibilityNodeInfoCompatWrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_regular, LocaleController.getString(R.string.Regular)));
            accessibilityNodeInfoCompatWrap.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.menu_date, LocaleController.getString(R.string.FormattedDate)));
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
                    int iMax = Math.max(0, getSelectionStart());
                    int iMin = Math.min(getText().length(), getSelectionEnd());
                    QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr = (QuoteSpan.QuoteStyleSpan[]) getText().getSpans(iMax, iMin, QuoteSpan.QuoteStyleSpan.class);
                    if (quoteStyleSpanArr != null && quoteStyleSpanArr.length > 0) {
                        QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr2 = (QuoteSpan.QuoteStyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), QuoteSpan.QuoteStyleSpan.class);
                        for (int i2 = 0; i2 < quoteStyleSpanArr2.length; i2++) {
                            spannableStringBuilder.removeSpan(quoteStyleSpanArr2[i2]);
                            spannableStringBuilder.removeSpan(quoteStyleSpanArr2[i2].span);
                        }
                    } else {
                        QuoteSpan.normalizeQuotes(spannableStringBuilder);
                    }
                    setText(getText().replace(iMax, iMin, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + iMax, iMax + spannableStringBuilder.length());
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            try {
                if (i == 16908321) {
                    int iMax2 = Math.max(0, getSelectionStart());
                    int iMin2 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(iMax2, iMin2));
                    AndroidUtilities.findActivity(getContext()).closeContextMenu();
                    FloatingActionMode floatingActionMode = this.floatingActionMode;
                    if (floatingActionMode != null) {
                        floatingActionMode.finish();
                    }
                    setSelection(iMax2, iMin2);
                    return true;
                }
                if (i == 16908320) {
                    int iMax3 = Math.max(0, getSelectionStart());
                    int iMin3 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(iMax3, iMin3));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (iMax3 != 0) {
                        spannableStringBuilder2.append(getText().subSequence(0, iMax3));
                    }
                    if (iMin3 != getText().length()) {
                        spannableStringBuilder2.append(getText().subSequence(iMin3, getText().length()));
                    }
                    setText(spannableStringBuilder2);
                    setSelection(iMax3, iMax3);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return super.onTextContextMenuItem(i);
    }
}
