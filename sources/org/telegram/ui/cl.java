package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class cl implements MessagesStorage.IntCallback {
    public final wn f32743a;

    public cl(wn wnVar) {
        this.f32743a = wnVar;
    }

    @Override
    public final void run(int i10) {
        this.f32743a.G9(i10);
    }
}
