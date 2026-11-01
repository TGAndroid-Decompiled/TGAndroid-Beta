package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.LaunchActivity;
public final class o6 extends th.t5 {
    public final int S = 1;
    public final View T;

    public o6(pa paVar) {
        super(null, false);
        this.T = paVar;
    }

    @Override
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((q6) this.T).b(j10);
                return;
            case 1:
                pa paVar = (pa) this.T;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().R(paVar.getContext(), j10, th.n5.a((uk0) paVar.getParent()));
                    return;
                }
                return;
            default:
                on onVar = (on) this.T;
                onVar.H.getOrCreateStoryViewer().R(onVar.getContext(), j10, new org.telegram.ui.Components.t(this, 25));
                return;
        }
    }

    public o6(q6 q6Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(p6Var, false);
        this.T = q6Var;
    }

    public o6(on onVar) {
        super(null, true);
        this.T = onVar;
    }
}
