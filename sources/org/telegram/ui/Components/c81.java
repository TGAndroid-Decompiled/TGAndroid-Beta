package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class c81 extends ImageReceiver {
    public final d81 f27092a;

    public c81(d81 d81Var) {
        this.f27092a = d81Var;
    }

    @Override
    public final void invalidate() {
        this.f27092a.invalidate();
    }
}
