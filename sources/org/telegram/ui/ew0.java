package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class ew0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final int f33870a;
    public final fw0 f33871b;

    public ew0(fw0 fw0Var, int i10) {
        this.f33870a = i10;
        this.f33871b = fw0Var;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f33870a) {
            case 0:
                this.f33871b.Y();
                return;
            default:
                this.f33871b.finishFragment();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        fw0 fw0Var = this.f33871b;
        fw0Var.getClass();
        if (((org.telegram.ui.Components.i51) obj).d == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z4 = !r8Var.e.h;
            fw0Var.f34243r = z4;
            r8Var.setChecked(z4);
            fw0Var.d.V2.N(true);
            fw0Var.V(true);
        }
    }
}
