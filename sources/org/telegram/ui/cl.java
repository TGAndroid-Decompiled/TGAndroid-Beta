package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class cl implements MessagesStorage.IntCallback {
    public final xn f32368a;

    public cl(xn xnVar) {
        this.f32368a = xnVar;
    }

    @Override
    public final void run(int i10) {
        this.f32368a.G9(i10);
    }
}
