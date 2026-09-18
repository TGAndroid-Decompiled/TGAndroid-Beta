package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class t1 implements Runnable {
    public final int f28275a;
    public final MessagesStorage.BooleanCallback f28276b;

    public t1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f28275a = i10;
        this.f28276b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f28275a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f28276b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f28276b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
