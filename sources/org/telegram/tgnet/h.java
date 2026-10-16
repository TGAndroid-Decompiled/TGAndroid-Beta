package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f19100a;
    public final int f19101b;
    public final TLRPC.Updates f19102c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f19100a = i11;
        this.f19101b = i10;
        this.f19102c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19100a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f19101b, this.f19102c);
                return;
            default:
                MessagesController.getInstance(this.f19101b).lambda$processUpdates$377(this.f19102c, false);
                return;
        }
    }
}
