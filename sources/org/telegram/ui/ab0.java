package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ab0 implements Runnable {
    public final int f31994a;
    public final bb0 f31995b;
    public final AccountInstance f31996c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 e;

    public ab0(bb0 bb0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f31994a = i10;
        this.f31995b = bb0Var;
        this.f31996c = accountInstance;
        this.d = j3;
        this.e = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f31994a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ab0(this.f31995b, this.f31996c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f31996c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f31995b.f32301g, this.e, accountInstance);
                return;
        }
    }
}
