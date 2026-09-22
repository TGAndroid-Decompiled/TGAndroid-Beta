package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;
public final class m6 extends ai.ca {
    public final int S = 1;
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
                ab abVar = (ab) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(abVar.getContext(), j3, ai.u9.a((ll0) abVar.getParent()));
                    return;
                }
                return;
            default:
                zn znVar = (zn) this.T;
                znVar.H.getOrCreateStoryViewer().D(znVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public m6(ab abVar) {
        super(null, false);
        this.T = abVar;
    }

    public m6(zn znVar) {
        super(null, true);
        this.T = znVar;
    }
}
