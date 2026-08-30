package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class pa0 implements Runnable {
    public final int f37261a;
    public final qa0 f37262b;
    public final AccountInstance f37263c;
    public final long d;
    public final org.telegram.ui.ActionBar.p2 e;

    public pa0(qa0 qa0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f37261a = i10;
        this.f37262b = qa0Var;
        this.f37263c = accountInstance;
        this.d = j10;
        this.e = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f37261a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pa0(this.f37262b, this.f37263c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f37263c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z4 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.f2.m(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f37262b.f37692g, this.e, accountInstance);
                return;
        }
    }
}
