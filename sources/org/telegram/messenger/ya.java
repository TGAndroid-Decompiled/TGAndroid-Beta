package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f19083a;
    public final MessagesController f19084b;
    public final TLRPC.TL_help_peerColors f19085c;

    public ya(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19083a = i10;
        this.f19084b = messagesController;
        this.f19085c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19083a) {
            case 0:
                this.f19084b.lambda$checkPeerColors$493(this.f19085c);
                return;
            default:
                this.f19084b.lambda$checkPeerColors$495(this.f19085c);
                return;
        }
    }
}
