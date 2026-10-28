package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class j30 extends UndoView {
    public final x50 f40368j0;

    public j30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f40368j0 = x50Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f40368j0.f45595z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
