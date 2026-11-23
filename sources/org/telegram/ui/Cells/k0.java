package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.mc;
import org.telegram.ui.xw0;
public final class k0 extends mc {
    public final int f30906k;
    public final Object f30907l;

    public k0(r1 r1Var, r1 r1Var2, int i7) {
        super(r1Var);
        this.f30906k = i7;
        this.f30907l = r1Var2;
    }

    @Override
    public final void b() {
        switch (this.f30906k) {
            case 0:
                ((r1) this.f30907l).q2();
                return;
            case 1:
                ((r1) this.f30907l).q2();
                return;
            default:
                ((xw0) this.f30907l).invalidateSelf();
                return;
        }
    }

    public k0(xw0 xw0Var) {
        super((View) null);
        this.f30906k = 2;
        this.f30907l = xw0Var;
    }
}
