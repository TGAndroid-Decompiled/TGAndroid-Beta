package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.pj0;
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
                    Q.getOrCreateStoryViewer().J(paVar.getContext(), j3, di.i7.a((pj0) paVar.getParent()));
                    return;
                }
                return;
            default:
                fn fnVar = (fn) this.T;
                fnVar.H.getOrCreateStoryViewer().J(fnVar.getContext(), j3, new org.telegram.ui.Components.t(this, 25));
                return;
        }
    }

    public k6(m6 m6Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(h6Var, false);
        this.T = m6Var;
    }

    public k6(fn fnVar) {
        super(null, true);
        this.T = fnVar;
    }
}
