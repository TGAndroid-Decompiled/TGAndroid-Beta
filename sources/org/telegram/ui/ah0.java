package org.telegram.ui;

import android.text.TextUtils;
public final class ah0 implements rs, r9 {
    public final ch0 f43695a;

    public ah0(ch0 ch0Var) {
        this.f43695a = ch0Var;
    }

    @Override
    public void M(String str) {
        String c10 = vf.c.c(str);
        if (!TextUtils.isEmpty(c10)) {
            org.telegram.messenger.qp.s1(this.f43695a.f28621a).d2().a(c10, null, new di.e(19));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(25));
        }
    }

    @Override
    public String R0() {
        return null;
    }

    @Override
    public void b(os osVar) {
        ch0 ch0Var = this.f43695a;
        ch0Var.f44322u1 = true;
        String str = osVar.f48512c;
        ch0Var.E1.setText(str);
        ch0Var.M0(str, osVar);
        ch0Var.f44322u1 = false;
        org.telegram.messenger.g0.i3(new gf0(this, 1), 300L);
        ch0Var.G1.requestFocus();
        bh0 bh0Var = ch0Var.G1;
        bh0Var.setSelection(bh0Var.length());
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
