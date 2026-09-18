package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class bb0 implements Runnable {
    public final int f32094a;
    public final cb0 f32095b;
    public final AccountInstance f32096c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 e;

    public bb0(cb0 cb0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f32094a = i10;
        this.f32095b = cb0Var;
        this.f32096c = accountInstance;
        this.d = j3;
        this.e = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f32094a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bb0(this.f32095b, this.f32096c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f32096c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f32095b.f32721g, this.e, accountInstance);
                return;
        }
    }
}
