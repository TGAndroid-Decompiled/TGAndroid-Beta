package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o60 implements org.telegram.ui.Components.e20, org.telegram.ui.ActionBar.c2, r0.o {
    public final int f39604a;
    public final z60 f39605b;

    public o60(z60 z60Var, int i10) {
        this.f39604a = i10;
        this.f39605b = z60Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        z60 z60Var = this.f39605b;
        z60Var.f43838j0 = i10;
        eg.t3 t3Var = z60Var.C;
        if (t3Var != null) {
            t3Var.setPadding(0, 0, 0, i10);
        }
        z60Var.j0();
        z60Var.h0();
        return r0.m1.f46451b;
    }

    @Override
    public void a(int i10) {
        z60 z60Var = this.f39605b;
        z60Var.f43826b.a(Math.min(i10, z60Var.Z));
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39604a) {
            case 1:
                this.f39605b.o0();
                return;
            default:
                this.f39605b.finishFragment();
                return;
        }
    }
}
