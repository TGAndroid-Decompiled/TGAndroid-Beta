package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

public abstract class up implements InputFilter {

    public final int f33163a;

    public up(int i10) {
        this.f33163a = i10;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        int iCodePointCount = this.f33163a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i12, i13));
        if (iCodePointCount <= 0) {
            return "";
        }
        if (iCodePointCount >= Character.codePointCount(charSequence, i10, i11)) {
            return null;
        }
        int i14 = iCodePointCount + i10;
        return (Character.isHighSurrogate(charSequence.charAt(i14 + (-1))) && (i14 = i14 + (-1)) == i10) ? "" : charSequence.subSequence(i10, i14);
    }
}
