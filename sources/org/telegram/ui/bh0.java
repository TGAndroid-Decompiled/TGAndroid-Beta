package org.telegram.ui;

import android.text.TextUtils;
public final class bh0 implements ss, r9 {
    public final dh0 f44065a;

    public bh0(dh0 dh0Var) {
        this.f44065a = dh0Var;
    }

    @Override
    public void M(String str) {
        String c10 = vf.c.c(str);
        if (!TextUtils.isEmpty(c10)) {
            org.telegram.messenger.qp.s1(this.f44065a.f28669a).d2().a(c10, null, new di.e(19));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(25));
        }
    }

    @Override
    public String R0() {
        return null;
    }

    @Override
    public void b(ps psVar) {
        dh0 dh0Var = this.f44065a;
        dh0Var.f44993x1 = true;
        String str = psVar.f48828c;
        dh0Var.H1.setText(str);
        dh0Var.M0(str, psVar);
        dh0Var.f44993x1 = false;
        org.telegram.messenger.g0.i3(new hf0(this, 1), 300L);
        dh0Var.J1.requestFocus();
        ch0 ch0Var = dh0Var.J1;
        ch0Var.setSelection(ch0Var.length());
    }

    @Override
    public boolean h1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public void V0(org.telegram.messenger.zr zrVar) {
    }

    @Override
    public void onDismiss() {
    }
}
