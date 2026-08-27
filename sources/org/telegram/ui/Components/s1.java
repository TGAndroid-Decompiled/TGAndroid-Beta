package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

public final class s1 implements Runnable {

    public final int f32290a;

    public final MessagesStorage.BooleanCallback f32291b;

    public s1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.f32290a = i10;
        this.f32291b = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.f32290a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f32291b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                }
                break;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f32291b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                }
                break;
        }
    }
}
