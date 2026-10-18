package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class al implements MessagesStorage.IntCallback {
    public final sn f35474a;

    public al(sn snVar) {
        this.f35474a = snVar;
    }

    @Override
    public final void run(int i10) {
        this.f35474a.L9(i10);
    }
}
