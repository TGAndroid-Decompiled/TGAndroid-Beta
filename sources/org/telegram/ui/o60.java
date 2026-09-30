package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o60 implements org.telegram.ui.Components.g20, org.telegram.ui.ActionBar.z1, r0.n {
    public final int f36198a;
    public final z60 f36199b;

    public o60(z60 z60Var, int i10) {
        this.f36198a = i10;
        this.f36199b = z60Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        z60 z60Var = this.f36199b;
        z60Var.m0 = i10;
        ai.w7 w7Var = z60Var.F;
        if (w7Var != null) {
            w7Var.setPadding(0, 0, 0, i10);
        }
        z60Var.j0();
        z60Var.h0();
        return r0.l1.f42244b;
    }

    @Override
    public void a(int i10) {
        z60 z60Var = this.f36199b;
        z60Var.f40478b.a(Math.min(i10, z60Var.f40481c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36198a) {
            case 1:
                this.f36199b.o0();
                return;
            default:
                this.f36199b.finishFragment();
                return;
        }
    }
}
