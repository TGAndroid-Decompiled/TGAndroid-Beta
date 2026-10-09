package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class u71 extends ImageReceiver {
    public final v71 f31393a;

    public u71(v71 v71Var) {
        this.f31393a = v71Var;
    }

    @Override
    public final void invalidate() {
        this.f31393a.invalidate();
    }
}
