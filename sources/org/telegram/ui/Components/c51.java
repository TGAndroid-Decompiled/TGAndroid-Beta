package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class c51 extends ImageReceiver {
    public final d51 J1;

    public c51(d51 d51Var) {
        super(null);
        this.J1 = d51Var;
    }

    @Override
    public final void invalidate() {
        this.J1.invalidate();
    }
}
