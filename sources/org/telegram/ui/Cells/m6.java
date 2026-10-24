package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.LaunchActivity;
public final class m6 extends ci.x7 {
    public final int S = 0;
    public final View T;

    public m6(wa waVar) {
        super(null, false);
        this.T = waVar;
    }

    @Override
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((o6) this.T).b(j10);
                return;
            case 1:
                wa waVar = (wa) this.T;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(waVar.getContext(), j10, ci.q7.a((lm0) waVar.getParent()));
                    return;
                }
                return;
            default:
                io ioVar = (io) this.T;
                ioVar.H.getOrCreateStoryViewer().D(ioVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public m6(o6 o6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(g6Var, false);
        this.T = o6Var;
    }

    public m6(io ioVar) {
        super(null, true);
        this.T = ioVar;
    }
}
