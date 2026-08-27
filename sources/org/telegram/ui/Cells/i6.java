package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;

public final class i6 extends jh.h7 {
    public final int S = 0;
    public final View T;

    public i6(k6 k6Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(c6Var, false);
        this.T = k6Var;
    }

    @Override
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((k6) this.T).b(j10);
                break;
            case 1:
                sa saVar = (sa) this.T;
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR != null) {
                    n2VarR.getOrCreateStoryViewer().getClass();
                    n2VarR.getOrCreateStoryViewer().D(saVar.getContext(), j10, jh.b7.a((zk0) saVar.getParent()));
                }
                break;
            default:
                nn nnVar = (nn) this.T;
                nnVar.D.getOrCreateStoryViewer().D(nnVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    public i6(sa saVar) {
        super(null, false);
        this.T = saVar;
    }

    public i6(nn nnVar) {
        super(null, true);
        this.T = nnVar;
    }
}
