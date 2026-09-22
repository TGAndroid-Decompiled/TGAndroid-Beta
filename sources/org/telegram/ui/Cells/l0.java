package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.wc;
import org.telegram.ui.l11;
public final class l0 extends wc {
    public final int f20370j;
    public final Object f20371k;

    public l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f20370j = i10;
        this.f20371k = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f20370j) {
            case 0:
                ((t1) this.f20371k).a3();
                return;
            case 1:
                ((t1) this.f20371k).a3();
                return;
            default:
                ((l11) this.f20371k).invalidateSelf();
                return;
        }
    }

    public l0(l11 l11Var) {
        super((View) null);
        this.f20370j = 2;
        this.f20371k = l11Var;
    }
}
