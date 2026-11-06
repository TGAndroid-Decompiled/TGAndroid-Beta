package org.telegram.ui;

import android.view.View;
public final class oz0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final int f48578a;
    public final rz0 f48579b;

    public oz0(rz0 rz0Var, int i7) {
        this.f48578a = i7;
        this.f48579b = rz0Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        rz0 rz0Var = this.f48579b;
        rz0Var.f49599e = I0;
        rz0Var.f49596c.setPadding(I0.f15117a, I0.f15118b, I0.f15119c, I0.d);
        rz0Var.f49594b.requestLayout();
        return r0.k1.f54108b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48578a) {
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.f48579b.f49597c0;
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    return;
                }
                return;
            default:
                rz0 rz0Var = this.f48579b;
                org.telegram.ui.ActionBar.u1 u1Var3 = rz0Var.f49597c0;
                if (u1Var3 != null) {
                    u1Var3.dismiss();
                    rz0Var.f49597c0 = null;
                }
                rz0Var.dismiss();
                return;
        }
    }
}
