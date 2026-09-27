package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.d11;
public final class l0 extends yc {
    public final int f20603j;
    public final Object f20604k;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f20603j = i10;
        this.f20604k = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f20603j) {
            case 0:
                ((u1) this.f20604k).a3();
                return;
            case 1:
                ((u1) this.f20604k).a3();
                return;
            default:
                ((d11) this.f20604k).invalidateSelf();
                return;
        }
    }

    public l0(d11 d11Var) {
        super((View) null);
        this.f20603j = 2;
        this.f20604k = d11Var;
    }
}
