package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
public abstract class pp implements InputFilter {
    public final int f37041a;

    public pp(int i7) {
        this.f37041a = i7;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        int codePointCount = this.f37041a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i11, i12));
        if (codePointCount <= 0) {
            return "";
        }
        if (codePointCount >= Character.codePointCount(charSequence, i7, i10)) {
            return null;
        }
        int i13 = codePointCount + i7;
        if (Character.isHighSurrogate(charSequence.charAt(i13 - 1)) && i13 - 1 == i7) {
            return "";
        }
        return charSequence.subSequence(i7, i13);
    }
}
