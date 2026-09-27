package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18513a;
    public final int f18514b;
    public final TLRPC.Updates f18515c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18513a = i11;
        this.f18514b = i10;
        this.f18515c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18513a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18514b, this.f18515c);
                return;
            default:
                MessagesController.getInstance(this.f18514b).processUpdates(this.f18515c, false);
                return;
        }
    }
}
