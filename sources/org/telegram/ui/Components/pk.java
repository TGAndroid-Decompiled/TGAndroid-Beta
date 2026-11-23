package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class pk implements InputFilter {
    public final int f38607a;
    public final View f38608b;

    public pk(int i7, View view) {
        this.f38607a = i7;
        this.f38608b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f38607a) {
            case 0:
                return zk.S((zk) this.f38608b, charSequence, i7, i10, spanned, i11, i12);
            default:
                nw0 nw0Var = (nw0) this.f38608b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(nw0Var.getText()) || i11 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
