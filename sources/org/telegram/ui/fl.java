package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class fl implements MessagesStorage.IntCallback {
    public final co f36453a;

    public fl(co coVar) {
        this.f36453a = coVar;
    }

    @Override
    public final void run(int i10) {
        this.f36453a.G9(i10);
    }
}
