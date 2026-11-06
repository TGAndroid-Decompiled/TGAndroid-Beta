package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ic;
import org.telegram.ui.uw0;
public final class j0 extends ic {
    public final int f29343k;
    public final Object f29344l;

    public j0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.f29343k = i7;
        this.f29344l = q1Var2;
    }

    @Override
    public final void b() {
        switch (this.f29343k) {
            case 0:
                ((q1) this.f29344l).p2();
                return;
            case 1:
                ((q1) this.f29344l).p2();
                return;
            default:
                ((uw0) this.f29344l).invalidateSelf();
                return;
        }
    }

    public j0(uw0 uw0Var) {
        super((View) null);
        this.f29343k = 2;
        this.f29344l = uw0Var;
    }
}
