package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class f51 extends ImageReceiver {
    public final g51 K1;

    public f51(g51 g51Var) {
        super(null);
        this.K1 = g51Var;
    }

    @Override
    public final void invalidate() {
        this.K1.invalidate();
    }
}
