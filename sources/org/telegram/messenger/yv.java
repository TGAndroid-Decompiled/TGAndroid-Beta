package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yv implements Runnable {
    public final int f26775a;
    public final dw f26776b;
    public final TLRPC.TL_encryptedChatDiscarded f26777c;

    public yv(dw dwVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.f26775a = i7;
        this.f26776b = dwVar;
        this.f26777c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i7 = this.f26775a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f26777c;
        dw dwVar = this.f26776b;
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
