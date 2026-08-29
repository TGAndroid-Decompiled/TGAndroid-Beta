package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ha0 implements Runnable {
    public final int f38834a;
    public final ia0 f38835b;
    public final AccountInstance f38836c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 f38837e;

    public ha0(ia0 ia0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f38834a = i10;
        this.f38835b = ia0Var;
        this.f38836c = accountInstance;
        this.d = j10;
        this.f38837e = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f38834a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ha0(this.f38835b, this.f38836c, this.d, this.f38837e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f38836c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f38835b.f39187g, this.f38837e, accountInstance);
                return;
        }
    }
}
