package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f20224a;
    public final int f20225b;
    public final TLRPC.Updates f20226c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f20224a = i11;
        this.f20225b = i10;
        this.f20226c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20224a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20225b, this.f20226c);
                return;
            default:
                MessagesController.getInstance(this.f20225b).lambda$processUpdates$377(this.f20226c, false);
                return;
        }
    }
}
