package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class v1 implements Runnable {
    public final int f27781a;
    public final MessagesStorage.BooleanCallback f27782b;

    public v1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f27781a = i10;
        this.f27782b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f27781a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f27782b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f27782b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
