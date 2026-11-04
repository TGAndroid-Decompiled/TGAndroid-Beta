package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class w41 extends ImageReceiver {
    public final x41 K1;

    public w41(x41 x41Var) {
        super(null);
        this.K1 = x41Var;
    }

    @Override
    public final void invalidate() {
        this.K1.invalidate();
    }
}
