package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class h30 implements TextWatcher {
    public final b50 f37701a;

    public h30(b50 b50Var) {
        this.f37701a = b50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        b50 b50Var = this.f37701a;
        b50Var.f36072r5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i11 = b50Var.U1;
        if (codePointCount + 25 > i11) {
            str = "" + (i11 - codePointCount);
        } else {
            str = null;
        }
        b50Var.D1.a();
        b50Var.D1.setText(str);
        org.telegram.ui.Components.f6 f6Var = b50Var.D1;
        if (codePointCount >= i11) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        f6Var.setTextColor(i10);
        if (codePointCount > i11) {
            org.telegram.messenger.t2.APP_ERROR.a();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
