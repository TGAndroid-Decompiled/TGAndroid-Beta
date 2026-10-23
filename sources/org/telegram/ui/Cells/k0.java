package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.r01;
public final class k0 extends yc {
    public final int f22621k;
    public final Object f22622l;

    public k0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f22621k = i10;
        this.f22622l = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22621k) {
            case 0:
                ((t1) this.f22622l).Z2();
                return;
            case 1:
                ((t1) this.f22622l).Z2();
                return;
            default:
                ((r01) this.f22622l).invalidateSelf();
                return;
        }
    }

    public k0(r01 r01Var) {
        super((View) null);
        this.f22621k = 2;
        this.f22622l = r01Var;
    }
}
