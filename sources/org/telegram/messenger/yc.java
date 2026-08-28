package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yc implements Runnable {
    public final int f22240a;
    public final MessagesController f22241b;
    public final TLRPC.TL_help_peerColors f22242c;

    public yc(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i9) {
        this.f22240a = i9;
        this.f22241b = messagesController;
        this.f22242c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f22240a) {
            case 0:
                this.f22241b.lambda$checkPeerColors$492(this.f22242c);
                return;
            default:
                this.f22241b.lambda$checkPeerColors$490(this.f22242c);
                return;
        }
    }
}
