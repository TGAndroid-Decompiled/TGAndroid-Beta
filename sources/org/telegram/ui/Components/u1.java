package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class u1 implements Runnable {
    public final int f29085a;
    public final MessagesStorage.BooleanCallback f29086b;

    public u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f29085a = i10;
        this.f29086b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f29085a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f29086b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f29086b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
