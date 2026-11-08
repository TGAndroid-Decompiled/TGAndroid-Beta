package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yv implements Runnable {
    public final int f26771a;
    public final dw f26772b;
    public final TLRPC.TL_encryptedChatDiscarded f26773c;

    public yv(dw dwVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.f26771a = i7;
        this.f26772b = dwVar;
        this.f26773c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i7 = this.f26771a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f26773c;
        dw dwVar = this.f26772b;
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
