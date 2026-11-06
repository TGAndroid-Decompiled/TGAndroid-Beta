package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class yj implements InputFilter {
    public final int f40638a;
    public final View f40639b;

    public yj(int i7, View view) {
        this.f40638a = i7;
        this.f40639b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f40638a) {
            case 0:
                return ik.R((ik) this.f40639b, charSequence, i7, i10, spanned, i11, i12);
            default:
                bw0 bw0Var = (bw0) this.f40639b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(bw0Var.getText()) || i11 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
