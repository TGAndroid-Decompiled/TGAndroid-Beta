package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class cl implements MessagesStorage.IntCallback {
    public final wn f38378a;

    public cl(wn wnVar) {
        this.f38378a = wnVar;
    }

    @Override
    public final void run(int i10) {
        this.f38378a.S9(i10);
    }
}
