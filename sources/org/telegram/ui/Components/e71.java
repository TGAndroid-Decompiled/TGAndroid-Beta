package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class e71 extends ImageReceiver {
    public final f71 f23945a;

    public e71(f71 f71Var) {
        this.f23945a = f71Var;
    }

    @Override
    public final void invalidate() {
        this.f23945a.invalidate();
    }
}
