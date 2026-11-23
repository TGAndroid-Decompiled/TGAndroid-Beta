package org.telegram.tgnet;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f28620a;
    public final int f28621b;
    public final TLRPC.Updates f28622c;

    public g(int i7, TLRPC.Updates updates, int i10) {
        this.f28620a = i10;
        this.f28621b = i7;
        this.f28622c = updates;
    }

    @Override
    public final void run() {
        switch (this.f28620a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f28621b, this.f28622c);
                return;
            case 1:
                np.u1(this.f28621b).V3(this.f28622c, false);
                return;
            default:
                np.u1(this.f28621b).V3(this.f28622c, false);
                return;
        }
    }
}
