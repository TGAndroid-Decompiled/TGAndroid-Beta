package org.telegram.ui;

import android.view.View;
public final class pz0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final int f51197a;
    public final sz0 f51198b;

    public pz0(sz0 sz0Var, int i7) {
        this.f51197a = i7;
        this.f51198b = sz0Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51197a) {
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.f51198b.f52182d0;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    return;
                }
                return;
            default:
                sz0 sz0Var = this.f51198b;
                org.telegram.ui.ActionBar.t1 t1Var3 = sz0Var.f52182d0;
                if (t1Var3 != null) {
                    t1Var3.dismiss();
                    sz0Var.f52182d0 = null;
                }
                sz0Var.dismiss();
                return;
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        sz0 sz0Var = this.f51198b;
        sz0Var.f52183e = I0;
        sz0Var.f52180c.setPadding(I0.f15978a, I0.f15979b, I0.f15980c, I0.d);
        sz0Var.f52178b.requestLayout();
        return r0.l1.f56380b;
    }
}
