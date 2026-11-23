package org.telegram.tgnet;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f28680a;
    public final int f28681b;
    public final TLRPC.Updates f28682c;

    public h(int i7, TLRPC.Updates updates, int i10) {
        this.f28680a = i10;
        this.f28681b = i7;
        this.f28682c = updates;
    }

    @Override
    public final void run() {
        switch (this.f28680a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f28681b, this.f28682c);
                return;
            case 1:
                mp.u1(this.f28681b).V3(this.f28682c, false);
                return;
            default:
                mp.u1(this.f28681b).V3(this.f28682c, false);
                return;
        }
    }
}
