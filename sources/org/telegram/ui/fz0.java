package org.telegram.ui;

import android.view.View;
public final class fz0 implements r0.m, org.telegram.ui.ActionBar.p1 {
    public final int f45410a;
    public final iz0 f45411b;

    public fz0(iz0 iz0Var, int i3) {
        this.f45410a = i3;
        this.f45411b = iz0Var;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        iz0 iz0Var = this.f45411b;
        iz0Var.f46463e = I0;
        iz0Var.f46460c.setPadding(I0.f14495a, I0.f14496b, I0.f14497c, I0.d);
        iz0Var.f46458b.requestLayout();
        return r0.k1.f54025b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f45410a) {
            case 1:
                org.telegram.ui.ActionBar.s1 s1Var2 = this.f45411b.f46462d0;
                if (s1Var2 != null) {
                    s1Var2.dismiss();
                    return;
                }
                return;
            default:
                iz0 iz0Var = this.f45411b;
                org.telegram.ui.ActionBar.s1 s1Var3 = iz0Var.f46462d0;
                if (s1Var3 != null) {
                    s1Var3.dismiss();
                    iz0Var.f46462d0 = null;
                }
                iz0Var.dismiss();
                return;
        }
    }
}
