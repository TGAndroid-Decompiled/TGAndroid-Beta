package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class hl implements MessagesStorage.IntCallback {
    public final zn f38415a;

    public hl(zn znVar) {
        this.f38415a = znVar;
    }

    @Override
    public final void run(int i10) {
        this.f38415a.L9(i10);
    }
}
