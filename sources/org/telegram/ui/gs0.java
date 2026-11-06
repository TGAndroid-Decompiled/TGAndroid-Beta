package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class gs0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final int f46089a;
    public final hs0 f46090b;

    public gs0(hs0 hs0Var, int i7) {
        this.f46089a = i7;
        this.f46090b = hs0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f46089a) {
            case 0:
                this.f46090b.d0();
                return;
            default:
                this.f46090b.finishFragment();
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.w31) obj).d == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z9 = !r8Var.f30205e.h;
            hs0 hs0Var = this.f46090b;
            hs0Var.f46489n = z9;
            r8Var.setChecked(z9);
            hs0Var.d.f36781f3.O(true);
            hs0Var.a0(true);
        }
    }
}
