package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class p51 extends ImageReceiver {
    public final q51 K1;

    public p51(q51 q51Var) {
        super(null);
        this.K1 = q51Var;
    }

    @Override
    public final void invalidate() {
        this.K1.invalidate();
    }
}
