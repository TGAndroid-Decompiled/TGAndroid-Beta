package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class jw0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f34885a;
    public final kw0 f34886b;

    public jw0(kw0 kw0Var, int i10) {
        this.f34885a = i10;
        this.f34886b = kw0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34885a) {
            case 0:
                this.f34886b.Y();
                return;
            default:
                this.f34886b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        kw0 kw0Var = this.f34886b;
        kw0Var.getClass();
        if (((org.telegram.ui.Components.w51) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.e.h;
            kw0Var.f35187r = z10;
            w8Var.setChecked(z10);
            kw0Var.d.Y2.N(true);
            kw0Var.V(true);
        }
    }
}
