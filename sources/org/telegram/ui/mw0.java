package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class mw0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f38775a;
    public final nw0 f38776b;

    public mw0(nw0 nw0Var, int i10) {
        this.f38775a = i10;
        this.f38776b = nw0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38775a) {
            case 0:
                this.f38776b.X();
                return;
            default:
                this.f38776b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        nw0 nw0Var = this.f38776b;
        nw0Var.getClass();
        if (((org.telegram.ui.Components.g61) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.f23696e.h;
            nw0Var.f39071r = z10;
            w8Var.setChecked(z10);
            nw0Var.d.f25250f3.N(true);
            nw0Var.T(true);
        }
    }
}
