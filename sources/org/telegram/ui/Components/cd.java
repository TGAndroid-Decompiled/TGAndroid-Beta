package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
public final class cd implements InputFilter {
    @Override
    public final CharSequence filter(CharSequence charSequence, int i3, int i10, Spanned spanned, int i11, int i12) {
        int i13 = ChatActivityEnterView.f31082t5;
        for (int i14 = i3; i14 < i10; i14++) {
            char charAt = charSequence.charAt(i14);
            if (charAt == '\n' || charAt == '\r') {
                StringBuilder sb2 = new StringBuilder(i10 - i3);
                while (i3 < i10) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 != '\n' && charAt2 != '\r') {
                        sb2.append(charAt2);
                    }
                    i3++;
                }
                return sb2;
            }
        }
        return null;
    }
}
