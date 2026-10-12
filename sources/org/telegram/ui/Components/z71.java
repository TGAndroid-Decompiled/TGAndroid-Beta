package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class z71 extends ImageReceiver {
    public final a81 f33291a;

    public z71(a81 a81Var) {
        this.f33291a = a81Var;
    }

    @Override
    public final void invalidate() {
        this.f33291a.invalidate();
    }
}
