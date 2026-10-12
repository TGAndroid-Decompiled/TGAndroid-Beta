package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ll implements MessagesStorage.IntCallback {
    public final eo f39779a;

    public ll(eo eoVar) {
        this.f39779a = eoVar;
    }

    @Override
    public final void run(int i10) {
        this.f39779a.L9(i10);
    }
}
