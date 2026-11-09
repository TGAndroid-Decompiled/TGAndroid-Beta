package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class d51 extends ImageReceiver {
    public final e51 J1;

    public d51(e51 e51Var) {
        super(null);
        this.J1 = e51Var;
    }

    @Override
    public final void invalidate() {
        this.J1.invalidate();
    }
}
