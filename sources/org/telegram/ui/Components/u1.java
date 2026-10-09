package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class u1 implements Runnable {
    public final int f31333a;
    public final MessagesStorage.BooleanCallback f31334b;

    public u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f31333a = i10;
        this.f31334b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f31333a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f31334b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f31334b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
