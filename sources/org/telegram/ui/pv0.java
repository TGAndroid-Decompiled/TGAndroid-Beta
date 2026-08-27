package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class pv0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {

    public final int f41436a;

    public final qv0 f41437b;

    public pv0(qv0 qv0Var, int i10) {
        this.f41436a = i10;
        this.f41437b = qv0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41436a) {
            case 0:
                this.f41437b.Y();
                break;
            default:
                this.f41437b.finishFragment();
                break;
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        qv0 qv0Var = this.f41437b;
        qv0Var.getClass();
        if (((org.telegram.ui.Components.n41) obj).d == 1) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            boolean z10 = !p8Var.f25003e.h;
            qv0Var.f41756r = z10;
            p8Var.setChecked(z10);
            qv0Var.d.U2.N(true);
            qv0Var.V(true);
        }
    }
}
