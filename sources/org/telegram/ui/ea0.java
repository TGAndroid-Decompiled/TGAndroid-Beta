package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ea0 implements Runnable {
    public final int f37884a;
    public final fa0 f37885b;
    public final AccountInstance f37886c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 f37887e;

    public ea0(fa0 fa0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        this.f37884a = i9;
        this.f37885b = fa0Var;
        this.f37886c = accountInstance;
        this.d = j10;
        this.f37887e = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f37884a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ea0(this.f37885b, this.f37886c, this.d, this.f37887e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f37886c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f37885b.f38199g, this.f37887e, accountInstance);
                return;
        }
    }
}
