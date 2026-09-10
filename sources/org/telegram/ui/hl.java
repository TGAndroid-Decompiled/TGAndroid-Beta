package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class hl implements MessagesStorage.IntCallback {
    public final eo f33406a;

    public hl(eo eoVar) {
        this.f33406a = eoVar;
    }

    @Override
    public final void run(int i10) {
        this.f33406a.G9(i10);
    }
}
