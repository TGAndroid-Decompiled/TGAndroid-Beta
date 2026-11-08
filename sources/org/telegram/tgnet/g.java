package org.telegram.tgnet;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f27142a;
    public final int f27143b;
    public final TLRPC.Updates f27144c;

    public g(int i7, TLRPC.Updates updates, int i10) {
        this.f27142a = i10;
        this.f27143b = i7;
        this.f27144c = updates;
    }

    @Override
    public final void run() {
        switch (this.f27142a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f27143b, this.f27144c);
                return;
            case 1:
                qp.s1(this.f27143b).O3(this.f27144c, false);
                return;
            default:
                qp.s1(this.f27143b).O3(this.f27144c, false);
                return;
        }
    }
}
