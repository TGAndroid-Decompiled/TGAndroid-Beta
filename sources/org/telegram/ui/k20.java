package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class k20 implements TextWatcher {
    public final e40 f49283a;

    public k20(e40 e40Var) {
        this.f49283a = e40Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        e40 e40Var = this.f49283a;
        e40Var.f47433z5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i10 = e40Var.Y1;
        if (codePointCount + 25 > i10) {
            str = "" + (i10 - codePointCount);
        } else {
            str = null;
        }
        e40Var.H1.a();
        e40Var.H1.setText(str);
        org.telegram.ui.Components.n6 n6Var = e40Var.H1;
        if (codePointCount >= i10) {
            i7 = -1280137;
        } else {
            i7 = -1;
        }
        n6Var.setTextColor(i7);
        if (codePointCount > i10) {
            org.telegram.messenger.q2.APP_ERROR.a();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
