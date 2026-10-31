package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.dc;
import org.telegram.ui.iy0;
public final class j0 extends dc {
    public final int f22058k;
    public final Object f22059l;

    public j0(q1 q1Var, q1 q1Var2, int i10) {
        super(q1Var);
        this.f22058k = i10;
        this.f22059l = q1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22058k) {
            case 0:
                ((q1) this.f22059l).n2();
                return;
            case 1:
                ((q1) this.f22059l).n2();
                return;
            default:
                ((iy0) this.f22059l).invalidateSelf();
                return;
        }
    }

    public j0(iy0 iy0Var) {
        super((View) null);
        this.f22058k = 2;
        this.f22059l = iy0Var;
    }
}
