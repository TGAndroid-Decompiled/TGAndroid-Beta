package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class q30 extends UndoView {
    public final d60 f36769f0;

    public q30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f36769f0 = d60Var;
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f36769f0.f33038z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
