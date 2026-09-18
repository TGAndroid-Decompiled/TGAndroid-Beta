package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.k11;
public final class l0 extends yc {
    public final int f20565j;
    public final Object f20566k;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f20565j = i10;
        this.f20566k = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f20565j) {
            case 0:
                ((u1) this.f20566k).a3();
                return;
            case 1:
                ((u1) this.f20566k).a3();
                return;
            default:
                ((k11) this.f20566k).invalidateSelf();
                return;
        }
    }

    public l0(k11 k11Var) {
        super((View) null);
        this.f20565j = 2;
        this.f20566k = k11Var;
    }
}
