package org.telegram.ui;

import android.text.TextUtils;
public final class ei0 implements qt, t9 {
    public final gi0 f37064a;

    public ei0(gi0 gi0Var) {
        this.f37064a = gi0Var;
    }

    @Override
    public void L(String str) {
        String b10 = gf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            org.telegram.messenger.vp.r1(this.f37064a.f21583a).c2().a(b10, null, new ag.z0(17));
        } else {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(11));
        }
    }

    @Override
    public String P0() {
        return null;
    }

    @Override
    public void c(nt ntVar) {
        gi0 gi0Var = this.f37064a;
        gi0Var.f37570u1 = true;
        String str = ntVar.f40049c;
        gi0Var.E1.setText(str);
        gi0Var.M0(str, ntVar);
        gi0Var.f37570u1 = false;
        org.telegram.messenger.i0.h3(new mg0(this, 1), 300L);
        gi0Var.G1.requestFocus();
        fi0 fi0Var = gi0Var.G1;
        fi0Var.setSelection(fi0Var.length());
    }

    @Override
    public boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override
    public void X0(org.telegram.messenger.is isVar) {
    }

    @Override
    public void onDismiss() {
    }
}
