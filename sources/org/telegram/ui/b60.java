package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b60 implements org.telegram.ui.Components.y10, org.telegram.ui.ActionBar.b2, r0.o {
    public final int f36698a;
    public final m60 f36699b;

    public b60(m60 m60Var, int i10) {
        this.f36698a = i10;
        this.f36699b = m60Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        m60 m60Var = this.f36699b;
        m60Var.f40454i0 = i10;
        bg.z3 z3Var = m60Var.B;
        if (z3Var != null) {
            z3Var.setPadding(0, 0, 0, i10);
        }
        m60Var.j0();
        m60Var.h0();
        return r0.m1.f46842b;
    }

    @Override
    public void a(int i10) {
        m60 m60Var = this.f36699b;
        m60Var.f40443b.a(Math.min(i10, m60Var.Y));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36698a) {
            case 1:
                this.f36699b.o0();
                return;
            default:
                this.f36699b.finishFragment();
                return;
        }
    }
}
