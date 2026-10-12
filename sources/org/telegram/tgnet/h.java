package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f19400a;
    public final int f19401b;
    public final TLRPC.Updates f19402c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f19400a = i11;
        this.f19401b = i10;
        this.f19402c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19400a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f19401b, this.f19402c);
                return;
            default:
                MessagesController.getInstance(this.f19401b).lambda$processUpdates$377(this.f19402c, false);
                return;
        }
    }
}
