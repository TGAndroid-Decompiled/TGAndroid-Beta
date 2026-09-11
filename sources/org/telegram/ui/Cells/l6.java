package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.LaunchActivity;
public final class l6 extends bi.j9 {
    public final int S = 0;
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
                za zaVar = (za) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(zaVar.getContext(), j3, bi.d9.a((ll0) zaVar.getParent()));
                    return;
                }
                return;
            default:
                yn ynVar = (yn) this.T;
                ynVar.H.getOrCreateStoryViewer().D(ynVar.getContext(), j3, new org.telegram.ui.Components.t(this, 25));
                return;
        }
    }

    public l6(za zaVar) {
        super(null, false);
        this.T = zaVar;
    }

    public l6(yn ynVar) {
        super(null, true);
        this.T = ynVar;
    }
}
