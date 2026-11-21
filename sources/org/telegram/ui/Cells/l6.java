package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.LaunchActivity;
public final class l6 extends fi.e7 {
    public final int S = 0;
    public final View T;

    public l6(ra raVar) {
        super(null, false);
        this.T = raVar;
    }

    @Override
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((n6) this.T).b(j3);
                return;
            case 1:
                ra raVar = (ra) this.T;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().J(raVar.getContext(), j3, fi.y6.a((ek0) raVar.getParent()));
                    return;
                }
                return;
            default:
                yn ynVar = (yn) this.T;
                ynVar.I.getOrCreateStoryViewer().J(ynVar.getContext(), j3, new org.telegram.ui.Components.c0(this, 24));
                return;
        }
    }

    public l6(n6 n6Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(h6Var, false);
        this.T = n6Var;
    }

    public l6(yn ynVar) {
        super(null, true);
        this.T = ynVar;
    }
}
