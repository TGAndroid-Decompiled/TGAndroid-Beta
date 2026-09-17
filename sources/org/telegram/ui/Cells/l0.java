package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.zc;
import org.telegram.ui.m11;
public final class l0 extends zc {
    public final int f22232j;
    public final Object f22233k;

    public l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f22232j = i10;
        this.f22233k = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22232j) {
            case 0:
                ((t1) this.f22233k).a3();
                return;
            case 1:
                ((t1) this.f22233k).a3();
                return;
            default:
                ((m11) this.f22233k).invalidateSelf();
                return;
        }
    }

    public l0(m11 m11Var) {
        super((View) null);
        this.f22232j = 2;
        this.f22233k = m11Var;
    }
}
