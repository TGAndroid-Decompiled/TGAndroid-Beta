package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class t1 implements Runnable {
    public final int f28258a;
    public final MessagesStorage.BooleanCallback f28259b;

    public t1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f28258a = i10;
        this.f28259b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f28258a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f28259b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f28259b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
