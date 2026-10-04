package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.zc;
import org.telegram.ui.d11;
public final class l0 extends zc {
    public final int f22424j;
    public final Object f22425k;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f22424j = i10;
        this.f22425k = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22424j) {
            case 0:
                ((u1) this.f22425k).a3();
                return;
            case 1:
                ((u1) this.f22425k).a3();
                return;
            default:
                ((d11) this.f22425k).invalidateSelf();
                return;
        }
    }

    public l0(d11 d11Var) {
        super((View) null);
        this.f22424j = 2;
        this.f22425k = d11Var;
    }
}
