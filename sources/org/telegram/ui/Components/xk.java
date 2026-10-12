package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class xk implements InputFilter {
    public final int f32782a;
    public final View f32783b;

    public xk(int i10, View view) {
        this.f32782a = i10;
        this.f32783b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        switch (this.f32782a) {
            case 0:
                return il.Q((il) this.f32783b, charSequence, i10, i11, spanned, i12, i13);
            default:
                gz0 gz0Var = (gz0) this.f32783b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(gz0Var.getText()) || i12 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
