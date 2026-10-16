package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ad;
import org.telegram.ui.q11;
public final class l0 extends ad {
    public final int f21173k;
    public final Object f21174l;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f21173k = i10;
        this.f21174l = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f21173k) {
            case 0:
                ((u1) this.f21174l).a3();
                return;
            case 1:
                ((u1) this.f21174l).a3();
                return;
            default:
                ((q11) this.f21174l).invalidateSelf();
                return;
        }
    }

    public l0(q11 q11Var) {
        super((View) null);
        this.f21173k = 2;
        this.f21174l = q11Var;
    }
}
