package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class d20 implements TextWatcher {
    public final x30 f44519a;

    public d20(x30 x30Var) {
        this.f44519a = x30Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i3;
        x30 x30Var = this.f44519a;
        x30Var.f51795s5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i10 = x30Var.V1;
        if (codePointCount + 25 > i10) {
            str = "" + (i10 - codePointCount);
        } else {
            str = null;
        }
        x30Var.E1.a();
        x30Var.E1.setText(str);
        org.telegram.ui.Components.h6 h6Var = x30Var.E1;
        if (codePointCount >= i10) {
            i3 = -1280137;
        } else {
            i3 = -1;
        }
        h6Var.setTextColor(i3);
        if (codePointCount > i10) {
            org.telegram.messenger.p2.APP_ERROR.a();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
