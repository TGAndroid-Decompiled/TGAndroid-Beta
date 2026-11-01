package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class g30 implements TextWatcher {
    public final a50 f37283a;

    public g30(a50 a50Var) {
        this.f37283a = a50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        a50 a50Var = this.f37283a;
        a50Var.f35656r5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i11 = a50Var.U1;
        if (codePointCount + 25 > i11) {
            str = "" + (i11 - codePointCount);
        } else {
            str = null;
        }
        a50Var.D1.a();
        a50Var.D1.setText(str);
        org.telegram.ui.Components.f6 f6Var = a50Var.D1;
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
