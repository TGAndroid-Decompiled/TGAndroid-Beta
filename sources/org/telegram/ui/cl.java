package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class cl implements MessagesStorage.IntCallback {
    public final xn f35825a;

    public cl(xn xnVar) {
        this.f35825a = xnVar;
    }

    @Override
    public final void run(int i10) {
        this.f35825a.G9(i10);
    }
}
