package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class r51 extends ImageReceiver {
    public final s51 K1;

    public r51(s51 s51Var) {
        super(null);
        this.K1 = s51Var;
    }

    @Override
    public final void invalidate() {
        this.K1.invalidate();
    }
}
