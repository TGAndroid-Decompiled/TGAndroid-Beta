package org.telegram.ui.Components;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import android.text.style.SuggestionSpan;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
public class EditTextSuggestionsFix implements TextWatcher {
    private HashMap<Object, Pair<Integer, Integer>> beforeSpans;
    private int beforeSuggestionsCount;
    private boolean ignore;

    @Override
    public void afterTextChanged(Editable editable) {
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.ignore) {
            return;
        }
        this.beforeSpans = saveSpans(charSequence);
        this.beforeSuggestionsCount = charSequence instanceof Spannable ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.ignore) {
            return;
        }
        int length = charSequence instanceof Spannable ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
        HashMap<Object, Pair<Integer, Integer>> hashMap = this.beforeSpans;
        if (hashMap != null) {
            if ((length > 0 || this.beforeSuggestionsCount > 0) && i == 0 && i2 == i3) {
                this.ignore = true;
                applySpans(charSequence, hashMap);
                this.ignore = false;
            }
        }
    }

    private static HashMap<Object, Pair<Integer, Integer>> saveSpans(CharSequence charSequence) {
        HashMap<Object, Pair<Integer, Integer>> hashMap = new HashMap<>();
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(0, spannable.length(), CharacterStyle.class);
            ParagraphStyle[] paragraphStyleArr = (ParagraphStyle[]) spannable.getSpans(0, spannable.length(), ParagraphStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0) {
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (characterStyle != null && !(characterStyle instanceof SuggestionSpan)) {
                        hashMap.put(characterStyle, new Pair<>(Integer.valueOf(spannable.getSpanStart(characterStyle)), Integer.valueOf(spannable.getSpanEnd(characterStyle))));
                    }
                }
            }
            if (paragraphStyleArr != null && paragraphStyleArr.length > 0) {
                for (ParagraphStyle paragraphStyle : paragraphStyleArr) {
                    if (paragraphStyle != null && !(paragraphStyle instanceof SuggestionSpan)) {
                        hashMap.put(paragraphStyle, new Pair<>(Integer.valueOf(spannable.getSpanStart(paragraphStyle)), Integer.valueOf(spannable.getSpanEnd(paragraphStyle))));
                    }
                }
            }
            return hashMap;
        }
        return hashMap;
    }

    private static void applySpans(CharSequence charSequence, HashMap<Object, Pair<Integer, Integer>> hashMap) {
        if (hashMap != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (Map.Entry<Object, Pair<Integer, Integer>> entry : hashMap.entrySet()) {
                if (spannable.getSpanStart(entry.getKey()) == -1) {
                    spannable.setSpan(entry.getKey(), ((Integer) entry.getValue().first).intValue(), ((Integer) entry.getValue().second).intValue(), 33);
                }
            }
        }
    }
}
