package org.telegram.tgnet;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f27139a;
    public final int f27140b;
    public final TLRPC.Updates f27141c;

    public g(int i7, TLRPC.Updates updates, int i10) {
        this.f27139a = i10;
        this.f27140b = i7;
        this.f27141c = updates;
    }

    @Override
    public final void run() {
        switch (this.f27139a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f27140b, this.f27141c);
                return;
            case 1:
                qp.s1(this.f27140b).O3(this.f27141c, false);
                return;
            default:
                qp.s1(this.f27140b).O3(this.f27141c, false);
                return;
        }
    }
}
