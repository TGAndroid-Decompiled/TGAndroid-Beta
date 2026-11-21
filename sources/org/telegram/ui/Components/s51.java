package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class s51 extends ImageReceiver {
    public final t51 K1;

    public s51(t51 t51Var) {
        super(null);
        this.K1 = t51Var;
    }

    @Override
    public final void invalidate() {
        this.K1.invalidate();
    }
}
