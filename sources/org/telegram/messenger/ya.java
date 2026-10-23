package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f20215a;
    public final MessagesController f20216b;
    public final TLRPC.TL_help_peerColors f20217c;

    public ya(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f20215a = i10;
        this.f20216b = messagesController;
        this.f20217c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f20215a) {
            case 0:
                this.f20216b.lambda$checkPeerColors$493(this.f20217c);
                return;
            default:
                this.f20216b.lambda$checkPeerColors$495(this.f20217c);
                return;
        }
    }
}
