package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cb0 implements Runnable {
    public final int f34804a;
    public final db0 f34805b;
    public final AccountInstance f34806c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 e;

    public cb0(db0 db0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f34804a = i10;
        this.f34805b = db0Var;
        this.f34806c = accountInstance;
        this.d = j10;
        this.e = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f34804a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cb0(this.f34805b, this.f34806c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f34806c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f34805b.f35213g, this.e, accountInstance);
                return;
        }
    }
}
