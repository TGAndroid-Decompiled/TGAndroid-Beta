package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class cl implements MessagesStorage.IntCallback {
    public final xn f33388a;

    public cl(xn xnVar) {
        this.f33388a = xnVar;
    }

    @Override
    public final void run(int i10) {
        this.f33388a.G9(i10);
    }
}
