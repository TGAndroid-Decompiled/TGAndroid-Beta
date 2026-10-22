package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f20223a;
    public final MessagesController f20224b;
    public final TLRPC.TL_help_peerColors f20225c;

    public za(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f20223a = i10;
        this.f20224b = messagesController;
        this.f20225c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f20223a) {
            case 0:
                this.f20224b.lambda$checkPeerColors$493(this.f20225c);
                return;
            default:
                this.f20224b.lambda$checkPeerColors$495(this.f20225c);
                return;
        }
    }
}
