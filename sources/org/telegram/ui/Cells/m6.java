package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.qo;
import org.telegram.ui.LaunchActivity;
public final class m6 extends ai.da {
    public final int S = 0;
    public final View T;

    public m6(o6 o6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var, false);
        this.T = o6Var;
    }

    @Override
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((o6) this.T).b(j3);
                return;
            case 1:
                xa xaVar = (xa) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(xaVar.getContext(), j3, ai.v9.a((qm0) xaVar.getParent()));
                    return;
                }
                return;
            default:
                qo qoVar = (qo) this.T;
                qoVar.H.getOrCreateStoryViewer().D(qoVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public m6(xa xaVar) {
        super(null, false);
        this.T = xaVar;
    }

    public m6(qo qoVar) {
        super(null, true);
        this.T = qoVar;
    }
}
