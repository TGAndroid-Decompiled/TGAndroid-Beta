package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class mw0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final int f35764a;
    public final nw0 f35765b;

    public mw0(nw0 nw0Var, int i10) {
        this.f35764a = i10;
        this.f35765b = nw0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35764a) {
            case 0:
                this.f35765b.Y();
                return;
            default:
                this.f35765b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        nw0 nw0Var = this.f35765b;
        nw0Var.getClass();
        if (((org.telegram.ui.Components.x51) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.e.h;
            nw0Var.f36101r = z10;
            w8Var.setChecked(z10);
            nw0Var.d.Y2.N(true);
            nw0Var.V(true);
        }
    }
}
