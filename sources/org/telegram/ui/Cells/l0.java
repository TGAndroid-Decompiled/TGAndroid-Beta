package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.xc;
import org.telegram.ui.q11;
public final class l0 extends xc {
    public final int f19467j;
    public final Object f19468k;

    public l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f19467j = i10;
        this.f19468k = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f19467j) {
            case 0:
                ((t1) this.f19468k).a3();
                return;
            case 1:
                ((t1) this.f19468k).a3();
                return;
            default:
                ((q11) this.f19468k).invalidateSelf();
                return;
        }
    }

    public l0(q11 q11Var) {
        super((View) null);
        this.f19467j = 2;
        this.f19468k = q11Var;
    }
}
