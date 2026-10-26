package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ia0 implements Runnable {
    public final int f40199a;
    public final ja0 f40200b;
    public final AccountInstance f40201c;
    public final long d;
    public final org.telegram.ui.ActionBar.r2 e;

    public ia0(ja0 ja0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.f40199a = i10;
        this.f40200b = ja0Var;
        this.f40201c = accountInstance;
        this.d = j10;
        this.e = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f40199a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ia0(this.f40200b, this.f40201c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f40201c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f40200b.f40545g, this.e, accountInstance);
                return;
        }
    }
}
