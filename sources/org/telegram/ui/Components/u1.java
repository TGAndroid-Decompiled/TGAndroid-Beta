package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class u1 implements Runnable {
    public final int f29074a;
    public final MessagesStorage.BooleanCallback f29075b;

    public u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f29074a = i10;
        this.f29075b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f29074a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f29075b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f29075b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
