package org.telegram.tgnet;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f28591a;
    public final int f28592b;
    public final TLRPC.Updates f28593c;

    public g(int i7, TLRPC.Updates updates, int i10) {
        this.f28591a = i10;
        this.f28592b = i7;
        this.f28593c = updates;
    }

    @Override
    public final void run() {
        switch (this.f28591a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f28592b, this.f28593c);
                return;
            case 1:
                mp.u1(this.f28592b).V3(this.f28593c, false);
                return;
            default:
                mp.u1(this.f28592b).V3(this.f28593c, false);
                return;
        }
    }
}
