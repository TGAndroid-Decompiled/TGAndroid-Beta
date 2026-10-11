package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class vk implements InputFilter {
    public final int f31831a;
    public final View f31832b;

    public vk(int i10, View view) {
        this.f31831a = i10;
        this.f31832b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        switch (this.f31831a) {
            case 0:
                return gl.Q((gl) this.f31832b, charSequence, i10, i11, spanned, i12, i13);
            default:
                cz0 cz0Var = (cz0) this.f31832b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(cz0Var.getText()) || i12 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
