package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class ew0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final int f39188a;
    public final fw0 f39189b;

    public ew0(fw0 fw0Var, int i10) {
        this.f39188a = i10;
        this.f39189b = fw0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39188a) {
            case 0:
                this.f39189b.Z();
                return;
            default:
                this.f39189b.finishFragment();
                return;
        }
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        fw0 fw0Var = this.f39189b;
        fw0Var.getClass();
        if (((org.telegram.ui.Components.t61) obj).d == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            boolean z10 = !a9Var.e.h;
            fw0Var.f39485n = z10;
            a9Var.setChecked(z10);
            fw0Var.d.f32150g3.O(true);
            fw0Var.W(true);
        }
    }
}
