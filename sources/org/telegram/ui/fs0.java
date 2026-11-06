package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class fs0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final int f45694a;
    public final gs0 f45695b;

    public fs0(gs0 gs0Var, int i7) {
        this.f45694a = i7;
        this.f45695b = gs0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f45694a) {
            case 0:
                this.f45695b.d0();
                return;
            default:
                this.f45695b.finishFragment();
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.r31) obj).d == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z9 = !r8Var.f30205e.h;
            gs0 gs0Var = this.f45695b;
            gs0Var.f46068n = z9;
            r8Var.setChecked(z9);
            gs0Var.d.f35167f3.O(true);
            gs0Var.a0(true);
        }
    }
}
