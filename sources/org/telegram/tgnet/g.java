package org.telegram.tgnet;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f28237a;
    public final int f28238b;
    public final TLRPC.Updates f28239c;

    public g(int i7, TLRPC.Updates updates, int i10) {
        this.f28237a = i10;
        this.f28238b = i7;
        this.f28239c = updates;
    }

    @Override
    public final void run() {
        switch (this.f28237a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f28238b, this.f28239c);
                return;
            case 1:
                np.s1(this.f28238b).O3(this.f28239c, false);
                return;
            default:
                np.s1(this.f28238b).O3(this.f28239c, false);
                return;
        }
    }
}
