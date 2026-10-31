package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class f61 extends ImageReceiver {
    public final g61 J1;

    public f61(g61 g61Var) {
        super(null);
        this.J1 = g61Var;
    }

    @Override
    public final void invalidate() {
        this.J1.invalidate();
    }
}
