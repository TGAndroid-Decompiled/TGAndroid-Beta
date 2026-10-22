package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
public final class qk implements InputFilter {
    public final int f29628a;
    public final View f29629b;

    public qk(int i10, View view) {
        this.f29628a = i10;
        this.f29629b = view;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        switch (this.f29628a) {
            case 0:
                return al.Q((al) this.f29629b, charSequence, i10, i11, spanned, i12, i13);
            default:
                ty0 ty0Var = (ty0) this.f29629b;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(ty0Var.getText()) || i12 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
        }
    }
}
