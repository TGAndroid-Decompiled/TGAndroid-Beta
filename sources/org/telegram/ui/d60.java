package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class d60 implements org.telegram.ui.Components.q10, org.telegram.ui.ActionBar.a2, r0.o {

    public final int f37278a;

    public final o60 f37279b;

    public d60(o60 o60Var, int i10) {
        this.f37278a = i10;
        this.f37279b = o60Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        o60 o60Var = this.f37279b;
        o60Var.f41006i0 = i10;
        hh.h1 h1Var = o60Var.B;
        if (h1Var != null) {
            h1Var.setPadding(0, 0, 0, i10);
        }
        o60Var.j0();
        o60Var.h0();
        return r0.m1.f46618b;
    }

    @Override
    public void a(int i10) {
        o60 o60Var = this.f37279b;
        o60Var.f40995b.a(Math.min(i10, o60Var.Y));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37278a) {
            case 1:
                this.f37279b.o0();
                break;
            default:
                this.f37279b.finishFragment();
                break;
        }
    }
}
