package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class hs0 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.w10 {
    public final int f48491a;
    public final js0 f48492b;

    public hs0(js0 js0Var, int i7) {
        this.f48491a = i7;
        this.f48492b = js0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f48491a) {
            case 0:
                this.f48492b.d0();
                return;
            default:
                this.f48492b.finishFragment();
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
            boolean z10 = !s8Var.f31780e.h;
            js0 js0Var = this.f48492b;
            js0Var.f49058n = z10;
            s8Var.setChecked(z10);
            js0Var.d.f35742g3.O(true);
            js0Var.a0(true);
        }
    }
}
