package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class l20 implements TextWatcher {
    public final f40 f49411a;

    public l20(f40 f40Var) {
        this.f49411a = f40Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        f40 f40Var = this.f49411a;
        f40Var.f47511z5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i10 = f40Var.Y1;
        if (codePointCount + 25 > i10) {
            str = "" + (i10 - codePointCount);
        } else {
            str = null;
        }
        f40Var.H1.a();
        f40Var.H1.setText(str);
        org.telegram.ui.Components.n6 n6Var = f40Var.H1;
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
