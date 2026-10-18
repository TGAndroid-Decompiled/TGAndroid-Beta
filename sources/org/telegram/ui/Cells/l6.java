package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ko;
import org.telegram.ui.LaunchActivity;
public final class l6 extends ci.x7 {
    public final int S = 0;
    public final View T;

    public l6(n6 n6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(d6Var, false);
        this.T = n6Var;
    }

    @Override
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((n6) this.T).b(j10);
                return;
            case 1:
                va vaVar = (va) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(vaVar.getContext(), j10, ci.q7.a((im0) vaVar.getParent()));
                    return;
                }
                return;
            default:
                ko koVar = (ko) this.T;
                koVar.H.getOrCreateStoryViewer().D(koVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public l6(va vaVar) {
        super(null, false);
        this.T = vaVar;
    }

    public l6(ko koVar) {
        super(null, true);
        this.T = koVar;
    }
}
