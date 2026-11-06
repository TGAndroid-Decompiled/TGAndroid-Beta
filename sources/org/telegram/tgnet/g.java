package org.telegram.tgnet;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f27138a;
    public final int f27139b;
    public final TLRPC.Updates f27140c;

    public g(int i7, TLRPC.Updates updates, int i10) {
        this.f27138a = i10;
        this.f27139b = i7;
        this.f27140c = updates;
    }

    @Override
    public final void run() {
        switch (this.f27138a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f27139b, this.f27140c);
                return;
            case 1:
                qp.s1(this.f27139b).O3(this.f27140c, false);
                return;
            default:
                qp.s1(this.f27139b).O3(this.f27140c, false);
                return;
        }
    }
}
