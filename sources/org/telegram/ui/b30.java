package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class b30 extends UndoView {
    public final o50 f36616b0;

    public b30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f36616b0 = o50Var;
    }

    @Override
    public final void k(long j10, int i9, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f36616b0.f40968v0 != null) {
            return;
        }
        super.k(j10, i9, obj, obj2, runnable, runnable2);
    }
}
