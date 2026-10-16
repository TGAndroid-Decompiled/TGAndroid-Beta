package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f18784a;
    public final MessagesController f18785b;
    public final TLRPC.TL_help_peerColors f18786c;

    public ya(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f18784a = i10;
        this.f18785b = messagesController;
        this.f18786c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f18784a) {
            case 0:
                this.f18785b.lambda$checkPeerColors$493(this.f18786c);
                return;
            default:
                this.f18785b.lambda$checkPeerColors$495(this.f18786c);
                return;
        }
    }
}
