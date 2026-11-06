package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yv implements Runnable {
    public final int f26740a;
    public final dw f26741b;
    public final TLRPC.TL_encryptedChatDiscarded f26742c;

    public yv(dw dwVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.f26740a = i7;
        this.f26741b = dwVar;
        this.f26742c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i7 = this.f26740a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f26742c;
        dw dwVar = this.f26741b;
        switch (i7) {
            case 0:
                dwVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                dwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
            default:
                dwVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                dwVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                dwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
        }
    }
}
