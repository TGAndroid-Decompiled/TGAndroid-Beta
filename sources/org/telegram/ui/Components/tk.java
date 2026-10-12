package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class tk implements InputFilter {
    public final int f29410a;
    public final View f29411b;

    public tk(int i10, View view) {
        this.f29410a = i10;
        this.f29411b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        switch (this.f29410a) {
            case 0:
                return dl.Q((dl) this.f29411b, charSequence, i10, i11, spanned, i12, i13);
            default:
                wy0 wy0Var = (wy0) this.f29411b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(wy0Var.getText()) || i12 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
