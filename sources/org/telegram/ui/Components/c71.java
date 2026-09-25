package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class c71 extends ImageReceiver {
    public final d71 f23276a;

    public c71(d71 d71Var) {
        this.f23276a = d71Var;
    }

    @Override
    public final void invalidate() {
        this.f23276a.invalidate();
    }
}
