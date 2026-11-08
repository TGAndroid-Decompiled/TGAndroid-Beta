package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class gs0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final int f46090a;
    public final hs0 f46091b;

    public gs0(hs0 hs0Var, int i7) {
        this.f46090a = i7;
        this.f46091b = hs0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f46090a) {
            case 0:
                this.f46091b.d0();
                return;
            default:
                this.f46091b.finishFragment();
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.x31) obj).d == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z9 = !r8Var.f30210e.h;
            hs0 hs0Var = this.f46091b;
            hs0Var.f46487n = z9;
            r8Var.setChecked(z9);
            hs0Var.d.f37190f3.O(true);
            hs0Var.a0(true);
        }
    }
}
