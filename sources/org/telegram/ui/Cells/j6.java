package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
public final class j6 extends fi.h7 {
    public final int S = 0;
    public final View T;

    public j6(pa paVar) {
        super(null, false);
        this.T = paVar;
    }

    @Override
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((l6) this.T).b(j3);
                return;
            case 1:
                pa paVar = (pa) this.T;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().J(paVar.getContext(), j3, fi.b7.a((uj0) paVar.getParent()));
                    return;
                }
                return;
            default:
                on onVar = (on) this.T;
                onVar.I.getOrCreateStoryViewer().J(onVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public j6(l6 l6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var, false);
        this.T = l6Var;
    }

    public j6(on onVar) {
        super(null, true);
        this.T = onVar;
    }
}
