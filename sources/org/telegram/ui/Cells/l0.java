package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.zc;
import org.telegram.ui.d11;
public final class l0 extends zc {
    public final int f22425j;
    public final Object f22426k;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f22425j = i10;
        this.f22426k = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22425j) {
            case 0:
                ((u1) this.f22426k).a3();
                return;
            case 1:
                ((u1) this.f22426k).a3();
                return;
            default:
                ((d11) this.f22426k).invalidateSelf();
                return;
        }
    }

    public l0(d11 d11Var) {
        super((View) null);
        this.f22425j = 2;
        this.f22426k = d11Var;
    }
}
