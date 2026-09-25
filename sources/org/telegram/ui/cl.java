package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class cl implements MessagesStorage.IntCallback {
    public final wn f32744a;

    public cl(wn wnVar) {
        this.f32744a = wnVar;
    }

    @Override
    public final void run(int i10) {
        this.f32744a.G9(i10);
    }
}
