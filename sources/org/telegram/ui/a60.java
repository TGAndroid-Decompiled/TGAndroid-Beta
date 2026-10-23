package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a60 implements org.telegram.ui.Components.l20, org.telegram.ui.ActionBar.a2, r0.n {
    public final int f35291a;
    public final l60 f35292b;

    public a60(l60 l60Var, int i10) {
        this.f35291a = i10;
        this.f35292b = l60Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        l60 l60Var = this.f35292b;
        l60Var.m0 = i10;
        ai.w1 w1Var = l60Var.F;
        if (w1Var != null) {
            w1Var.setPadding(0, 0, 0, i10);
        }
        l60Var.j0();
        l60Var.h0();
        return r0.k1.f44838b;
    }

    @Override
    public void a(int i10) {
        l60 l60Var = this.f35292b;
        l60Var.f38807b.a(Math.min(i10, l60Var.f38810c0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35291a) {
            case 1:
                this.f35292b.o0();
                return;
            default:
                this.f35292b.finishFragment();
                return;
        }
    }
}
