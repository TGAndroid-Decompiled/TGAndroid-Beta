package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

public abstract class CodepointsLengthInputFilter implements InputFilter {
    public final int mMax;

    public CodepointsLengthInputFilter(int i) {
        this.mMax = i;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int iCodePointCount = this.mMax - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i3, i4));
        if (iCodePointCount <= 0) {
            return "";
        }
        if (iCodePointCount >= Character.codePointCount(charSequence, i, i2)) {
            return null;
        }
        int i5 = iCodePointCount + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }
}
