package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class x1 implements Runnable {
    public final int f34633a;
    public final MessagesStorage.BooleanCallback f34634b;

    public x1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f34633a = i10;
        this.f34634b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f34633a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f34634b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f34634b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
