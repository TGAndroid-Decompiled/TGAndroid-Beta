package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ad;
import org.telegram.ui.l11;
public final class l0 extends ad {
    public final int f22178k;
    public final Object f22179l;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f22178k = i10;
        this.f22179l = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22178k) {
            case 0:
                ((u1) this.f22179l).a3();
                return;
            case 1:
                ((u1) this.f22179l).a3();
                return;
            default:
                ((l11) this.f22179l).invalidateSelf();
                return;
        }
    }

    public l0(l11 l11Var) {
        super((View) null);
        this.f22178k = 2;
        this.f22179l = l11Var;
    }
}
