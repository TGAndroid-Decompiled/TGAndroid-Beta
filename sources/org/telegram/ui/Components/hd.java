package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

public final class hd implements InputFilter {
    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        int i14 = ChatActivityEnterView.f26070i5;
        for (int i15 = i10; i15 < i11; i15++) {
            char cCharAt = charSequence.charAt(i15);
            if (cCharAt == '\n' || cCharAt == '\r') {
                StringBuilder sb2 = new StringBuilder(i11 - i10);
                while (i10 < i11) {
                    char cCharAt2 = charSequence.charAt(i10);
                    if (cCharAt2 != '\n' && cCharAt2 != '\r') {
                        sb2.append(cCharAt2);
                    }
                    i10++;
                }
                return sb2;
            }
        }
        return null;
    }
}
