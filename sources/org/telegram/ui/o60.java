package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o60 implements org.telegram.ui.Components.d20, org.telegram.ui.ActionBar.z1, r0.n {
    public final int f36036a;
    public final z60 f36037b;

    public o60(z60 z60Var, int i10) {
        this.f36036a = i10;
        this.f36037b = z60Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        z60 z60Var = this.f36037b;
        z60Var.m0 = i10;
        ai.w7 w7Var = z60Var.F;
        if (w7Var != null) {
            w7Var.setPadding(0, 0, 0, i10);
        }
        z60Var.j0();
        z60Var.h0();
        return r0.l1.f42125b;
    }

    @Override
    public void a(int i10) {
        z60 z60Var = this.f36037b;
        z60Var.f40352b.a(Math.min(i10, z60Var.f40355c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36036a) {
            case 1:
                this.f36037b.o0();
                return;
            default:
                this.f36037b.finishFragment();
                return;
        }
    }
}
