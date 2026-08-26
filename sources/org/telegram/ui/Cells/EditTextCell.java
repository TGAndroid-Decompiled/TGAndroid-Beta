package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import android.text.style.SuggestionSpan;
import android.util.Pair;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.UsersSelectActivity;

public class EditTextCell extends FrameLayout {
    public boolean autofocused;
    public final AnonymousClass2 editText;
    public boolean focused;
    public boolean ignoreEditText;
    public final AnimatedTextView.AnimatedTextDrawable limit;
    public final AnimatedColor limitColor;
    public int limitCount;
    public final int maxLength;
    public boolean needDivider;
    public boolean showLimitWhenEmpty;
    public boolean showLimitWhenFocused;
    public int showLimitWhenNear;

    public final class AnonymousClass1 implements TextView.OnEditorActionListener {
        public final int $r8$classId;
        public final Object val$whenEnter;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.val$whenEnter = obj;
        }

        @Override
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            switch (this.$r8$classId) {
                case 0:
                    if (i != 6) {
                        return false;
                    }
                    ((Runnable) this.val$whenEnter).run();
                    return true;
                case 1:
                    ((SearchView) this.val$whenEnter).onSubmitQuery();
                    return true;
                case 2:
                    if (i != 6) {
                        return false;
                    }
                    ((ArticleViewer$$ExternalSyntheticLambda3) this.val$whenEnter).run();
                    return true;
                default:
                    ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.val$whenEnter;
                    if (i == 4) {
                        chatActivityEnterView.sendMessage();
                        return true;
                    }
                    if (keyEvent == null || i != 0 || keyEvent.isShiftPressed() || (!chatActivityEnterView.sendByEnter ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) || keyEvent.getAction() != 0 || chatActivityEnterView.editingMessageObject != null) {
                        return false;
                    }
                    chatActivityEnterView.sendMessage();
                    return true;
            }
        }
    }

    public final class AnonymousClass3 implements TextWatcher {
        public final int $r8$classId = 1;
        public Object this$0;
        public int val$maxLength;
        public boolean val$multiline;

        public AnonymousClass3() {
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            boolean zEquals;
            switch (this.$r8$classId) {
                case 0:
                    EditTextCell editTextCell = (EditTextCell) this.this$0;
                    if (!editTextCell.ignoreEditText) {
                        int i = this.val$maxLength;
                        if (i > 0 && editable != null && editable.length() > i) {
                            editTextCell.ignoreEditText = true;
                            CharSequence charSequenceSubSequence = editable.subSequence(0, i);
                            AnonymousClass2 anonymousClass2 = editTextCell.editText;
                            anonymousClass2.setText(charSequenceSubSequence);
                            anonymousClass2.setSelection(anonymousClass2.length());
                            editTextCell.ignoreEditText = false;
                        }
                        editTextCell.onTextChanged(editable);
                    }
                    if (!this.val$multiline) {
                        while (true) {
                            int iIndexOf = editable.toString().indexOf("\n");
                            if (iIndexOf >= 0) {
                                editable.delete(iIndexOf, iIndexOf + 1);
                            }
                        }
                    }
                    break;
                case 1:
                    break;
                default:
                    if (!this.val$multiline) {
                        LoginActivity.LoginActivityPhraseView loginActivityPhraseView = (LoginActivity.LoginActivityPhraseView) this.this$0;
                        loginActivityPhraseView.checkPaste(true);
                        AndroidUtilities.cancelRunOnUIThread(loginActivityPhraseView.dismissField);
                        loginActivityPhraseView.animateError(false);
                        if (TextUtils.isEmpty(editable)) {
                            loginActivityPhraseView.pasted = false;
                        }
                        String string = editable.toString();
                        if (loginActivityPhraseView.beginning == null) {
                            zEquals = true;
                        } else {
                            int length = string.length();
                            int i2 = 0;
                            while (i2 < length && string.charAt(i2) <= ' ') {
                                i2++;
                            }
                            if (i2 > 0 || length < string.length()) {
                                string = string.substring(i2, length);
                            }
                            String lowerCase = string.toLowerCase();
                            String lowerCase2 = loginActivityPhraseView.beginning.toLowerCase();
                            int iMin = Math.min(lowerCase.length(), lowerCase2.length());
                            if (iMin <= 0) {
                                zEquals = true;
                            } else {
                                zEquals = TextUtils.equals(lowerCase.substring(0, iMin), lowerCase2.substring(0, iMin));
                            }
                        }
                        if (!zEquals) {
                            loginActivityPhraseView.onInputError(true);
                            this.val$multiline = true;
                            UsersSelectActivity.AnonymousClass4 anonymousClass4 = loginActivityPhraseView.codeField;
                            boolean z = anonymousClass4.getSelectionEnd() >= anonymousClass4.getText().length();
                            if (!loginActivityPhraseView.pasted) {
                                String str = loginActivityPhraseView.beginning;
                                anonymousClass4.setText(str.substring(0, Utilities.clamp(this.val$maxLength, str.length(), 0)));
                                if (z) {
                                    anonymousClass4.setSelection(anonymousClass4.getText().length());
                                }
                            }
                            this.val$multiline = false;
                        }
                        break;
                    }
                    break;
            }
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 0:
                    EditTextCell editTextCell = (EditTextCell) this.this$0;
                    if (!editTextCell.ignoreEditText) {
                        editTextCell.autofocused = false;
                    }
                    break;
                case 1:
                    if (!this.val$multiline) {
                        HashMap map = new HashMap();
                        boolean z = charSequence instanceof Spannable;
                        if (z) {
                            Spannable spannable = (Spannable) charSequence;
                            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(0, spannable.length(), CharacterStyle.class);
                            ParagraphStyle[] paragraphStyleArr = (ParagraphStyle[]) spannable.getSpans(0, spannable.length(), ParagraphStyle.class);
                            if (characterStyleArr != null && characterStyleArr.length > 0) {
                                for (CharacterStyle characterStyle : characterStyleArr) {
                                    if (characterStyle != null && !(characterStyle instanceof SuggestionSpan)) {
                                        map.put(characterStyle, new Pair(Integer.valueOf(spannable.getSpanStart(characterStyle)), Integer.valueOf(spannable.getSpanEnd(characterStyle))));
                                    }
                                }
                            }
                            if (paragraphStyleArr != null && paragraphStyleArr.length > 0) {
                                for (ParagraphStyle paragraphStyle : paragraphStyleArr) {
                                    if (paragraphStyle != null && !(paragraphStyle instanceof SuggestionSpan)) {
                                        map.put(paragraphStyle, new Pair(Integer.valueOf(spannable.getSpanStart(paragraphStyle)), Integer.valueOf(spannable.getSpanEnd(paragraphStyle))));
                                    }
                                }
                            }
                        }
                        this.this$0 = map;
                        this.val$maxLength = z ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                        break;
                    }
                    break;
                default:
                    if (!this.val$multiline && charSequence != null && ((LoginActivity.LoginActivityPhraseView) this.this$0).beginning != null) {
                        String string = charSequence.toString();
                        int length = string.length();
                        int i4 = 0;
                        while (i4 < length && string.charAt(i4) <= ' ') {
                            i4++;
                        }
                        if (i4 > 0 || length < string.length()) {
                            string = string.substring(i4, length);
                        }
                        this.val$maxLength = string.length();
                    }
                    break;
            }
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 1:
                    if (!this.val$multiline) {
                        boolean z = charSequence instanceof Spannable;
                        int length = z ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                        HashMap map = (HashMap) this.this$0;
                        if (map != null) {
                            if ((length > 0 || this.val$maxLength > 0) && i == 0 && i2 == i3) {
                                this.val$multiline = true;
                                if (z) {
                                    Spannable spannable = (Spannable) charSequence;
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (spannable.getSpanStart(entry.getKey()) == -1) {
                                            spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                        }
                                    }
                                }
                                this.val$multiline = false;
                            }
                        }
                        break;
                    }
                    break;
            }
        }

        public AnonymousClass3(EditTextCell editTextCell, int i, boolean z) {
            this.this$0 = editTextCell;
            this.val$maxLength = i;
            this.val$multiline = z;
        }

        public AnonymousClass3(LoginActivity.LoginActivityPhraseView loginActivityPhraseView) {
            this.this$0 = loginActivityPhraseView;
        }

        private final void afterTextChanged$org$telegram$ui$Components$EditTextSuggestionsFix(Editable editable) {
        }

        private final void onTextChanged$org$telegram$ui$Cells$EditTextCell$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$LoginActivity$LoginActivityPhraseView$2(int i, int i2, int i3, CharSequence charSequence) {
        }
    }

    public final class AnonymousClass4 implements View.OnFocusChangeListener {
        public final int $r8$classId;
        public final ViewGroup this$0;

        public AnonymousClass4(ViewGroup viewGroup, int i) {
            this.$r8$classId = i;
            this.this$0 = viewGroup;
        }

        @Override
        public final void onFocusChange(View view, boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    EditTextCell editTextCell = (EditTextCell) this.this$0;
                    editTextCell.focused = z;
                    if (editTextCell.showLimitWhenFocused) {
                        editTextCell.updateLimitText();
                    }
                    editTextCell.onFocusChanged(z);
                    break;
                case 1:
                    SearchView searchView = (SearchView) this.this$0;
                    View.OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
                    if (onFocusChangeListener != null) {
                        onFocusChangeListener.onFocusChange(searchView, z);
                    }
                    break;
                default:
                    EditEmojiTextCell editEmojiTextCell = (EditEmojiTextCell) this.this$0;
                    editEmojiTextCell.focused = z;
                    if (editEmojiTextCell.showLimitWhenFocused) {
                        editEmojiTextCell.updateLimitText();
                    }
                    break;
            }
        }
    }

    public EditTextCell(Context context, String str, boolean z, final boolean z2, final int i, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.showLimitWhenNear = -1;
        this.limitColor = new AnimatedColor(this);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.limit = animatedTextDrawable;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextDrawable.moveAmplitude = 0.2f;
        animatedTextDrawable.animateDuration = 160L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.33f));
        animatedTextDrawable.gravity = 5;
        this.maxLength = i;
        ?? r1 = new EditTextCaption(context, resourcesProvider) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                EditTextCell editTextCell = EditTextCell.this;
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = editTextCell.limit;
                int i2 = editTextCell.limitColor.set(Theme.getColor(editTextCell.limitCount <= 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider), false);
                animatedTextDrawable2.textPaint.setColor(i2);
                animatedTextDrawable2.alpha = Color.alpha(i2);
                editTextCell.limit.setBounds(getScrollX(), getHeight() - Math.min(AndroidUtilities.dp(52.0f), getHeight()), AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
                editTextCell.limit.draw(canvas);
            }

            @Override
            public final void extendActionMode(ActionMode actionMode, Menu menu) {
                if (z2) {
                    int i2 = R.id.menu_bold;
                    if (menu.findItem(i2) != null) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        menu.removeItem(16908341);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                    int i3 = R.id.menu_groupbolditalic;
                    menu.add(i3, i2, 6, spannableStringBuilder);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
                    spannableStringBuilder2.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
                    menu.add(i3, R.id.menu_italic, 7, spannableStringBuilder2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 8;
                    spannableStringBuilder3.setSpan(new TextStyleSpan(textStyleRun, 0), 0, spannableStringBuilder3.length(), 33);
                    menu.add(i3, R.id.menu_strike, 8, spannableStringBuilder3);
                    menu.add(i3, R.id.menu_regular, 9, LocaleController.getString(R.string.Regular));
                }
            }

            @Override
            public final void onDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
                super.onDraw(canvas);
                canvas.restore();
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                super.onTextChanged(charSequence, i2, i3, i4);
                EditTextCell editTextCell = EditTextCell.this;
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = editTextCell.limit;
                if (animatedTextDrawable2 == null || i <= 0) {
                    return;
                }
                animatedTextDrawable2.cancelAnimation();
                editTextCell.updateLimitText();
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == EditTextCell.this.limit || super.verifyDrawable(drawable);
            }
        };
        this.editText = r1;
        animatedTextDrawable.setCallback(r1);
        r1.setTextSize(1, 17.0f);
        r1.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        r1.setTextColor(Theme.getColor(i2, resourcesProvider));
        r1.setBackground(null);
        if (z) {
            r1.setMaxLines(5);
            r1.setSingleLine(false);
        } else {
            r1.setMaxLines(1);
            r1.setSingleLine(true);
        }
        r1.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp((i > 0 ? 42 : 0) + 21), AndroidUtilities.dp(15.0f));
        r1.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        r1.setInputType((z ? 131072 : 0) | 573441);
        r1.setRawInputType((z ? 131072 : 0) | 573441);
        r1.setHint(str);
        r1.setCursorColor(Theme.getColor(i2, resourcesProvider));
        r1.setCursorSize(AndroidUtilities.dp(19.0f));
        r1.setCursorWidth(1.5f);
        r1.addTextChangedListener(new AnonymousClass3(this, i, z));
        r1.setOnFocusChangeListener(new AnonymousClass4(this, 0));
        addView((View) r1, LayoutHelper.createFrame(-1, -1, 48));
        updateLimitText();
    }

    public CharSequence getText() {
        return getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public final void hideKeyboardOnEnter() {
        EditTextCell$$ExternalSyntheticLambda0 editTextCell$$ExternalSyntheticLambda0 = new EditTextCell$$ExternalSyntheticLambda0(this, 0);
        AnonymousClass2 anonymousClass2 = this.editText;
        anonymousClass2.setImeOptions(6);
        anonymousClass2.setOnEditorActionListener(new AnonymousClass1(editTextCell$$ExternalSyntheticLambda0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    public void onFocusChanged(boolean z) {
    }

    public void onTextChanged(Editable editable) {
    }

    public void setDivider(boolean z) {
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setShowLimitOnFocus(boolean z) {
        this.showLimitWhenFocused = z;
    }

    public void setShowLimitWhenEmpty(boolean z) {
        this.showLimitWhenEmpty = z;
        if (z) {
            updateLimitText();
        }
    }

    public void setShowLimitWhenNear(int i) {
        this.showLimitWhenNear = i;
        updateLimitText();
    }

    public void setText(CharSequence charSequence) {
        this.ignoreEditText = true;
        AnonymousClass2 anonymousClass2 = this.editText;
        anonymousClass2.setText(charSequence);
        anonymousClass2.setSelection(anonymousClass2.getText().length());
        this.ignoreEditText = false;
    }

    public final void updateLimitText() {
        int i;
        if (this.editText == null) {
            return;
        }
        this.limitCount = this.maxLength - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.showLimitWhenEmpty) && ((!this.showLimitWhenFocused || (this.focused && !this.autofocused)) && ((i = this.showLimitWhenNear) == -1 || this.limitCount <= i))) {
            str = "" + this.limitCount;
        }
        this.limit.setText(str, true, true);
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.ignoreEditText = true;
        CharSequence textWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        AnonymousClass2 anonymousClass2 = this.editText;
        anonymousClass2.setText(textWithEntities);
        anonymousClass2.setSelection(anonymousClass2.getText().length());
        this.ignoreEditText = false;
    }
}
