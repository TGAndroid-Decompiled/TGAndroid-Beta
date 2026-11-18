package org.telegram.ui;

import android.text.TextUtils;
public final class ch0 implements ss, s9 {
    public final eh0 f46536a;

    public ch0(eh0 eh0Var) {
        this.f46536a = eh0Var;
    }

    @Override
    public void J(String str) {
        String c10 = vf.c.c(str);
        if (!TextUtils.isEmpty(c10)) {
            org.telegram.messenger.mp.u1(this.f46536a.f30189a).f2().a(c10, null, new fi.e(20));
        } else {
            org.telegram.messenger.g0.g3(new cd0(1));
        }
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public void b(ps psVar) {
        eh0 eh0Var = this.f46536a;
        eh0Var.f47273y1 = true;
        String str = psVar.f51001c;
        eh0Var.I1.setText(str);
        eh0Var.N0(str, psVar);
        eh0Var.f47273y1 = false;
        org.telegram.messenger.g0.h3(new hf0(this, 1), 300L);
        eh0Var.K1.requestFocus();
        dh0 dh0Var = eh0Var.K1;
        dh0Var.setSelection(dh0Var.length());
    }

    @Override
    public boolean c1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public void S0(org.telegram.messenger.ur urVar) {
    }

    @Override
    public void onDismiss() {
    }
}
