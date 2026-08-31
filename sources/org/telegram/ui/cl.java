package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class cl implements MessagesStorage.IntCallback {
    public final xn f35872a;

    public cl(xn xnVar) {
        this.f35872a = xnVar;
    }

    @Override
    public final void run(int i10) {
        this.f35872a.G9(i10);
    }
}
