package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class ia0 implements Runnable {

    public final int f39015a;

    public final ja0 f39016b;

    public final AccountInstance f39017c;
    public final long d;

    public final org.telegram.ui.ActionBar.n2 f39018e;

    public ia0(ja0 ja0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f39015a = i10;
        this.f39016b = ja0Var;
        this.f39017c = accountInstance;
        this.d = j10;
        this.f39018e = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f39015a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ia0(this.f39016b, this.f39017c, this.d, this.f39018e, 1));
                break;
            default:
                AccountInstance accountInstance = this.f39017c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf(groupCall == null || !groupCall.call.rtmp_stream), this.f39016b.f39320g, this.f39018e, accountInstance);
                break;
        }
    }
}
