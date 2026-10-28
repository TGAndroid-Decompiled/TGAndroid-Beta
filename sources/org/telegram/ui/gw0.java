package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class gw0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final int f39701a;
    public final hw0 f39702b;

    public gw0(hw0 hw0Var, int i10) {
        this.f39701a = i10;
        this.f39702b = hw0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39701a) {
            case 0:
                this.f39702b.Z();
                return;
            default:
                this.f39702b.finishFragment();
                return;
        }
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        hw0 hw0Var = this.f39702b;
        hw0Var.getClass();
        if (((org.telegram.ui.Components.u61) obj).d == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            boolean z10 = !a9Var.e.h;
            hw0Var.f40003n = z10;
            a9Var.setChecked(z10);
            hw0Var.d.f32504g3.O(true);
            hw0Var.W(true);
        }
    }
}
