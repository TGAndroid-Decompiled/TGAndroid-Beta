package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ic;
import org.telegram.ui.uw0;
public final class j0 extends ic {
    public final int f29342k;
    public final Object f29343l;

    public j0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.f29342k = i7;
        this.f29343l = q1Var2;
    }

    @Override
    public final void b() {
        switch (this.f29342k) {
            case 0:
                ((q1) this.f29343l).p2();
                return;
            case 1:
                ((q1) this.f29343l).p2();
                return;
            default:
                ((uw0) this.f29343l).invalidateSelf();
                return;
        }
    }

    public j0(uw0 uw0Var) {
        super((View) null);
        this.f29342k = 2;
        this.f29343l = uw0Var;
    }
}
