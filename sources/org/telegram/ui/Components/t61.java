package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class t61 extends ImageReceiver {
    public final u61 f31274a;

    public t61(u61 u61Var) {
        this.f31274a = u61Var;
    }

    @Override
    public final void invalidate() {
        this.f31274a.invalidate();
    }
}
