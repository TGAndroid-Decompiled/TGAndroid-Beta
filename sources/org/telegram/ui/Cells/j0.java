package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ic;
import org.telegram.ui.xw0;
public final class j0 extends ic {
    public final int f29350k;
    public final Object f29351l;

    public j0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.f29350k = i7;
        this.f29351l = q1Var2;
    }

    @Override
    public final void b() {
        switch (this.f29350k) {
            case 0:
                ((q1) this.f29351l).p2();
                return;
            case 1:
                ((q1) this.f29351l).p2();
                return;
            default:
                ((xw0) this.f29351l).invalidateSelf();
                return;
        }
    }

    public j0(xw0 xw0Var) {
        super((View) null);
        this.f29350k = 2;
        this.f29351l = xw0Var;
    }
}
