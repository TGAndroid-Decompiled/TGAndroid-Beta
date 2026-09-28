package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18520a;
    public final int f18521b;
    public final TLRPC.Updates f18522c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18520a = i11;
        this.f18521b = i10;
        this.f18522c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18520a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18521b, this.f18522c);
                return;
            default:
                MessagesController.getInstance(this.f18521b).processUpdates(this.f18522c, false);
                return;
        }
    }
}
