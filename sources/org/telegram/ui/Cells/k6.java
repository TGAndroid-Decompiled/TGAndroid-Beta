package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.LaunchActivity;
public final class k6 extends fi.e7 {
    public final int S = 0;
    public final View T;

    public k6(sa saVar) {
        super(null, false);
        this.T = saVar;
    }

    @Override
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((m6) this.T).b(j3);
                return;
            case 1:
                sa saVar = (sa) this.T;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().J(saVar.getContext(), j3, fi.y6.a((ek0) saVar.getParent()));
                    return;
                }
                return;
            default:
                vn vnVar = (vn) this.T;
                vnVar.I.getOrCreateStoryViewer().J(vnVar.getContext(), j3, new org.telegram.ui.Components.b0(this, 24));
                return;
        }
    }

    public k6(m6 m6Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i6Var, false);
        this.T = m6Var;
    }

    public k6(vn vnVar) {
        super(null, true);
        this.T = vnVar;
    }
}
