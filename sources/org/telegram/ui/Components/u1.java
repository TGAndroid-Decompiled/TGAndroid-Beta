package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class u1 implements Runnable {
    public final int f30814a;
    public final MessagesStorage.BooleanCallback f30815b;

    public u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f30814a = i10;
        this.f30815b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f30814a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f30815b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f30815b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
