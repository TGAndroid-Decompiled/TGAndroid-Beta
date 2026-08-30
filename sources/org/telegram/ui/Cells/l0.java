package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.rc;
import org.telegram.ui.s01;
public final class l0 extends rc {
    public final int f21324j;
    public final Object f21325k;

    public l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f21324j = i10;
        this.f21325k = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f21324j) {
            case 0:
                ((t1) this.f21325k).a3();
                return;
            case 1:
                ((t1) this.f21325k).a3();
                return;
            default:
                ((s01) this.f21325k).invalidateSelf();
                return;
        }
    }

    public l0(s01 s01Var) {
        super((View) null);
        this.f21324j = 2;
        this.f21325k = s01Var;
    }
}
