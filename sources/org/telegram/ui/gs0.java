package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class gs0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.v10 {
    public final int f48088a;
    public final is0 f48089b;

    public gs0(is0 is0Var, int i7) {
        this.f48088a = i7;
        this.f48089b = is0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48088a) {
            case 0:
                this.f48089b.d0();
                return;
            default:
                this.f48089b.finishFragment();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.l41) obj).d == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z10 = !s8Var.f31783e.h;
            is0 is0Var = this.f48089b;
            is0Var.f48795n = z10;
            s8Var.setChecked(z10);
            is0Var.d.f34607g3.O(true);
            is0Var.a0(true);
        }
    }
}
