package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class gs0 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.v10 {
    public final int f48165a;
    public final is0 f48166b;

    public gs0(is0 is0Var, int i7) {
        this.f48165a = i7;
        this.f48166b = is0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f48165a) {
            case 0:
                this.f48166b.d0();
                return;
            default:
                this.f48166b.finishFragment();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.o41) obj).d == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z10 = !s8Var.f31811e.h;
            is0 is0Var = this.f48166b;
            is0Var.f48817n = z10;
            s8Var.setChecked(z10);
            is0Var.d.f35796g3.O(true);
            is0Var.a0(true);
        }
    }
}
