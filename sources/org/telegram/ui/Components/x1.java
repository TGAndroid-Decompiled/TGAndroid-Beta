package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class x1 implements Runnable {
    public final int f34579a;
    public final MessagesStorage.BooleanCallback f34580b;

    public x1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f34579a = i10;
        this.f34580b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f34579a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f34580b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f34580b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
