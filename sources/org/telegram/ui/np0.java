package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

public final class np0 implements org.telegram.ui.Components.x4, org.telegram.ui.Components.rk0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {

    public final int f40894a;

    public final aq0 f40895b;

    public np0(aq0 aq0Var, int i10) {
        this.f40894a = i10;
        this.f40895b = aq0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f40894a) {
            case 0:
                this.f40895b.e0(i10, z10);
                break;
            default:
                this.f40895b.e0(i10, z10);
                break;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        aq0 aq0Var = this.f40895b;
        if (aq0Var.U) {
            aq0Var.a0(view, aq0Var.F.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.q5)) {
            return false;
        }
        org.telegram.ui.Components.bl0 bl0Var = aq0Var.R;
        boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
        aq0Var.T = z10;
        bl0Var.d(view, i10, z10);
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        aq0 aq0Var = this.f40895b;
        eq0 eq0Var = aq0Var.f36616p0;
        if (eq0Var == null) {
            aq0Var.Z();
            return;
        }
        switch (eq0Var.f37809a) {
            case 0:
                fq0 fq0Var = eq0Var.f37810b;
                fq0Var.f38185a.Z();
                fq0Var.f38186b.Z();
                break;
            default:
                fq0 fq0Var2 = eq0Var.f37810b;
                fq0Var2.f38185a.Z();
                fq0Var2.f38186b.Z();
                break;
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        aq0 aq0Var = this.f40895b;
        aq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = aq0Var.f36609i0) != null && n1Var.isShowing()) {
            aq0Var.f36609i0.d(true);
        }
    }
}
