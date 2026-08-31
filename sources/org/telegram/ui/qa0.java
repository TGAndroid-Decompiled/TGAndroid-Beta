package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class qa0 implements Runnable {
    public final int f40419a;
    public final ra0 f40420b;
    public final AccountInstance f40421c;
    public final long d;
    public final org.telegram.ui.ActionBar.p2 f40422e;

    public qa0(ra0 ra0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f40419a = i10;
        this.f40420b = ra0Var;
        this.f40421c = accountInstance;
        this.d = j10;
        this.f40422e = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f40419a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qa0(this.f40420b, this.f40421c, this.d, this.f40422e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f40421c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z4 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.g2.m(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f40420b.f40885g, this.f40422e, accountInstance);
                return;
        }
    }
}
