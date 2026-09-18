package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class e71 extends ImageReceiver {
    public final f71 f23804a;

    public e71(f71 f71Var) {
        this.f23804a = f71Var;
    }

    @Override
    public final void invalidate() {
        this.f23804a.invalidate();
    }
}
