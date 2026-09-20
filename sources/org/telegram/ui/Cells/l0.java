package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.k11;
public final class l0 extends yc {
    public final int f20587j;
    public final Object f20588k;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f20587j = i10;
        this.f20588k = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f20587j) {
            case 0:
                ((u1) this.f20588k).a3();
                return;
            case 1:
                ((u1) this.f20588k).a3();
                return;
            default:
                ((k11) this.f20588k).invalidateSelf();
                return;
        }
    }

    public l0(k11 k11Var) {
        super((View) null);
        this.f20587j = 2;
        this.f20588k = k11Var;
    }
}
