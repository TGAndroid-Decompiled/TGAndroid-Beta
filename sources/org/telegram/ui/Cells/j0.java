package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.hc;
import org.telegram.ui.zw0;
public final class j0 extends hc {
    public final int f29361k;
    public final Object f29362l;

    public j0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.f29361k = i7;
        this.f29362l = q1Var2;
    }

    @Override
    public final void b() {
        switch (this.f29361k) {
            case 0:
                ((q1) this.f29362l).p2();
                return;
            case 1:
                ((q1) this.f29362l).p2();
                return;
            default:
                ((zw0) this.f29362l).invalidateSelf();
                return;
        }
    }

    public j0(zw0 zw0Var) {
        super((View) null);
        this.f29361k = 2;
        this.f29362l = zw0Var;
    }
}
