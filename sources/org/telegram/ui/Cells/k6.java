package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.LaunchActivity;
public final class k6 extends di.o7 {
    public final int S = 0;
    public final View T;

    public k6(pa paVar) {
        super(null, false);
        this.T = paVar;
    }

    @Override
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((m6) this.T).b(j3);
                return;
            case 1:
                pa paVar = (pa) this.T;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().J(paVar.getContext(), j3, di.i7.a((qj0) paVar.getParent()));
                    return;
                }
                return;
            default:
                gn gnVar = (gn) this.T;
                gnVar.H.getOrCreateStoryViewer().J(gnVar.getContext(), j3, new org.telegram.ui.Components.u(this, 25));
                return;
        }
    }

    public k6(m6 m6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(g6Var, false);
        this.T = m6Var;
    }

    public k6(gn gnVar) {
        super(null, true);
        this.T = gnVar;
    }
}
