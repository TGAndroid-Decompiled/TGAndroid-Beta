package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class h30 extends UndoView {
    public final v50 f39877j0;

    public h30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39877j0 = v50Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f39877j0.f44711z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
