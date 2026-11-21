package org.telegram.ui;

import android.text.TextUtils;
public final class dh0 implements ts, s9 {
    public final fh0 f46968a;

    public dh0(fh0 fh0Var) {
        this.f46968a = fh0Var;
    }

    @Override
    public void J(String str) {
        String c10 = vf.c.c(str);
        if (!TextUtils.isEmpty(c10)) {
            org.telegram.messenger.mp.u1(this.f46968a.f30170a).f2().a(c10, null, new fi.e(20));
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
        fh0 fh0Var = this.f46968a;
        fh0Var.f47736y1 = true;
        String str = psVar.f50967c;
        fh0Var.I1.setText(str);
        fh0Var.N0(str, psVar);
        fh0Var.f47736y1 = false;
        org.telegram.messenger.g0.h3(new hf0(this, 1), 300L);
        fh0Var.K1.requestFocus();
        eh0 eh0Var = fh0Var.K1;
        eh0Var.setSelection(eh0Var.length());
    }

    @Override
    public boolean c1(String str, k9 k9Var) {
        return false;
    }

    @Override
    public void S0(org.telegram.messenger.ur urVar) {
    }

    @Override
    public void onDismiss() {
    }
}
