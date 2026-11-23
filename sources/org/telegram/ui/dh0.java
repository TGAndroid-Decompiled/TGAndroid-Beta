package org.telegram.ui;

import android.text.TextUtils;
public final class dh0 implements ss, s9 {
    public final fh0 f46931a;

    public dh0(fh0 fh0Var) {
        this.f46931a = fh0Var;
    }

    @Override
    public void J(String str) {
        String c10 = vf.c.c(str);
        if (!TextUtils.isEmpty(c10)) {
            org.telegram.messenger.np.u1(this.f46931a.f30139a).f2().a(c10, null, new fi.e(20));
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
        fh0 fh0Var = this.f46931a;
        fh0Var.f47708y1 = true;
        String str = psVar.f50904c;
        fh0Var.I1.setText(str);
        fh0Var.N0(str, psVar);
        fh0Var.f47708y1 = false;
        org.telegram.messenger.g0.h3(new hf0(this, 1), 300L);
        fh0Var.K1.requestFocus();
        eh0 eh0Var = fh0Var.K1;
        eh0Var.setSelection(eh0Var.length());
    }

    @Override
    public boolean c1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public void S0(org.telegram.messenger.vr vrVar) {
    }

    @Override
    public void onDismiss() {
    }
}
