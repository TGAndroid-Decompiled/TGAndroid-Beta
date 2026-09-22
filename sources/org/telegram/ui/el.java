package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class el implements MessagesStorage.IntCallback {
    public final zn f33386a;

    public el(zn znVar) {
        this.f33386a = znVar;
    }

    @Override
    public final void run(int i10) {
        this.f33386a.G9(i10);
    }
}
