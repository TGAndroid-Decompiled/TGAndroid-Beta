package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
public abstract class dq implements InputFilter {
    public final int f24338a;

    public dq(int i10) {
        this.f24338a = i10;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        int codePointCount = this.f24338a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i12, i13));
        if (codePointCount <= 0) {
            return "";
        }
        if (codePointCount >= Character.codePointCount(charSequence, i10, i11)) {
            return null;
        }
        int i14 = codePointCount + i10;
        if (Character.isHighSurrogate(charSequence.charAt(i14 - 1)) && i14 - 1 == i10) {
            return "";
        }
        return charSequence.subSequence(i10, i14);
    }
}
