package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class f30 extends UndoView {
    public final u50 f37179j0;

    public f30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37179j0 = u50Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f37179j0.f42321z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
