package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;

public final class g implements Runnable {

    public final int f22563a;

    public final int f22564b;

    public final TLRPC.Updates f22565c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f22563a = i11;
        this.f22564b = i10;
        this.f22565c = updates;
    }

    @Override
    public final void run() {
        switch (this.f22563a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f22564b, this.f22565c);
                break;
            default:
                MessagesController.getInstance(this.f22564b).processUpdates(this.f22565c, false);
                break;
        }
    }
}
