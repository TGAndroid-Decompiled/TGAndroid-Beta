package org.telegram.ui;

import android.view.View;
public final class e11 implements r0.m, org.telegram.ui.ActionBar.u1 {
    public final int f36891a;
    public final i11 f36892b;

    public e11(i11 i11Var, int i10) {
        this.f36891a = i10;
        this.f36892b = i11Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        i11 i11Var = this.f36892b;
        i11Var.e = I0;
        i11Var.f38086c.setPadding(I0.f7765a, I0.f7766b, I0.f7767c, I0.d);
        i11Var.f38084b.requestLayout();
        return r0.j1.f46131b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36891a) {
            case 1:
                org.telegram.ui.ActionBar.x1 x1Var2 = this.f36892b.f38087c0;
                if (x1Var2 != null) {
                    x1Var2.dismiss();
                    return;
                }
                return;
            default:
                i11 i11Var = this.f36892b;
                org.telegram.ui.ActionBar.x1 x1Var3 = i11Var.f38087c0;
                if (x1Var3 != null) {
                    x1Var3.dismiss();
                    i11Var.f38087c0 = null;
                }
                i11Var.dismiss();
                return;
        }
    }
}
