package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class pk implements InputFilter {
    public final int f38609a;
    public final View f38610b;

    public pk(int i7, View view) {
        this.f38609a = i7;
        this.f38610b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f38609a) {
            case 0:
                return zk.S((zk) this.f38610b, charSequence, i7, i10, spanned, i11, i12);
            default:
                nw0 nw0Var = (nw0) this.f38610b;
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
