package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f20461a;
    public final int f20462b;
    public final TLRPC.Updates f20463c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f20461a = i11;
        this.f20462b = i10;
        this.f20463c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20461a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20462b, this.f20463c);
                return;
            default:
                MessagesController.getInstance(this.f20462b).lambda$processUpdates$377(this.f20463c, false);
                return;
        }
    }
}
