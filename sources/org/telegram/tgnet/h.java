package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18293a;
    public final int f18294b;
    public final TLRPC.Updates f18295c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18293a = i11;
        this.f18294b = i10;
        this.f18295c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18293a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18294b, this.f18295c);
                return;
            default:
                MessagesController.getInstance(this.f18294b).processUpdates(this.f18295c, false);
                return;
        }
    }
}
