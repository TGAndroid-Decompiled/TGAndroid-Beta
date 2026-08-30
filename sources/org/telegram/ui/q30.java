package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class q30 extends UndoView {
    public final c60 f37582c0;

    public q30(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37582c0 = c60Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f37582c0.f33189w0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
