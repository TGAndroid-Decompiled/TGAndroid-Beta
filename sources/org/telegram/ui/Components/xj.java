package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class xj implements InputFilter {
    public final int f40373a;
    public final View f40374b;

    public xj(int i3, View view) {
        this.f40373a = i3;
        this.f40374b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i3, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f40373a) {
            case 0:
                return hk.R((hk) this.f40374b, charSequence, i3, i10, spanned, i11, i12);
            default:
                aw0 aw0Var = (aw0) this.f40374b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(aw0Var.getText()) || i11 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
