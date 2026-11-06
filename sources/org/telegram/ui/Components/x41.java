package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class x41 extends ImageReceiver {
    public final y41 J1;

    public x41(y41 y41Var) {
        super(null);
        this.J1 = y41Var;
    }

    @Override
    public final void invalidate() {
        this.J1.invalidate();
    }
}
