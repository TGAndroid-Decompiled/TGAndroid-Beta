package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class s71 extends ImageReceiver {
    public final t71 f28760a;

    public s71(t71 t71Var) {
        this.f28760a = t71Var;
    }

    @Override
    public final void invalidate() {
        this.f28760a.invalidate();
    }
}
