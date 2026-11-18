package org.telegram.tgnet;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f28589a;
    public final int f28590b;
    public final TLRPC.Updates f28591c;

    public g(int i7, TLRPC.Updates updates, int i10) {
        this.f28589a = i10;
        this.f28590b = i7;
        this.f28591c = updates;
    }

    @Override
    public final void run() {
        switch (this.f28589a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f28590b, this.f28591c);
                return;
            case 1:
                mp.u1(this.f28590b).V3(this.f28591c, false);
                return;
            default:
                mp.u1(this.f28590b).V3(this.f28591c, false);
                return;
        }
    }
}
