package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ca0 implements Runnable {
    public final int f35917a;
    public final da0 f35918b;
    public final AccountInstance f35919c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 e;

    public ca0(da0 da0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f35917a = i10;
        this.f35918b = da0Var;
        this.f35919c = accountInstance;
        this.d = j10;
        this.e = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f35917a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ca0(this.f35918b, this.f35919c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f35919c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f35918b.f36322g, this.e, accountInstance);
                return;
        }
    }
}
