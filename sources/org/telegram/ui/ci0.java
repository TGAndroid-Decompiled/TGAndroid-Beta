package org.telegram.ui;

import android.text.TextUtils;
public final class ci0 implements pt, t9 {
    public final ei0 f36326a;

    public ci0(ei0 ei0Var) {
        this.f36326a = ei0Var;
    }

    @Override
    public void L(String str) {
        String b10 = gf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            org.telegram.messenger.wp.r1(this.f36326a.f21584a).c2().a(b10, null, new ag.z0(17));
        } else {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.n0(11));
        }
    }

    @Override
    public String P0() {
        return null;
    }

    @Override
    public void c(mt mtVar) {
        ei0 ei0Var = this.f36326a;
        ei0Var.f36847u1 = true;
        String str = mtVar.f39613c;
        ei0Var.E1.setText(str);
        ei0Var.M0(str, mtVar);
        ei0Var.f36847u1 = false;
        org.telegram.messenger.i0.h3(new kg0(this, 1), 300L);
        ei0Var.G1.requestFocus();
        di0 di0Var = ei0Var.G1;
        di0Var.setSelection(di0Var.length());
    }

    @Override
    public boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override
    public void X0(org.telegram.messenger.js jsVar) {
    }

    @Override
    public void onDismiss() {
    }
}
