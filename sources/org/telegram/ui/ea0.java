package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ea0 implements Runnable {
    public final int f36439a;
    public final fa0 f36440b;
    public final AccountInstance f36441c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 e;

    public ea0(fa0 fa0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f36439a = i10;
        this.f36440b = fa0Var;
        this.f36441c = accountInstance;
        this.d = j10;
        this.e = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f36439a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ea0(this.f36440b, this.f36441c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f36441c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f36440b.f36862g, this.e, accountInstance);
                return;
        }
    }
}
