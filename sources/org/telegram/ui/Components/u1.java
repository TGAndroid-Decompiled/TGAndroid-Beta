package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class u1 implements Runnable {
    public final int f29233a;
    public final MessagesStorage.BooleanCallback f29234b;

    public u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f29233a = i10;
        this.f29234b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f29233a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f29234b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f29234b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
