package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q60 implements org.telegram.ui.Components.d20, org.telegram.ui.ActionBar.a2, r0.n {
    public final int f36300a;
    public final b70 f36301b;

    public q60(b70 b70Var, int i10) {
        this.f36300a = i10;
        this.f36301b = b70Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        b70 b70Var = this.f36301b;
        b70Var.m0 = i10;
        ai.w7 w7Var = b70Var.F;
        if (w7Var != null) {
            w7Var.setPadding(0, 0, 0, i10);
        }
        b70Var.j0();
        b70Var.h0();
        return r0.l1.f41806b;
    }

    @Override
    public void a(int i10) {
        b70 b70Var = this.f36301b;
        b70Var.f31985b.a(Math.min(i10, b70Var.f31988c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36300a) {
            case 1:
                this.f36301b.o0();
                return;
            default:
                this.f36301b.finishFragment();
                return;
        }
    }
}
