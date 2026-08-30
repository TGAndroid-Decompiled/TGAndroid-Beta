package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.LaunchActivity;
public final class l6 extends nh.i7 {
    public final int S = 0;
    public final View T;

    public l6(n6 n6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(f6Var, false);
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
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(vaVar.getContext(), j10, nh.c7.a((sl0) vaVar.getParent()));
                    return;
                }
                return;
            default:
                vn vnVar = (vn) this.T;
                vnVar.E.getOrCreateStoryViewer().D(vnVar.getContext(), j10, new org.telegram.ui.Components.t(this, 25));
                return;
        }
    }

    public l6(va vaVar) {
        super(null, false);
        this.T = vaVar;
    }

    public l6(vn vnVar) {
        super(null, true);
        this.T = vnVar;
    }
}
