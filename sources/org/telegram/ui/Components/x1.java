package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class x1 implements Runnable {
    public final int f34576a;
    public final MessagesStorage.BooleanCallback f34577b;

    public x1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f34576a = i10;
        this.f34577b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f34576a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f34577b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f34577b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
