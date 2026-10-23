package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class t1 implements Runnable {
    public final int f30590a;
    public final MessagesStorage.BooleanCallback f30591b;

    public t1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f30590a = i10;
        this.f30591b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f30590a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f30591b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f30591b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
