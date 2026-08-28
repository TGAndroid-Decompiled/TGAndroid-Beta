package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
public abstract class wp implements InputFilter {
    public final int f34304a;

    public wp(int i9) {
        this.f34304a = i9;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        int codePointCount = this.f34304a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i11, i12));
        if (codePointCount <= 0) {
            return "";
        }
        if (codePointCount >= Character.codePointCount(charSequence, i9, i10)) {
            return null;
        }
        int i13 = codePointCount + i9;
        if (Character.isHighSurrogate(charSequence.charAt(i13 - 1)) && i13 - 1 == i9) {
            return "";
        }
        return charSequence.subSequence(i9, i13);
    }
}
