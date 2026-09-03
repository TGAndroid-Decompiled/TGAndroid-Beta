package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class ew0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final int f36599a;
    public final fw0 f36600b;

    public ew0(fw0 fw0Var, int i10) {
        this.f36599a = i10;
        this.f36600b = fw0Var;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36599a) {
            case 0:
                this.f36600b.Y();
                return;
            default:
                this.f36600b.finishFragment();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        fw0 fw0Var = this.f36600b;
        fw0Var.getClass();
        if (((org.telegram.ui.Components.h51) obj).d == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z4 = !s8Var.f23755e.h;
            fw0Var.f36929r = z4;
            s8Var.setChecked(z4);
            fw0Var.d.V2.N(true);
            fw0Var.V(true);
        }
    }
}
