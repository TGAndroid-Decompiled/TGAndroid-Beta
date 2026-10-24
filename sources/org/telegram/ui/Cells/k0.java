package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.wc;
import org.telegram.ui.q01;
public final class k0 extends wc {
    public final int f22622k;
    public final Object f22623l;

    public k0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f22622k = i10;
        this.f22623l = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22622k) {
            case 0:
                ((t1) this.f22623l).Z2();
                return;
            case 1:
                ((t1) this.f22623l).Z2();
                return;
            default:
                ((q01) this.f22623l).invalidateSelf();
                return;
        }
    }

    public k0(q01 q01Var) {
        super((View) null);
        this.f22622k = 2;
        this.f22623l = q01Var;
    }
}
