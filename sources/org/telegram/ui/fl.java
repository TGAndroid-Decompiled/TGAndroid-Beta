package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class fl implements MessagesStorage.IntCallback {
    public final co f36452a;

    public fl(co coVar) {
        this.f36452a = coVar;
    }

    @Override
    public final void run(int i10) {
        this.f36452a.G9(i10);
    }
}
