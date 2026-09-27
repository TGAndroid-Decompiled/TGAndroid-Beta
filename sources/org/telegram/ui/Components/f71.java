package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class f71 extends ImageReceiver {
    public final g71 f24199a;

    public f71(g71 g71Var) {
        this.f24199a = g71Var;
    }

    @Override
    public final void invalidate() {
        this.f24199a.invalidate();
    }
}
