package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class js0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final int f47067a;
    public final ks0 f47068b;

    public js0(ks0 ks0Var, int i7) {
        this.f47067a = i7;
        this.f47068b = ks0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47067a) {
            case 0:
                this.f47068b.d0();
                return;
            default:
                this.f47068b.finishFragment();
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
            boolean z9 = !r8Var.f30225e.h;
            ks0 ks0Var = this.f47068b;
            ks0Var.f47409n = z9;
            r8Var.setChecked(z9);
            ks0Var.d.f37496f3.O(true);
            ks0Var.a0(true);
        }
    }
}
