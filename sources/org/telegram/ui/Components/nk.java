package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class nk implements InputFilter {
    public final int f37839a;
    public final View f37840b;

    public nk(int i7, View view) {
        this.f37839a = i7;
        this.f37840b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f37839a) {
            case 0:
                return xk.S((xk) this.f37840b, charSequence, i7, i10, spanned, i11, i12);
            default:
                mw0 mw0Var = (mw0) this.f37840b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(mw0Var.getText()) || i11 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
