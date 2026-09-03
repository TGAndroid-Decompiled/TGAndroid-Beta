package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class u1 implements Runnable {
    public final int f31468a;
    public final MessagesStorage.BooleanCallback f31469b;

    public u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f31468a = i10;
        this.f31469b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f31468a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f31469b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f31469b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
