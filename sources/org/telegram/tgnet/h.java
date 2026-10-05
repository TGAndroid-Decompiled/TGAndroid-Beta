package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f20233a;
    public final int f20234b;
    public final TLRPC.Updates f20235c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f20233a = i11;
        this.f20234b = i10;
        this.f20235c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20233a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20234b, this.f20235c);
                return;
            default:
                MessagesController.getInstance(this.f20234b).processUpdates(this.f20235c, false);
                return;
        }
    }
}
