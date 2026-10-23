package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class m71 extends ImageReceiver {
    public final n71 f28450a;

    public m71(n71 n71Var) {
        this.f28450a = n71Var;
    }

    @Override
    public final void invalidate() {
        this.f28450a.invalidate();
    }
}
