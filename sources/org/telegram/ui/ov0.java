package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class ov0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final int f41251a;
    public final pv0 f41252b;

    public ov0(pv0 pv0Var, int i9) {
        this.f41251a = i9;
        this.f41252b = pv0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f41251a) {
            case 0:
                this.f41252b.X();
                return;
            default:
                this.f41252b.finishFragment();
                return;
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        pv0 pv0Var = this.f41252b;
        pv0Var.getClass();
        if (((org.telegram.ui.Components.l41) obj).d == 1) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z10 = !t8Var.f25711e.h;
            pv0Var.f41603r = z10;
            t8Var.setChecked(z10);
            pv0Var.d.U2.N(true);
            pv0Var.U(true);
        }
    }
}
