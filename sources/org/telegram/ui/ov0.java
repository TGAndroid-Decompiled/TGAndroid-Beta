package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class ov0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final int f41231a;
    public final pv0 f41232b;

    public ov0(pv0 pv0Var, int i10) {
        this.f41231a = i10;
        this.f41232b = pv0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f41231a) {
            case 0:
                this.f41232b.Y();
                return;
            default:
                this.f41232b.finishFragment();
                return;
        }
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        pv0 pv0Var = this.f41232b;
        pv0Var.getClass();
        if (((org.telegram.ui.Components.w41) obj).d == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z10 = !q8Var.f25083e.h;
            pv0Var.f41478r = z10;
            q8Var.setChecked(z10);
            pv0Var.d.U2.N(true);
            pv0Var.V(true);
        }
    }
}
