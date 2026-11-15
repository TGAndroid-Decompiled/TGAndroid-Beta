package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class gk implements InputFilter {
    public final int f34998a;
    public final View f34999b;

    public gk(int i7, View view) {
        this.f34998a = i7;
        this.f34999b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f34998a) {
            case 0:
                return qk.S((qk) this.f34999b, charSequence, i7, i10, spanned, i11, i12);
            default:
                ew0 ew0Var = (ew0) this.f34999b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(ew0Var.getText()) || i11 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
