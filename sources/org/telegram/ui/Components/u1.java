package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class u1 implements Runnable {
    public final int f30765a;
    public final MessagesStorage.BooleanCallback f30766b;

    public u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f30765a = i10;
        this.f30766b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f30765a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f30766b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f30766b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
