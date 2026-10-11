package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class hl implements MessagesStorage.IntCallback {
    public final zn f38501a;

    public hl(zn znVar) {
        this.f38501a = znVar;
    }

    @Override
    public final void run(int i10) {
        this.f38501a.L9(i10);
    }
}
