package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.p01;
public final class l0 extends yc {
    public final int f22519k;
    public final Object f22520l;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f22519k = i10;
        this.f22520l = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22519k) {
            case 0:
                ((u1) this.f22520l).a3();
                return;
            case 1:
                ((u1) this.f22520l).a3();
                return;
            default:
                ((p01) this.f22520l).invalidateSelf();
                return;
        }
    }

    public l0(p01 p01Var) {
        super((View) null);
        this.f22519k = 2;
        this.f22520l = p01Var;
    }
}
