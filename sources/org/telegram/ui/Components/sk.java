package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class sk implements InputFilter {
    public final int f28849a;
    public final View f28850b;

    public sk(int i10, View view) {
        this.f28849a = i10;
        this.f28850b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        switch (this.f28849a) {
            case 0:
                return cl.Q((cl) this.f28850b, charSequence, i10, i11, spanned, i12, i13);
            default:
                xy0 xy0Var = (xy0) this.f28850b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(xy0Var.getText()) || i12 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
