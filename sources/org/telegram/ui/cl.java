package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class cl implements MessagesStorage.IntCallback {
    public final wn f32727a;

    public cl(wn wnVar) {
        this.f32727a = wnVar;
    }

    @Override
    public final void run(int i10) {
        this.f32727a.G9(i10);
    }
}
