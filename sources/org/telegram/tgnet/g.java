package org.telegram.tgnet;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f28617a;
    public final int f28618b;
    public final TLRPC.Updates f28619c;

    public g(int i7, TLRPC.Updates updates, int i10) {
        this.f28617a = i10;
        this.f28618b = i7;
        this.f28619c = updates;
    }

    @Override
    public final void run() {
        switch (this.f28617a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f28618b, this.f28619c);
                return;
            case 1:
                mp.u1(this.f28618b).V3(this.f28619c, false);
                return;
            default:
                mp.u1(this.f28618b).V3(this.f28619c, false);
                return;
        }
    }
}
