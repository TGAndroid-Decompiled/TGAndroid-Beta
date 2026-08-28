package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class t51 extends ImageReceiver {
    public final u51 f32629a;

    public t51(u51 u51Var) {
        this.f32629a = u51Var;
    }

    @Override
    public final void invalidate() {
        this.f32629a.invalidate();
    }
}
