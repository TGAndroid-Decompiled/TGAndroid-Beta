package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f19658a;
    public final MessagesController f19659b;
    public final TLRPC.TL_help_peerColors f19660c;

    public ya(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19658a = i10;
        this.f19659b = messagesController;
        this.f19660c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19658a) {
            case 0:
                this.f19659b.lambda$checkPeerColors$493(this.f19660c);
                return;
            default:
                this.f19659b.lambda$checkPeerColors$495(this.f19660c);
                return;
        }
    }
}
