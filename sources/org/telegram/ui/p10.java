package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class p10 extends UndoView {
    public final x30 f48402k0;

    public p10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f48402k0 = x30Var;
    }

    @Override
    public final void k(long j10, int i3, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f48402k0.f51788r2 != null) {
            return;
        }
        super.k(j10, i3, obj, obj2, runnable, runnable2);
    }
}
