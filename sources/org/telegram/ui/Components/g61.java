package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class g61 extends ImageReceiver {
    public final h61 J1;

    public g61(h61 h61Var) {
        super(null);
        this.J1 = h61Var;
    }

    @Override
    public final void invalidate() {
        this.J1.invalidate();
    }
}
