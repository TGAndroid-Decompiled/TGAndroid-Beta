package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;
public final class l6 extends ai.ca {
    public final int S = 1;
    public final View T;

    public l6(n6 n6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(f6Var, false);
        this.T = n6Var;
    }

    @Override
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((n6) this.T).b(j3);
                return;
            case 1:
                ab abVar = (ab) this.T;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(abVar.getContext(), j3, ai.u9.a((ml0) abVar.getParent()));
                    return;
                }
                return;
            default:
                zn znVar = (zn) this.T;
                znVar.H.getOrCreateStoryViewer().D(znVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public l6(ab abVar) {
        super(null, false);
        this.T = abVar;
    }

    public l6(zn znVar) {
        super(null, true);
        this.T = znVar;
    }
}
