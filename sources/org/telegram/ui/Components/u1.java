package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class u1 implements Runnable {
    public final int f29560a;
    public final MessagesStorage.BooleanCallback f29561b;

    public u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f29560a = i10;
        this.f29561b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f29560a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f29561b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f29561b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
