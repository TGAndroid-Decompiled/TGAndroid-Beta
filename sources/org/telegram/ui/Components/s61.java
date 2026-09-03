package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class s61 extends ImageReceiver {
    public final t61 f30993a;

    public s61(t61 t61Var) {
        this.f30993a = t61Var;
    }

    @Override
    public final void invalidate() {
        this.f30993a.invalidate();
    }
}
