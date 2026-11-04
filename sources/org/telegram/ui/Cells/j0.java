package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.gc;
import org.telegram.ui.mw0;
public final class j0 extends gc {
    public final int f29414k;
    public final Object f29415l;

    public j0(q1 q1Var, q1 q1Var2, int i3) {
        super(q1Var);
        this.f29414k = i3;
        this.f29415l = q1Var2;
    }

    @Override
    public final void b() {
        switch (this.f29414k) {
            case 0:
                ((q1) this.f29415l).p2();
                return;
            case 1:
                ((q1) this.f29415l).p2();
                return;
            default:
                ((mw0) this.f29415l).invalidateSelf();
                return;
        }
    }

    public j0(mw0 mw0Var) {
        super((View) null);
        this.f29414k = 2;
        this.f29415l = mw0Var;
    }
}
