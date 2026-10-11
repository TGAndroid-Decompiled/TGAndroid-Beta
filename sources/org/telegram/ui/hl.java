package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class hl implements MessagesStorage.IntCallback {
    public final zn f38467a;

    public hl(zn znVar) {
        this.f38467a = znVar;
    }

    @Override
    public final void run(int i10) {
        this.f38467a.L9(i10);
    }
}
