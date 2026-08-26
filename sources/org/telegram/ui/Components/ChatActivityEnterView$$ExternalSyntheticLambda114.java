package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

public final class ChatActivityEnterView$$ExternalSyntheticLambda114 implements InputFilter {
    @Override
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        for (int i5 = i; i5 < i2; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '\n' || cCharAt == '\r') {
                StringBuilder sb = new StringBuilder(i2 - i);
                while (i < i2) {
                    char cCharAt2 = charSequence.charAt(i);
                    if (cCharAt2 != '\n' && cCharAt2 != '\r') {
                        sb.append(cCharAt2);
                    }
                    i++;
                }
                return sb;
            }
        }
        return null;
    }
}
