package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class is0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final int f46751a;
    public final js0 f46752b;

    public is0(js0 js0Var, int i7) {
        this.f46751a = i7;
        this.f46752b = js0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f46751a) {
            case 0:
                this.f46752b.d0();
                return;
            default:
                this.f46752b.finishFragment();
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.y31) obj).d == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z9 = !r8Var.f30214e.h;
            js0 js0Var = this.f46752b;
            js0Var.f47075n = z9;
            r8Var.setChecked(z9);
            js0Var.d.f37556f3.O(true);
            js0Var.a0(true);
        }
    }
}
