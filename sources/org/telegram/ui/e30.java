package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

public final class e30 extends UndoView {

    public final s50 f37609b0;

    public e30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37609b0 = s50Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f37609b0.f42497v0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
