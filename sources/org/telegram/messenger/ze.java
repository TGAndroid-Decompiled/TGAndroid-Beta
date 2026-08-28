package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ze implements Runnable {
    public final int f22338a;
    public final MessagesStorage.IntCallback f22339b;
    public final int[] f22340c;

    public ze(MessagesStorage.IntCallback intCallback, int[] iArr, int i9) {
        this.f22338a = i9;
        this.f22339b = intCallback;
        this.f22340c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f22338a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f22339b, this.f22340c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f22339b, this.f22340c);
                return;
        }
    }
}
