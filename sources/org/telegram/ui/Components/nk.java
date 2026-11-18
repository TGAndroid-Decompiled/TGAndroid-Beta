package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class nk implements InputFilter {
    public final int f37799a;
    public final View f37800b;

    public nk(int i7, View view) {
        this.f37799a = i7;
        this.f37800b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f37799a) {
            case 0:
                return xk.S((xk) this.f37800b, charSequence, i7, i10, spanned, i11, i12);
            default:
                lw0 lw0Var = (lw0) this.f37800b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(lw0Var.getText()) || i11 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
