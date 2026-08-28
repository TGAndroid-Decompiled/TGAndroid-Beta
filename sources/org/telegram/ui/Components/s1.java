package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class s1 implements Runnable {
    public final int f32332a;
    public final MessagesStorage.BooleanCallback f32333b;

    public s1(MessagesStorage.BooleanCallback booleanCallback, int i9) {
        this.f32332a = i9;
        this.f32333b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f32332a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f32333b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    return;
                }
                return;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f32333b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    return;
                }
                return;
        }
    }
}
