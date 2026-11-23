package org.telegram.ui;

import android.text.TextUtils;
public final class bh0 implements ss, s9 {
    public final dh0 f46048a;

    public bh0(dh0 dh0Var) {
        this.f46048a = dh0Var;
    }

    @Override
    public void H(String str) {
        String c10 = vf.c.c(str);
        if (!TextUtils.isEmpty(c10)) {
            org.telegram.messenger.mp.u1(this.f46048a.f30223a).f2().a(c10, null, new fi.e(20));
        } else {
            org.telegram.messenger.g0.g3(new cd0(1));
        }
    }

    @Override
    public boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override
    public void d(ps psVar) {
        dh0 dh0Var = this.f46048a;
        dh0Var.f47140y1 = true;
        String str = psVar.f51137c;
        dh0Var.I1.setText(str);
        dh0Var.N0(str, psVar);
        dh0Var.f47140y1 = false;
        org.telegram.messenger.g0.h3(new gf0(this, 1), 300L);
        dh0Var.K1.requestFocus();
        ch0 ch0Var = dh0Var.K1;
        ch0Var.setSelection(ch0Var.length());
    }

    @Override
    public String w0() {
        return null;
    }

    @Override
    public void E0(org.telegram.messenger.ur urVar) {
    }

    @Override
    public void onDismiss() {
    }
}
