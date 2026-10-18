package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c60 implements org.telegram.ui.Components.l20, org.telegram.ui.ActionBar.a2, r0.n {
    public final int f35845a;
    public final n60 f35846b;

    public c60(n60 n60Var, int i10) {
        this.f35845a = i10;
        this.f35846b = n60Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        n60 n60Var = this.f35846b;
        n60Var.m0 = i10;
        ai.w1 w1Var = n60Var.F;
        if (w1Var != null) {
            w1Var.setPadding(0, 0, 0, i10);
        }
        n60Var.j0();
        n60Var.h0();
        return r0.k1.f44872b;
    }

    @Override
    public void a(int i10) {
        n60 n60Var = this.f35846b;
        n60Var.f39356b.a(Math.min(i10, n60Var.f39359c0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35845a) {
            case 1:
                this.f35846b.o0();
                return;
            default:
                this.f35846b.finishFragment();
                return;
        }
    }
}
