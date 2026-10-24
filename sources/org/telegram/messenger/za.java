package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f20287a;
    public final MessagesController f20288b;
    public final TLRPC.TL_help_peerColors f20289c;

    public za(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f20287a = i10;
        this.f20288b = messagesController;
        this.f20289c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f20287a) {
            case 0:
                this.f20288b.lambda$checkPeerColors$493(this.f20289c);
                return;
            default:
                this.f20288b.lambda$checkPeerColors$495(this.f20289c);
                return;
        }
    }
}
