package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.LaunchActivity;
public final class k6 extends fi.e7 {
    public final int S = 0;
    public final View T;

    public k6(qa qaVar) {
        super(null, false);
        this.T = qaVar;
    }

    @Override
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((m6) this.T).b(j3);
                return;
            case 1:
                qa qaVar = (qa) this.T;
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().J(qaVar.getContext(), j3, fi.y6.a((ck0) qaVar.getParent()));
                    return;
                }
                return;
            default:
                wn wnVar = (wn) this.T;
                wnVar.I.getOrCreateStoryViewer().J(wnVar.getContext(), j3, new org.telegram.ui.Components.b0(this, 24));
                return;
        }
    }

    public k6(m6 m6Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i6Var, false);
        this.T = m6Var;
    }

    public k6(wn wnVar) {
        super(null, true);
        this.T = wnVar;
    }
}
