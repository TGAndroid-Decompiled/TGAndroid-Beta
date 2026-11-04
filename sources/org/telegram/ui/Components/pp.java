package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
public abstract class pp implements InputFilter {
    public final int f37215a;

    public pp(int i3) {
        this.f37215a = i3;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i3, int i10, Spanned spanned, int i11, int i12) {
        int codePointCount = this.f37215a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i11, i12));
        if (codePointCount <= 0) {
            return "";
        }
        if (codePointCount >= Character.codePointCount(charSequence, i3, i10)) {
            return null;
        }
        int i13 = codePointCount + i3;
        if (Character.isHighSurrogate(charSequence.charAt(i13 - 1)) && i13 - 1 == i3) {
            return "";
        }
        return charSequence.subSequence(i3, i13);
    }
}
