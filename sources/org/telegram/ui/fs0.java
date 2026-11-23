package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class fs0 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.u10 {
    public final int f47979a;
    public final hs0 f47980b;

    public fs0(hs0 hs0Var, int i7) {
        this.f47979a = i7;
        this.f47980b = hs0Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f47979a) {
            case 0:
                this.f47980b.d0();
                return;
            default:
                this.f47980b.finishFragment();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.n41) obj).d == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z10 = !r8Var.f31813e.h;
            hs0 hs0Var = this.f47980b;
            hs0Var.f48624n = z10;
            r8Var.setChecked(z10);
            hs0Var.d.f35323g3.O(true);
            hs0Var.a0(true);
        }
    }
}
