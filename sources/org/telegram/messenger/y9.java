package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dc0;
public final class y9 implements RequestDelegate {
    public final int f19922a;
    public final Object f19923b;
    public final boolean f19924c;
    public final long d;
    public final Object f19925e;

    public y9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19922a = 0;
        this.f19923b = messagesController;
        this.f19924c = z10;
        this.f19925e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19922a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19923b).lambda$deleteParticipantFromChat$315(this.f19924c, (TLRPC.User) this.f19925e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19923b).lambda$checkChatInviter$374((TLRPC.Chat) this.f19925e, this.f19924c, this.d, tLObject, tL_error);
                return;
            case 2:
                i90.u((i90) this.f19923b, this.d, this.f19924c, (TLRPC.TL_messages_importChatInvite) this.f19925e, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.i3((dc0) this.f19923b, tLObject, this.d, (String) this.f19925e, this.f19924c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.i3((yh.g) this.f19923b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19925e, this.f19924c, this.d));
                return;
        }
    }

    public y9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19922a = i10;
        this.f19923b = notificationCenterDelegate;
        this.f19925e = obj;
        this.f19924c = z10;
        this.d = j3;
    }

    public y9(i90 i90Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19922a = 2;
        this.f19923b = i90Var;
        this.d = j3;
        this.f19924c = z10;
        this.f19925e = tL_messages_importChatInvite;
    }

    public y9(dc0 dc0Var, long j3, String str, boolean z10) {
        this.f19922a = 3;
        this.f19923b = dc0Var;
        this.d = j3;
        this.f19925e = str;
        this.f19924c = z10;
    }
}
