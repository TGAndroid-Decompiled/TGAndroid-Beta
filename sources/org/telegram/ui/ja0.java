package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ja0 implements Runnable {
    public final int f38517a;
    public final ka0 f38518b;
    public final AccountInstance f38519c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 e;

    public ja0(ka0 ka0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f38517a = i10;
        this.f38518b = ka0Var;
        this.f38519c = accountInstance;
        this.d = j10;
        this.e = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f38517a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ja0(this.f38518b, this.f38519c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f38519c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f38518b.f38886g, this.e, accountInstance);
                return;
        }
    }
}
