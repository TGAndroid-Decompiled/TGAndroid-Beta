package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class yj implements InputFilter {
    public final int f40725a;
    public final View f40726b;

    public yj(int i7, View view) {
        this.f40725a = i7;
        this.f40726b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f40725a) {
            case 0:
                return ik.R((ik) this.f40726b, charSequence, i7, i10, spanned, i11, i12);
            default:
                cw0 cw0Var = (cw0) this.f40726b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(cw0Var.getText()) || i11 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
