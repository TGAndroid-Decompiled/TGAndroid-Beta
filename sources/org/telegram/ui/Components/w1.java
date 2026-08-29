package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class w1 implements Runnable {
    public final int f34264a;
    public final MessagesStorage.BooleanCallback f34265b;

    public w1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f34264a = i10;
        this.f34265b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f34264a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f34265b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f34265b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
