package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.LaunchActivity;
public final class m6 extends ai.ca {
    public final int S = 1;
    public final View T;

    public m6(o6 o6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(d6Var, false);
        this.T = o6Var;
    }

    @Override
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((o6) this.T).b(j3);
                return;
            case 1:
                bb bbVar = (bb) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(bbVar.getContext(), j3, ai.u9.a((ml0) bbVar.getParent()));
                    return;
                }
                return;
            default:
                ao aoVar = (ao) this.T;
                aoVar.H.getOrCreateStoryViewer().D(aoVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public m6(bb bbVar) {
        super(null, false);
        this.T = bbVar;
    }

    public m6(ao aoVar) {
        super(null, true);
        this.T = aoVar;
    }
}
