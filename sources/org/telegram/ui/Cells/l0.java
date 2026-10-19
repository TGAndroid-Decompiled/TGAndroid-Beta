package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.n01;
public final class l0 extends yc {
    public final int f22522k;
    public final Object f22523l;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f22522k = i10;
        this.f22523l = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22522k) {
            case 0:
                ((u1) this.f22523l).a3();
                return;
            case 1:
                ((u1) this.f22523l).a3();
                return;
            default:
                ((n01) this.f22523l).invalidateSelf();
                return;
        }
    }

    public l0(n01 n01Var) {
        super((View) null);
        this.f22522k = 2;
        this.f22523l = n01Var;
    }
}
