package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class u1 implements Runnable {
    public final int f31014a;
    public final MessagesStorage.BooleanCallback f31015b;

    public u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f31014a = i10;
        this.f31015b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f31014a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f31015b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f31015b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
