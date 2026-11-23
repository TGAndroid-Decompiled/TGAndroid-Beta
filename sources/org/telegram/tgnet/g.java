package org.telegram.tgnet;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f28584a;
    public final int f28585b;
    public final TLRPC.Updates f28586c;

    public g(int i7, TLRPC.Updates updates, int i10) {
        this.f28584a = i10;
        this.f28585b = i7;
        this.f28586c = updates;
    }

    @Override
    public final void run() {
        switch (this.f28584a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f28585b, this.f28586c);
                return;
            case 1:
                np.u1(this.f28585b).V3(this.f28586c, false);
                return;
            default:
                np.u1(this.f28585b).V3(this.f28586c, false);
                return;
        }
    }
}
