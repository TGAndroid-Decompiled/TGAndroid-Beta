package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f20254a;
    public final int f20255b;
    public final TLRPC.Updates f20256c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f20254a = i11;
        this.f20255b = i10;
        this.f20256c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20254a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20255b, this.f20256c);
                return;
            default:
                MessagesController.getInstance(this.f20255b).lambda$processUpdates$377(this.f20256c, false);
                return;
        }
    }
}
