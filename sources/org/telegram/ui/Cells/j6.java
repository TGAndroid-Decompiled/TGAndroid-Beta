package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.LaunchActivity;
public final class j6 extends lh.h7 {
    public final int S = 0;
    public final View T;

    public j6(l6 l6Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(c6Var, false);
        this.T = l6Var;
    }

    @Override
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((l6) this.T).b(j10);
                return;
            case 1:
                sa saVar = (sa) this.T;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(saVar.getContext(), j10, lh.b7.a((jl0) saVar.getParent()));
                    return;
                }
                return;
            default:
                tn tnVar = (tn) this.T;
                tnVar.D.getOrCreateStoryViewer().D(tnVar.getContext(), j10, new org.telegram.ui.Components.u(this, 25));
                return;
        }
    }

    public j6(sa saVar) {
        super(null, false);
        this.T = saVar;
    }

    public j6(tn tnVar) {
        super(null, true);
        this.T = tnVar;
    }
}
