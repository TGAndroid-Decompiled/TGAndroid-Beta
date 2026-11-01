package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class ak implements InputFilter {
    public final int f24409a;
    public final View f24410b;

    public ak(int i10, View view) {
        this.f24409a = i10;
        this.f24410b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        switch (this.f24409a) {
            case 0:
                return kk.Q((kk) this.f24410b, charSequence, i10, i11, spanned, i12, i13);
            default:
                gx0 gx0Var = (gx0) this.f24410b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(gx0Var.getText()) || i12 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
