package org.telegram.tgnet;

import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f27187a;
    public final int f27188b;
    public final TLRPC.Updates f27189c;

    public g(int i3, TLRPC.Updates updates, int i10) {
        this.f27187a = i10;
        this.f27188b = i3;
        this.f27189c = updates;
    }

    @Override
    public final void run() {
        switch (this.f27187a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f27188b, this.f27189c);
                return;
            case 1:
                hp.s1(this.f27188b).O3(this.f27189c, false);
                return;
            default:
                hp.s1(this.f27188b).O3(this.f27189c, false);
                return;
        }
    }
}
