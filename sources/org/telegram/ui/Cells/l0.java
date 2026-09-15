package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.wc;
import org.telegram.ui.k11;
public final class l0 extends wc {
    public final int f20377j;
    public final Object f20378k;

    public l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f20377j = i10;
        this.f20378k = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f20377j) {
            case 0:
                ((t1) this.f20378k).a3();
                return;
            case 1:
                ((t1) this.f20378k).a3();
                return;
            default:
                ((k11) this.f20378k).invalidateSelf();
                return;
        }
    }

    public l0(k11 k11Var) {
        super((View) null);
        this.f20377j = 2;
        this.f20378k = k11Var;
    }
}
