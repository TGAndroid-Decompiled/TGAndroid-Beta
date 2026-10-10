package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class vk implements InputFilter {
    public final int f31868a;
    public final View f31869b;

    public vk(int i10, View view) {
        this.f31868a = i10;
        this.f31869b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        switch (this.f31868a) {
            case 0:
                return gl.Q((gl) this.f31869b, charSequence, i10, i11, spanned, i12, i13);
            default:
                bz0 bz0Var = (bz0) this.f31869b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(bz0Var.getText()) || i12 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
