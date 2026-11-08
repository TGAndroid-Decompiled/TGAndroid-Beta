package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ic;
import org.telegram.ui.uw0;
public final class j0 extends ic {
    public final int f29346k;
    public final Object f29347l;

    public j0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.f29346k = i7;
        this.f29347l = q1Var2;
    }

    @Override
    public final void b() {
        switch (this.f29346k) {
            case 0:
                ((q1) this.f29347l).p2();
                return;
            case 1:
                ((q1) this.f29347l).p2();
                return;
            default:
                ((uw0) this.f29347l).invalidateSelf();
                return;
        }
    }

    public j0(uw0 uw0Var) {
        super((View) null);
        this.f29346k = 2;
        this.f29347l = uw0Var;
    }
}
