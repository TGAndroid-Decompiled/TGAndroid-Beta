package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e60 implements org.telegram.ui.Components.l20, org.telegram.ui.ActionBar.z1, r0.n {
    public final int f36827a;
    public final p60 f36828b;

    public e60(p60 p60Var, int i10) {
        this.f36827a = i10;
        this.f36828b = p60Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        p60 p60Var = this.f36828b;
        p60Var.m0 = i10;
        ai.w1 w1Var = p60Var.F;
        if (w1Var != null) {
            w1Var.setPadding(0, 0, 0, i10);
        }
        p60Var.j0();
        p60Var.h0();
        return r0.k1.f45250b;
    }

    @Override
    public void a(int i10) {
        p60 p60Var = this.f36828b;
        p60Var.f40358b.a(Math.min(i10, p60Var.f40361c0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36827a) {
            case 1:
                this.f36828b.o0();
                return;
            default:
                this.f36828b.finishFragment();
                return;
        }
    }
}
