package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f19659a;
    public final MessagesController f19660b;
    public final TLRPC.TL_help_peerColors f19661c;

    public ya(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19659a = i10;
        this.f19660b = messagesController;
        this.f19661c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19659a) {
            case 0:
                this.f19660b.lambda$checkPeerColors$493(this.f19661c);
                return;
            default:
                this.f19660b.lambda$checkPeerColors$495(this.f19661c);
                return;
        }
    }
}
