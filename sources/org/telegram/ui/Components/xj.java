package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class xj implements InputFilter {
    public final int f40312a;
    public final View f40313b;

    public xj(int i7, View view) {
        this.f40312a = i7;
        this.f40313b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f40312a) {
            case 0:
                return hk.R((hk) this.f40313b, charSequence, i7, i10, spanned, i11, i12);
            default:
                bw0 bw0Var = (bw0) this.f40313b;
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
