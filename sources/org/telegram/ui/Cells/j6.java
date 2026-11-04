package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.LaunchActivity;
public final class j6 extends ei.o7 {
    public final int S = 0;
    public final View T;

    public j6(pa paVar) {
        super(null, false);
        this.T = paVar;
    }

    @Override
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((l6) this.T).b(j10);
                return;
            case 1:
                pa paVar = (pa) this.T;
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().R(paVar.getContext(), j10, ei.i7.a((tj0) paVar.getParent()));
                    return;
                }
                return;
            default:
                fn fnVar = (fn) this.T;
                fnVar.I.getOrCreateStoryViewer().R(fnVar.getContext(), j10, new org.telegram.ui.Components.t(this, 25));
                return;
        }
    }

    public j6(l6 l6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var, false);
        this.T = l6Var;
    }

    public j6(fn fnVar) {
        super(null, true);
        this.T = fnVar;
    }
}
