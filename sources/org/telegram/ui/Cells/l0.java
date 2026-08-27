package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.nc;
import org.telegram.ui.h01;

public final class l0 extends nc {

    public final int f24612j;

    public final Object f24613k;

    public l0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.f24612j = i10;
        this.f24613k = s1Var2;
    }

    @Override
    public final void b() {
        switch (this.f24612j) {
            case 0:
                ((s1) this.f24613k).Z2();
                break;
            case 1:
                ((s1) this.f24613k).Z2();
                break;
            default:
                ((h01) this.f24613k).invalidateSelf();
                break;
        }
    }

    public l0(h01 h01Var) {
        super((View) null);
        this.f24612j = 2;
        this.f24613k = h01Var;
    }
}
