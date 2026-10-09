package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class hl implements MessagesStorage.IntCallback {
    public final zn f38369a;

    public hl(zn znVar) {
        this.f38369a = znVar;
    }

    @Override
    public final void run(int i10) {
        this.f38369a.L9(i10);
    }
}
