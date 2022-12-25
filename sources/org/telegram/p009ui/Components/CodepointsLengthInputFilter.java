package org.telegram.p009ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.messenger.BuildConfig;

public class CodepointsLengthInputFilter implements InputFilter {
    private final int mMax;

    public CodepointsLengthInputFilter(int i) {
        this.mMax = i;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int codePointCount = this.mMax - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i3, i4));
        if (codePointCount <= 0) {
            return BuildConfig.APP_CENTER_HASH;
        }
        if (codePointCount >= Character.codePointCount(charSequence, i, i2)) {
            return null;
        }
        int i5 = codePointCount + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? BuildConfig.APP_CENTER_HASH : charSequence.subSequence(i, i5);
    }
}
