package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18521a;
    public final int f18522b;
    public final TLRPC.Updates f18523c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18521a = i11;
        this.f18522b = i10;
        this.f18523c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18521a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18522b, this.f18523c);
                return;
            default:
                MessagesController.getInstance(this.f18522b).processUpdates(this.f18523c, false);
                return;
        }
    }
}
