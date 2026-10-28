package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.LaunchActivity;
public final class q6 extends di.w7 {
    public final int S = 1;
    public final View T;

    public q6(ab abVar) {
        super(null, false);
        this.T = abVar;
    }

    @Override
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((s6) this.T).b(j10);
                return;
            case 1:
                ab abVar = (ab) this.T;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().E(abVar.getContext(), j10, di.q7.a((nm0) abVar.getParent()));
                    return;
                }
                return;
            default:
                lo loVar = (lo) this.T;
                loVar.H.getOrCreateStoryViewer().E(loVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public q6(s6 s6Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(u6Var, false);
        this.T = s6Var;
    }

    public q6(lo loVar) {
        super(null, true);
        this.T = loVar;
    }
}
