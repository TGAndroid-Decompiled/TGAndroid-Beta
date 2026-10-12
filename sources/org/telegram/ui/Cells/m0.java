package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ad;
import org.telegram.ui.q11;
public final class m0 extends ad {
    public final int f21500k;
    public final Object f21501l;

    public m0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f21500k = i10;
        this.f21501l = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f21500k) {
            case 0:
                ((u1) this.f21501l).a3();
                return;
            case 1:
                ((u1) this.f21501l).a3();
                return;
            default:
                ((q11) this.f21501l).invalidateSelf();
                return;
        }
    }

    public m0(q11 q11Var) {
        super((View) null);
        this.f21500k = 2;
        this.f21501l = q11Var;
    }
}
