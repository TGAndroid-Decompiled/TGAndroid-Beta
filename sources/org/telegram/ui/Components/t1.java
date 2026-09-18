package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class t1 implements Runnable {
    public final int f27985a;
    public final MessagesStorage.BooleanCallback f27986b;

    public t1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f27985a = i10;
        this.f27986b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f27985a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f27986b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f27986b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
