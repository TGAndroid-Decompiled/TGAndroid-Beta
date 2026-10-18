package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class al implements MessagesStorage.IntCallback {
    public final sn f35435a;

    public al(sn snVar) {
        this.f35435a = snVar;
    }

    @Override
    public final void run(int i10) {
        this.f35435a.L9(i10);
    }
}
