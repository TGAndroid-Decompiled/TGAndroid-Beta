package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.xc;
import org.telegram.ui.x01;
public final class k0 extends xc {
    public final int f24307k;
    public final Object f24308l;

    public k0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.f24307k = i10;
        this.f24308l = s1Var2;
    }

    @Override
    public final void b() {
        switch (this.f24307k) {
            case 0:
                ((s1) this.f24308l).a3();
                return;
            case 1:
                ((s1) this.f24308l).a3();
                return;
            default:
                ((x01) this.f24308l).invalidateSelf();
                return;
        }
    }

    public k0(x01 x01Var) {
        super((View) null);
        this.f24307k = 2;
        this.f24308l = x01Var;
    }
}
