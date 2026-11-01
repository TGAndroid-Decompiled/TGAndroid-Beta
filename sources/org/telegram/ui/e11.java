package org.telegram.ui;

import android.view.View;
public final class e11 implements r0.m, org.telegram.ui.ActionBar.u1 {
    public final int f36714a;
    public final h11 f36715b;

    public e11(h11 h11Var, int i10) {
        this.f36714a = i10;
        this.f36715b = h11Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        h11 h11Var = this.f36715b;
        h11Var.e = I0;
        h11Var.f37619c.setPadding(I0.f7766a, I0.f7767b, I0.f7768c, I0.d);
        h11Var.f37617b.requestLayout();
        return r0.j1.f46142b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36714a) {
            case 1:
                org.telegram.ui.ActionBar.x1 x1Var2 = this.f36715b.f37620c0;
                if (x1Var2 != null) {
                    x1Var2.dismiss();
                    return;
                }
                return;
            default:
                h11 h11Var = this.f36715b;
                org.telegram.ui.ActionBar.x1 x1Var3 = h11Var.f37620c0;
                if (x1Var3 != null) {
                    x1Var3.dismiss();
                    h11Var.f37620c0 = null;
                }
                h11Var.dismiss();
                return;
        }
    }
}
