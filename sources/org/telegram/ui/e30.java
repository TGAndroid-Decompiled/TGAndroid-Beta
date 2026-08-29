package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class e30 extends UndoView {
    public final r50 f37687b0;

    public e30(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37687b0 = r50Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f37687b0.f41955v0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
