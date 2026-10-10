package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.bd;
import org.telegram.ui.j11;
public final class l0 extends bd {
    public final int f22418k;
    public final Object f22419l;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f22418k = i10;
        this.f22419l = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22418k) {
            case 0:
                ((u1) this.f22419l).a3();
                return;
            case 1:
                ((u1) this.f22419l).a3();
                return;
            default:
                ((j11) this.f22419l).invalidateSelf();
                return;
        }
    }

    public l0(j11 j11Var) {
        super((View) null);
        this.f22418k = 2;
        this.f22419l = j11Var;
    }
}
