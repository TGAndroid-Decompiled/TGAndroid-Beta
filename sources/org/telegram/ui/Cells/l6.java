package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.wn;
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
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().J(raVar.getContext(), j3, fi.y6.a((ck0) raVar.getParent()));
                    return;
                }
                return;
            default:
                wn wnVar = (wn) this.T;
                wnVar.I.getOrCreateStoryViewer().J(wnVar.getContext(), j3, new org.telegram.ui.Components.b0(this, 24));
                return;
        }
    }

    public l6(n6 n6Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i6Var, false);
        this.T = n6Var;
    }

    public l6(wn wnVar) {
        super(null, true);
        this.T = wnVar;
    }
}
