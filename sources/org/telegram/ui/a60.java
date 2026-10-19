package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a60 implements org.telegram.ui.Components.l20, org.telegram.ui.ActionBar.a2, r0.n {
    public final int f35278a;
    public final l60 f35279b;

    public a60(l60 l60Var, int i10) {
        this.f35278a = i10;
        this.f35279b = l60Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        l60 l60Var = this.f35279b;
        l60Var.m0 = i10;
        ai.w1 w1Var = l60Var.F;
        if (w1Var != null) {
            w1Var.setPadding(0, 0, 0, i10);
        }
        l60Var.j0();
        l60Var.h0();
        return r0.k1.f44824b;
    }

    @Override
    public void a(int i10) {
        l60 l60Var = this.f35279b;
        l60Var.f38798b.a(Math.min(i10, l60Var.f38801c0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35278a) {
            case 1:
                this.f35279b.o0();
                return;
            default:
                this.f35279b.finishFragment();
                return;
        }
    }
}
