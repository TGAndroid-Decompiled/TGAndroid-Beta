package org.telegram.tgnet;

import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f19981a;
    public final int f19982b;
    public final TLRPC.Updates f19983c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f19981a = i11;
        this.f19982b = i10;
        this.f19983c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19981a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f19982b, this.f19983c);
                return;
            case 1:
                wp.r1(this.f19982b).L3(this.f19983c, false);
                return;
            default:
                wp.r1(this.f19982b).L3(this.f19983c, false);
                return;
        }
    }
}
