package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class pt0 implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.p20 {
    public final int f40612a;
    public final qt0 f40613b;

    public pt0(qt0 qt0Var, int i10) {
        this.f40612a = i10;
        this.f40613b = qt0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f40612a) {
            case 0:
                this.f40613b.d0();
                return;
            default:
                this.f40613b.finishFragment();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        if (((org.telegram.ui.Components.b51) obj).d == 1) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z10 = !t8Var.e.h;
            qt0 qt0Var = this.f40613b;
            qt0Var.f40903n = z10;
            t8Var.setChecked(z10);
            qt0Var.d.f31183f3.O(true);
            qt0Var.a0(true);
        }
    }
}
