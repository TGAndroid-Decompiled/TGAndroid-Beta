package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.lc;
import org.telegram.ui.vw0;
public final class k0 extends lc {
    public final int f30998k;
    public final Object f30999l;

    public k0(r1 r1Var, r1 r1Var2, int i7) {
        super(r1Var);
        this.f30998k = i7;
        this.f30999l = r1Var2;
    }

    @Override
    public final void b() {
        switch (this.f30998k) {
            case 0:
                ((r1) this.f30999l).q2();
                return;
            case 1:
                ((r1) this.f30999l).q2();
                return;
            default:
                ((vw0) this.f30999l).invalidateSelf();
                return;
        }
    }

    public k0(vw0 vw0Var) {
        super((View) null);
        this.f30998k = 2;
        this.f30999l = vw0Var;
    }
}
