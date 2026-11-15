package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.dc;
import org.telegram.ui.tw0;
public final class j0 extends dc {
    public final int f30475k;
    public final Object f30476l;

    public j0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.f30475k = i7;
        this.f30476l = q1Var2;
    }

    @Override
    public final void b() {
        switch (this.f30475k) {
            case 0:
                ((q1) this.f30476l).q2();
                return;
            case 1:
                ((q1) this.f30476l).q2();
                return;
            default:
                ((tw0) this.f30476l).invalidateSelf();
                return;
        }
    }

    public j0(tw0 tw0Var) {
        super((View) null);
        this.f30475k = 2;
        this.f30476l = tw0Var;
    }
}
