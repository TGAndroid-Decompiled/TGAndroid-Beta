package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class t1 implements Runnable {
    public final int f30917a;
    public final MessagesStorage.BooleanCallback f30918b;

    public t1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f30917a = i10;
        this.f30918b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f30917a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f30918b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f30918b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
