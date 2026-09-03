package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.un;
import org.telegram.ui.LaunchActivity;
public final class k6 extends nh.i7 {
    public final int S = 0;
    public final View T;

    public k6(m6 m6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(f6Var, false);
        this.T = m6Var;
    }

    @Override
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((m6) this.T).b(j10);
                return;
            case 1:
                ua uaVar = (ua) this.T;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(uaVar.getContext(), j10, nh.c7.a((rl0) uaVar.getParent()));
                    return;
                }
                return;
            default:
                un unVar = (un) this.T;
                unVar.E.getOrCreateStoryViewer().D(unVar.getContext(), j10, new org.telegram.ui.Components.t(this, 25));
                return;
        }
    }

    public k6(ua uaVar) {
        super(null, false);
        this.T = uaVar;
    }

    public k6(un unVar) {
        super(null, true);
        this.T = unVar;
    }
}
