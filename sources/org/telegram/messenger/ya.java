package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f20152a;
    public final MessagesController f20153b;
    public final TLRPC.TL_help_peerColors f20154c;

    public ya(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f20152a = i10;
        this.f20153b = messagesController;
        this.f20154c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f20152a) {
            case 0:
                this.f20153b.lambda$checkPeerColors$493(this.f20154c);
                return;
            default:
                this.f20153b.lambda$checkPeerColors$495(this.f20154c);
                return;
        }
    }
}
