package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class bb0 implements Runnable {
    public final int f34285a;
    public final cb0 f34286b;
    public final AccountInstance f34287c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 e;

    public bb0(cb0 cb0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f34285a = i10;
        this.f34286b = cb0Var;
        this.f34287c = accountInstance;
        this.d = j10;
        this.e = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f34285a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bb0(this.f34286b, this.f34287c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f34287c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f34286b.f34530g, this.e, accountInstance);
                return;
        }
    }
}
