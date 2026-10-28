package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ka0 implements Runnable {
    public final int f40717a;
    public final la0 f40718b;
    public final AccountInstance f40719c;
    public final long d;
    public final org.telegram.ui.ActionBar.r2 e;

    public ka0(la0 la0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.f40717a = i10;
        this.f40718b = la0Var;
        this.f40719c = accountInstance;
        this.d = j10;
        this.e = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f40717a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ka0(this.f40718b, this.f40719c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f40719c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f40718b.f41066g, this.e, accountInstance);
                return;
        }
    }
}
