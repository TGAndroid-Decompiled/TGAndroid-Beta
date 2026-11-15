package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class ds0 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.x10 {
    public final int f46473a;
    public final es0 f46474b;

    public ds0(es0 es0Var, int i7) {
        this.f46473a = i7;
        this.f46474b = es0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f46473a) {
            case 0:
                this.f46474b.d0();
                return;
            default:
                this.f46474b.finishFragment();
                return;
        }
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.b41) obj).d == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z10 = !q8Var.f31310e.h;
            es0 es0Var = this.f46474b;
            es0Var.f46897n = z10;
            q8Var.setChecked(z10);
            es0Var.d.f39892g3.O(true);
            es0Var.a0(true);
        }
    }
}
