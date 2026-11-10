package org.telegram.tgnet;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f27146a;
    public final int f27147b;
    public final TLRPC.Updates f27148c;

    public g(int i7, TLRPC.Updates updates, int i10) {
        this.f27146a = i10;
        this.f27147b = i7;
        this.f27148c = updates;
    }

    @Override
    public final void run() {
        switch (this.f27146a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f27147b, this.f27148c);
                return;
            case 1:
                qp.s1(this.f27147b).O3(this.f27148c, false);
                return;
            default:
                qp.s1(this.f27147b).O3(this.f27148c, false);
                return;
        }
    }
}
