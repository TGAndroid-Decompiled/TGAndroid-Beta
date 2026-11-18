package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.mc;
import org.telegram.ui.xw0;
public final class k0 extends mc {
    public final int f30900k;
    public final Object f30901l;

    public k0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.f30900k = i7;
        this.f30901l = q1Var2;
    }

    @Override
    public final void b() {
        switch (this.f30900k) {
            case 0:
                ((q1) this.f30901l).q2();
                return;
            case 1:
                ((q1) this.f30901l).q2();
                return;
            default:
                ((xw0) this.f30901l).invalidateSelf();
                return;
        }
    }

    public k0(xw0 xw0Var) {
        super((View) null);
        this.f30900k = 2;
        this.f30901l = xw0Var;
    }
}
