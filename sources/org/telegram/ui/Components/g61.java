package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class g61 extends ImageReceiver {
    public final h61 f28769a;

    public g61(h61 h61Var) {
        this.f28769a = h61Var;
    }

    @Override
    public final void invalidate() {
        this.f28769a.invalidate();
    }
}
