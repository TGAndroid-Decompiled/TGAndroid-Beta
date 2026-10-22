package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class c30 extends UndoView {
    public final q50 f35802f0;

    public c30(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f35802f0 = q50Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f35802f0.f40483z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
