package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class i20 implements TextWatcher {
    public final c40 f47875a;

    public i20(c40 c40Var) {
        this.f47875a = c40Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        c40 c40Var = this.f47875a;
        c40Var.f45997z5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i10 = c40Var.Y1;
        if (codePointCount + 25 > i10) {
            str = "" + (i10 - codePointCount);
        } else {
            str = null;
        }
        c40Var.H1.a();
        c40Var.H1.setText(str);
        org.telegram.ui.Components.h6 h6Var = c40Var.H1;
        if (codePointCount >= i10) {
            i7 = -1280137;
        } else {
            i7 = -1;
        }
        h6Var.setTextColor(i7);
        if (codePointCount > i10) {
            org.telegram.messenger.p2.APP_ERROR.a();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
