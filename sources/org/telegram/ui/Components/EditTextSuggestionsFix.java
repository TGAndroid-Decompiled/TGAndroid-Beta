package org.telegram.ui.Components;

import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import android.text.style.SuggestionSpan;
public class EditTextSuggestionsFix implements TextWatcher {
    private SpannableStringBuilder before;
    private int beforeSuggestionsCount;

    @Override
    public void afterTextChanged(Editable editable) {
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.before = new SpannableStringBuilder(charSequence);
        this.beforeSuggestionsCount = charSequence instanceof Spannable ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence instanceof Spannable ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
        SpannableStringBuilder spannableStringBuilder = this.before;
        if (spannableStringBuilder == null || this.beforeSuggestionsCount == length || i != 0 || i2 != i3) {
            return;
        }
        Spannable spannable = (Spannable) charSequence;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (characterStyle != null && !(characterStyle instanceof SuggestionSpan) && spannable.getSpanStart(characterStyle) == -1) {
                    spannable.setSpan(characterStyle, this.before.getSpanStart(characterStyle), this.before.getSpanEnd(characterStyle), 33);
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = this.before;
        ParagraphStyle[] paragraphStyleArr = (ParagraphStyle[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ParagraphStyle.class);
        if (paragraphStyleArr == null || paragraphStyleArr.length <= 0) {
            return;
        }
        for (ParagraphStyle paragraphStyle : paragraphStyleArr) {
            if (paragraphStyle != null && spannable.getSpanStart(paragraphStyle) == -1) {
                spannable.setSpan(paragraphStyle, this.before.getSpanStart(paragraphStyle), this.before.getSpanEnd(paragraphStyle), 33);
            }
        }
    }
}
