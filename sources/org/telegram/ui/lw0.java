package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class lw0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f35101a;
    public final mw0 f35102b;

    public lw0(mw0 mw0Var, int i10) {
        this.f35101a = i10;
        this.f35102b = mw0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35101a) {
            case 0:
                this.f35102b.Y();
                return;
            default:
                this.f35102b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        mw0 mw0Var = this.f35102b;
        mw0Var.getClass();
        if (((org.telegram.ui.Components.h51) obj).d == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            boolean z10 = !x8Var.e.h;
            mw0Var.f35401r = z10;
            x8Var.setChecked(z10);
            mw0Var.d.Y2.N(true);
            mw0Var.V(true);
        }
    }
}
