package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class el implements MessagesStorage.IntCallback {
    public final zn f33825a;

    public el(zn znVar) {
        this.f33825a = znVar;
    }

    @Override
    public final void run(int i10) {
        this.f33825a.G9(i10);
    }
}
