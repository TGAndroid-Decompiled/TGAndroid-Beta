package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class b51 extends ImageReceiver {
    public final c51 J1;

    public b51(c51 c51Var) {
        super(null);
        this.J1 = c51Var;
    }

    @Override
    public final void invalidate() {
        this.J1.invalidate();
    }
}
