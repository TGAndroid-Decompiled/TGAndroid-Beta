package org.telegram.ui;

import android.view.View;
public final class oz0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final int f48571a;
    public final rz0 f48572b;

    public oz0(rz0 rz0Var, int i7) {
        this.f48571a = i7;
        this.f48572b = rz0Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        rz0 rz0Var = this.f48572b;
        rz0Var.f49577e = I0;
        rz0Var.f49574c.setPadding(I0.f15120a, I0.f15121b, I0.f15122c, I0.d);
        rz0Var.f49572b.requestLayout();
        return r0.k1.f54200b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48571a) {
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.f48572b.f49575c0;
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    return;
                }
                return;
            default:
                rz0 rz0Var = this.f48572b;
                org.telegram.ui.ActionBar.u1 u1Var3 = rz0Var.f49575c0;
                if (u1Var3 != null) {
                    u1Var3.dismiss();
                    rz0Var.f49575c0 = null;
                }
                rz0Var.dismiss();
                return;
        }
    }
}
