package org.telegram.ui.Components;

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
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.CopyUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.FloatingActionMode;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda131;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda29;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda488;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda104;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.web.WebActionBar;

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

    public final class AnonymousClass4 implements ActionMode.Callback {
        public final ActionMode.Callback val$callback;

        public AnonymousClass4(ActionMode.Callback callback) {
            this.val$callback = callback;
        }

        @Override
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            if (EditTextCaption.this.performMenuAction(menuItem.getItemId())) {
                actionMode.finish();
                return true;
            }
            try {
                return this.val$callback.onActionItemClicked(actionMode, menuItem);
            } catch (Exception unused) {
                return true;
            }
        }

        @Override
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            EditTextCaption editTextCaption = EditTextCaption.this;
            editTextCaption.copyPasteShowed = true;
            editTextCaption.onContextMenuOpen();
            return this.val$callback.onCreateActionMode(actionMode, menu);
        }

        @Override
        public final void onDestroyActionMode(ActionMode actionMode) {
            EditTextCaption editTextCaption = EditTextCaption.this;
            editTextCaption.copyPasteShowed = false;
            editTextCaption.onContextMenuClose();
            this.val$callback.onDestroyActionMode(actionMode);
        }

        @Override
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.val$callback.onPrepareActionMode(actionMode, menu);
        }
    }

    public interface EditTextCaptionDelegate {
        void onSpansChanged();
    }

    public interface InputDialogCallback {
        void run(String str);
    }

    public EditTextCaption(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = resourcesProvider;
        this.quoteColor = Theme.getColor(Theme.key_chat_inQuote, resourcesProvider);
        addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 10));
        setClipToPadding(true);
    }

    public static void lambda$makeSelectedDate$1() {
    }

    public static void lambda$showInputDialog$8(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$showInputDialog$9(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
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
        MediaDataController.addStyleToText(new TextStyleSpan(textStyleRun, 0), i2, iMin, text, true);
        if ((i & 256) != 0) {
            invalidateSpoilers();
        }
        EditTextCaptionDelegate editTextCaptionDelegate = this.delegate;
        if (editTextCaptionDelegate != null) {
            editTextCaptionDelegate.onSpansChanged();
        }
    }

    public final void applyTextStyleToSelection(TextStyleSpan textStyleSpan) {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart < 0 || (selectionEnd = this.selectionEnd) < 0) {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
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
                RichTextCell.CollapsedTextPart collapsedTextPart = quoteSpanArr[i].collapsedSpan;
                if (collapsedTextPart != null) {
                    text.removeSpan(collapsedTextPart);
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

    public URLSpanReplacement createUrlSpan(String str) {
        return new URLSpanReplacement(str, null);
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.allowTextEntitiesIntersection;
    }

    public String getCaption() {
        return this.caption;
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
                    TextStyleSpan textStyleSpan = textStyleSpanArr[i6];
                    int i7 = textStyleSpan.style.flags;
                    if ((i7 & 512) != 0) {
                        i7 |= 256;
                    }
                    if ((i7 & i4) != 0) {
                        int spanStart = text.getSpanStart(textStyleSpan);
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

    public boolean isNearRightCaption(int i) {
        Layout layout = getLayout();
        return layout != null && layout.getLineCount() > 0 && (layout.getLineCount() > 1 || layout.getLineRight(0) + ((float) i) >= ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())));
    }

    public final void lambda$makeSelectedDate$0(int i, int i2, int i3, int i4) {
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

    public final void lambda$makeSelectedUrl$3(int i, int i2, Runnable runnable, String str) {
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

    public final void lambda$showInputDialog$4(boolean z, EditTextBoldCursor editTextBoldCursor, String str, TextView textView) {
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z2 = z && (TextUtils.isEmpty(editTextBoldCursor.getText()) || TextUtils.equals(editTextBoldCursor.getText().toString(), str)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        OKLCH.m(textView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.7f).scaleY(z2 ? 1.0f : 0.7f), CubicBezierInterpolator.EASE_OUT_QUINT, 300L);
    }

    public final void lambda$showInputDialog$5(EditTextBoldCursor editTextBoldCursor, Runnable runnable, View view) {
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

    public final void lambda$showInputDialog$7(DialogInterface dialogInterface) {
        this.creationLinkDialog = null;
        requestFocus();
    }

    public final void lambda$translateSelected$2(int i, int i2, CharSequence charSequence) {
        getText().replace(i, i2, charSequence);
        setSelection(i, charSequence.length() + i);
    }

    public void makeSelectedBold() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 1;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun, 0));
    }

    public void makeSelectedDate() {
        int selectionEnd;
        int i = 18;
        int selectionStart = this.selectionStart;
        if (selectionStart < 0 || (selectionEnd = this.selectionEnd) < 0) {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        Context context = getContext();
        EditTextCaption$$ExternalSyntheticLambda2 editTextCaption$$ExternalSyntheticLambda2 = new EditTextCaption$$ExternalSyntheticLambda2(this, selectionStart, selectionEnd);
        ChatActivity$$ExternalSyntheticLambda470 chatActivity$$ExternalSyntheticLambda470 = new ChatActivity$$ExternalSyntheticLambda470(21);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Pattern pattern = AlertsCreator.URL_PATTERN;
        if (context == null) {
            return;
        }
        int colorOrDefault = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTextBlack) : Theme.getColor(null, Theme.key_dialogTextBlack, false);
        int colorOrDefault2 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogBackground) : Theme.getColor(null, Theme.key_dialogBackground, false);
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_sheet_other);
        } else {
            Theme.getColor(null, Theme.key_sheet_other, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_player_actionBarSelector);
        } else {
            Theme.getColor(null, Theme.key_player_actionBarSelector, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuItem);
        } else {
            Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuBackground);
        } else {
            Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_listSelector);
        } else {
            Theme.getColor(null, Theme.key_listSelector, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_buttonText);
        } else {
            Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButton);
        } else {
            Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButtonPressed);
        } else {
            Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i2 = calendar.get(1);
        int i3 = colorOrDefault2;
        NumberPicker numberPicker = new NumberPicker(context, 18, resourcesProvider);
        numberPicker.setTextColor(colorOrDefault);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(31);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda21(22));
        NumberPicker numberPicker2 = new NumberPicker(context, 18, resourcesProvider);
        numberPicker2.setTextColor(colorOrDefault);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        numberPicker2.setItemCount(5);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(239);
        numberPicker2.setValue(120);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker2.setFormatter(new LaunchActivity$$ExternalSyntheticLambda9(calendar, i2, 3));
        NumberPicker numberPicker3 = new NumberPicker(context, 18, resourcesProvider);
        numberPicker3.setContentDescriptionCallback(new ChatActivity$$ExternalSyntheticLambda29(2));
        numberPicker3.setWrapSelectorWheel(true);
        numberPicker3.setAllItemsCount(24);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(colorOrDefault);
        numberPicker3.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(23);
        numberPicker3.setFormatter(new ChatActivity$$ExternalSyntheticLambda131(i));
        NumberPicker numberPicker4 = new NumberPicker(context, 18, resourcesProvider);
        numberPicker4.setContentDescriptionCallback(new ChatActivity$$ExternalSyntheticLambda29(3));
        numberPicker4.setWrapSelectorWheel(true);
        numberPicker4.setAllItemsCount(60);
        numberPicker4.setItemCount(5);
        numberPicker4.setTextColor(colorOrDefault);
        numberPicker4.setTextOffset(-AndroidUtilities.dp(10.0f));
        numberPicker4.setMinValue(0);
        numberPicker4.setMaxValue(59);
        numberPicker4.setValue(0);
        numberPicker4.setFormatter(new ChatActivity$$ExternalSyntheticLambda131(20));
        calendar.setTimeInMillis(jCurrentTimeMillis);
        numberPicker4.setValue(calendar.get(12));
        numberPicker3.setValue(calendar.get(11));
        numberPicker.setValue(calendar.get(5));
        numberPicker2.setValue(calendar.get(2) + 120);
        Text text = new Text(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        text.maxWidth = AndroidUtilities.dp(100.0f);
        text.setText(text.layout.getText());
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        text.align();
        text.maxLines = 1;
        text.setText(text.layout.getText());
        text.paint.setColor(colorOrDefault);
        Text text2 = new Text(":", 18.0f, null);
        text2.maxWidth = AndroidUtilities.dp(100.0f);
        text2.setText(text2.layout.getText());
        text2.align();
        text2.maxLines = 1;
        text2.setText(text2.layout.getText());
        text2.paint.setColor(colorOrDefault);
        FrameLayout frameLayout = new FrameLayout(context);
        AlertsCreator.AnonymousClass35 anonymousClass35 = new AlertsCreator.AnonymousClass35(context, numberPicker2, numberPicker, numberPicker3, numberPicker4);
        anonymousClass35.setOrientation(1);
        frameLayout.addView(anonymousClass35, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        anonymousClass35.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(colorOrDefault);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
        GroupCallActivity.AnonymousClass61 anonymousClass61 = new GroupCallActivity.AnonymousClass61(context, text2, numberPicker4, 4);
        anonymousClass61.setOrientation(0);
        anonymousClass61.setWeightSum(1.0f);
        anonymousClass35.addView(anonymousClass61, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        StarsController$$ExternalSyntheticLambda104 starsController$$ExternalSyntheticLambda104 = new StarsController$$ExternalSyntheticLambda104(buttonWithCounterView, numberPicker, numberPicker2, numberPicker3, numberPicker4);
        anonymousClass61.addView(numberPicker, LayoutHelper.createLinear(0.2f, 0, 270));
        anonymousClass61.addView(numberPicker2, LayoutHelper.createLinear(0.4f, 0, 270));
        anonymousClass61.addView(numberPicker3, LayoutHelper.createLinear(0.2f, 0, 270));
        anonymousClass61.addView(numberPicker4, LayoutHelper.createLinear(0.2f, 0, 270));
        numberPicker.setOnValueChangedListener(starsController$$ExternalSyntheticLambda104);
        numberPicker2.setOnValueChangedListener(starsController$$ExternalSyntheticLambda104);
        numberPicker3.setOnValueChangedListener(starsController$$ExternalSyntheticLambda104);
        numberPicker4.setOnValueChangedListener(starsController$$ExternalSyntheticLambda104);
        boolean[] zArr = {true};
        buttonWithCounterView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        buttonWithCounterView.setRoundRadius(24);
        anonymousClass35.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        buttonWithCounterView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda17(zArr, numberPicker, numberPicker2, numberPicker3, numberPicker4, editTextCaption$$ExternalSyntheticLambda2, new int[1], builder));
        bottomSheet.customView = frameLayout;
        bottomSheet.show();
        bottomSheet.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda18(0, chatActivity$$ExternalSyntheticLambda470, zArr));
        bottomSheet.setBackgroundColor(i3);
        bottomSheet.fixNavigationBar(i3);
        AlertsCreator.checkFormattedDateInput(buttonWithCounterView, numberPicker, numberPicker2, numberPicker3, numberPicker4);
    }

    public void makeSelectedItalic() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 2;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun, 0));
    }

    public void makeSelectedMono() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 4;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        applyTextStyleToSelection(null);
    }

    public void makeSelectedSpoiler() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 256;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 8;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun, 0));
    }

    public void makeSelectedUnderline() {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 16;
        applyTextStyleToSelection(new TextStyleSpan(textStyleRun, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        EditTextCaptionDelegate editTextCaptionDelegate = this.delegate;
        if (editTextCaptionDelegate != null) {
            editTextCaptionDelegate.onSpansChanged();
        }
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
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
        if (this.rightText == null || length() == 0 || (layout = getLayout()) == null || layout.getLineCount() <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.rightText.draw(layout.getLineRight(0), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, this.hintColor, canvas2);
        }
        canvas2.restore();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.caption)) {
            String str = this.caption;
            if (Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfo.setHintText(str);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
            }
        }
        ArrayList actionList = accessibilityNodeInfoCompat.getActionList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat) actionList.get(i);
            if (((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.mAction).getId() == 268435456) {
                accessibilityNodeInfoCompat.mInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.mAction);
                break;
            }
        }
        if (hasSelection()) {
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, R.id.menu_spoiler, LocaleController.getString(R.string.Spoiler), null));
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, R.id.menu_bold, LocaleController.getString(R.string.Bold), null));
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, R.id.menu_italic, LocaleController.getString(R.string.Italic), null));
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, R.id.menu_mono, LocaleController.getString(R.string.Mono), null));
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, R.id.menu_strike, LocaleController.getString(R.string.Strike), null));
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, R.id.menu_underline, LocaleController.getString(R.string.Underline), null));
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, R.id.menu_link, LocaleController.getString(R.string.CreateLink), null));
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, R.id.menu_regular, LocaleController.getString(R.string.Regular), null));
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, R.id.menu_date, LocaleController.getString(R.string.FormattedDate), null));
        }
    }

    public void onLineCountChanged(int i, int i2) {
    }

    @Override
    public void onMeasure(int i, int i2) {
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
        int i3 = iIndexOf + 1;
        CharSequence charSequenceSubSequence = text.subSequence(0, i3);
        int iCeil = (int) Math.ceil(paint.measureText(text, 0, i3));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        this.userNameLength = charSequenceSubSequence.length();
        int i4 = measuredWidth - iCeil;
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.caption, paint, i4, TextUtils.TruncateAt.END);
        this.xOffset = iCeil;
        try {
            StaticLayout staticLayout = new StaticLayout(charSequenceEllipsize, getPaint(), i4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.captionLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.xOffset = (int) (this.xOffset + (-this.captionLayout.getLineLeft(0)));
            }
            this.yOffset = ((getMeasuredHeight() - this.captionLayout.getLineBottom(0)) / 2) + AndroidUtilities.dp(0.5f);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
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
                    if (quoteStyleSpanArr == null || quoteStyleSpanArr.length <= 0) {
                        QuoteSpan.normalizeQuotes(spannableStringBuilder);
                    } else {
                        QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr2 = (QuoteSpan.QuoteStyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), QuoteSpan.QuoteStyleSpan.class);
                        for (int i2 = 0; i2 < quoteStyleSpanArr2.length; i2++) {
                            spannableStringBuilder.removeSpan(quoteStyleSpanArr2[i2]);
                            spannableStringBuilder.removeSpan(quoteStyleSpanArr2[i2].span);
                        }
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

    @Override
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return performMenuAction(i) || super.performAccessibilityAction(i, bundle);
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
            int i5 = textStyleSpan.style.flags;
            if ((i5 & i) != 0) {
                int spanStart = text.getSpanStart(textStyleSpan);
                int spanEnd = text.getSpanEnd(textStyleSpan);
                text.removeSpan(textStyleSpan);
                TextStyleSpan.TextStyleRun textStyleRun = textStyleSpan.style;
                if (spanStart < i2) {
                    text.setSpan(new TextStyleSpan(new TextStyleSpan.TextStyleRun(textStyleRun), 0), spanStart, i2, 33);
                }
                if (spanEnd > iMin) {
                    text.setSpan(new TextStyleSpan(new TextStyleSpan.TextStyleRun(textStyleRun), 0), iMin, spanEnd, 33);
                }
                int iMax = Math.max(spanStart, i2);
                int iMin2 = Math.min(spanEnd, iMin);
                int i6 = i5 & (~i);
                if (i6 != 0 && iMax < iMin2) {
                    TextStyleSpan.TextStyleRun textStyleRun2 = new TextStyleSpan.TextStyleRun(textStyleRun);
                    textStyleRun2.flags = i6;
                    text.setSpan(new TextStyleSpan(textStyleRun2, 0), iMax, iMin2, 33);
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

    public void setAllowTextEntitiesIntersection(boolean z) {
        this.allowTextEntitiesIntersection = z;
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

    @Override
    public void setHintColor(int i) {
        super.setHintColor(i);
        this.hintColor = i;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new Text(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i, int i2) {
        this.selectionStart = i;
        this.selectionEnd = i2;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z, InputDialogCallback inputDialogCallback) {
        showInputDialog(str, str2, str3, z, this.adaptiveCreateLinkDialog, inputDialogCallback);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(callback);
        ActionMode.Callback anonymousClass5 = anonymousClass4;
        if (Build.VERSION.SDK_INT >= 23) {
            anonymousClass5 = new TextSelectionHelper.AnonymousClass5(anonymousClass4, callback);
        }
        return super.startActionMode(anonymousClass5);
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
        if ((getCurrentStyle(selectionStart, selectionEnd) & i) != 0) {
            removeStyle(i, selectionStart, selectionEnd);
            return;
        }
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
    }

    public void translateSelected() {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart < 0 || (selectionEnd = this.selectionEnd) < 0) {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        CharSequence charSequenceSubSequence = getText().subSequence(selectionStart, selectionEnd);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        TranslateAlert3 translateAlert3 = new TranslateAlert3(getContext(), safeLastFragment != null ? safeLastFragment.getResourceProvider() : null);
        translateAlert3.text = charSequenceSubSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(charSequenceSubSequence.toString(), new ProfileGooeyView$$ExternalSyntheticLambda0(translateAlert3, 29), new ContactsActivity$$ExternalSyntheticLambda18(8));
        }
        translateAlert3.onUseListener = new EditTextCaption$$ExternalSyntheticLambda0(this, selectionStart, selectionEnd);
        translateAlert3.show();
        setSelection(selectionStart, selectionEnd);
    }

    public void makeSelectedQuote(boolean z) {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart < 0 || (selectionEnd = this.selectionEnd) < 0) {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        int iPutQuoteToEditable = QuoteSpan.putQuoteToEditable(getText(), selectionStart, selectionEnd, z);
        if (iPutQuoteToEditable >= 0) {
            setSelection(iPutQuoteToEditable);
            resetFontMetricsCache();
        }
        invalidateQuotes(true);
        invalidateSpoilers();
    }

    public void makeSelectedUrl(Runnable runnable) {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart < 0 || (selectionEnd = this.selectionEnd) < 0) {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new EditTextCaption$$ExternalSyntheticLambda1(this, selectionStart, selectionEnd, runnable));
    }

    public void showInputDialog(String str, String str2, String str3, boolean z, boolean z2, InputDialogCallback inputDialogCallback) {
        CharSequence charSequenceCoerceToText;
        ?? builder = z2 ? new AlertDialogDecor.Builder(getContext(), 0, this.resourcesProvider) : new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = str;
        ?? frameLayout = new FrameLayout(getContext());
        final WebActionBar.AnonymousClass4 anonymousClass4 = new WebActionBar.AnonymousClass4(getContext(), 2);
        String str4 = str3 == null ? "" : str3;
        anonymousClass4.setTextSize(1, 18.0f);
        anonymousClass4.setText(str4);
        anonymousClass4.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        anonymousClass4.setHintText(str2);
        anonymousClass4.setHeaderHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, this.resourcesProvider));
        anonymousClass4.setSingleLine(true);
        anonymousClass4.setFocusable(true);
        anonymousClass4.setTransformHintToHeader(true);
        anonymousClass4.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, this.resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, this.resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, this.resourcesProvider));
        anonymousClass4.setImeOptions(6);
        anonymousClass4.setBackgroundDrawable(null);
        anonymousClass4.requestFocus();
        anonymousClass4.setPadding(0, 0, 0, 0);
        anonymousClass4.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
        anonymousClass4.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, this.resourcesProvider));
        frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(-1, -1, 119));
        TextView textView = new TextView(getContext());
        zzkk.m(12.0f, 1, textView);
        textView.setPadding(zzlm.m(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, this.resourcesProvider);
        textView.setTextColor(color);
        int iDp = AndroidUtilities.dp(6.0f);
        int iMultAlpha = Theme.multAlpha(0.12f, color);
        int iMultAlpha2 = Theme.multAlpha(0.15f, color);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, iMultAlpha, iMultAlpha2, iMultAlpha2));
        ScaleStateListAnimator.apply(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z ? 0 : 8);
        ChatActivity$$ExternalSyntheticLambda488 chatActivity$$ExternalSyntheticLambda488 = new ChatActivity$$ExternalSyntheticLambda488(this, z, anonymousClass4, str4, textView, 13);
        textView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(this, anonymousClass4, chatActivity$$ExternalSyntheticLambda488, 20));
        anonymousClass4.addTextChangedListener(new ArticleViewer.AnonymousClass16(chatActivity$$ExternalSyntheticLambda488, 11));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequenceCoerceToText = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequenceCoerceToText = null;
            }
            if (charSequenceCoerceToText != null) {
                anonymousClass4.setText(charSequenceCoerceToText);
                anonymousClass4.setSelection(0, anonymousClass4.getText().length());
            }
        }
        chatActivity$$ExternalSyntheticLambda488.run();
        builder.setView(frameLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), new RateCallLayout$$ExternalSyntheticLambda1(4, inputDialogCallback, anonymousClass4));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        if (z2) {
            this.creationLinkDialog = alertDialog;
            alertDialog.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 14));
            final int i = 0;
            this.creationLinkDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i) {
                        case 0:
                            EditTextCaption.lambda$showInputDialog$8(anonymousClass4, dialogInterface);
                            break;
                        default:
                            EditTextCaption.lambda$showInputDialog$9(anonymousClass4, dialogInterface);
                            break;
                    }
                }
            });
            this.creationLinkDialog.showDelayed(250L);
        } else {
            final int i2 = 1;
            builder.show().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i2) {
                        case 0:
                            EditTextCaption.lambda$showInputDialog$8(anonymousClass4, dialogInterface);
                            break;
                        default:
                            EditTextCaption.lambda$showInputDialog$9(anonymousClass4, dialogInterface);
                            break;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass4.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int iDp2 = AndroidUtilities.dp(24.0f);
            marginLayoutParams.leftMargin = iDp2;
            marginLayoutParams.rightMargin = iDp2;
            marginLayoutParams.height = AndroidUtilities.dp(36.0f);
            anonymousClass4.setLayoutParams(marginLayoutParams);
        }
        anonymousClass4.setSelection(0, anonymousClass4.getText().length());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(callback);
        ActionMode.Callback anonymousClass5 = anonymousClass4;
        if (Build.VERSION.SDK_INT >= 23) {
            anonymousClass5 = new TextSelectionHelper.AnonymousClass5(anonymousClass4, callback);
        }
        return super.startActionMode(anonymousClass5, i);
    }
}
