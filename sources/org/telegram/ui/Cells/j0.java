package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.dc;
import org.telegram.ui.hy0;
public final class j0 extends dc {
    public final int f22059k;
    public final Object f22060l;

    public j0(q1 q1Var, q1 q1Var2, int i10) {
        super(q1Var);
        this.f22059k = i10;
        this.f22060l = q1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22059k) {
            case 0:
                ((q1) this.f22060l).n2();
                return;
            case 1:
                ((q1) this.f22060l).n2();
                return;
            default:
                ((hy0) this.f22060l).invalidateSelf();
                return;
        }
    }

    public j0(hy0 hy0Var) {
        super((View) null);
        this.f22059k = 2;
        this.f22060l = hy0Var;
    }
}
