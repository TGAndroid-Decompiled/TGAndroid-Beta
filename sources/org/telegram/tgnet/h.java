package org.telegram.tgnet;

import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f19980a;
    public final int f19981b;
    public final TLRPC.Updates f19982c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f19980a = i11;
        this.f19981b = i10;
        this.f19982c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19980a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f19981b, this.f19982c);
                return;
            case 1:
                vp.r1(this.f19981b).L3(this.f19982c, false);
                return;
            default:
                vp.r1(this.f19981b).L3(this.f19982c, false);
                return;
        }
    }
}
