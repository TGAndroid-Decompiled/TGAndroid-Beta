package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class t1 implements Runnable {
    public final int f31004a;
    public final MessagesStorage.BooleanCallback f31005b;

    public t1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f31004a = i10;
        this.f31005b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f31004a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f31005b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f31005b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
