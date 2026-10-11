package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class u1 implements Runnable {
    public final int f31412a;
    public final MessagesStorage.BooleanCallback f31413b;

    public u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f31412a = i10;
        this.f31413b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f31412a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f31413b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f31413b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
