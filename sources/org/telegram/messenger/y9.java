package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ec0;
public final class y9 implements RequestDelegate {
    public final int f19895a;
    public final Object f19896b;
    public final boolean f19897c;
    public final long d;
    public final Object f19898e;

    public y9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19895a = 0;
        this.f19896b = messagesController;
        this.f19897c = z10;
        this.f19898e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19895a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19896b).lambda$deleteParticipantFromChat$315(this.f19897c, (TLRPC.User) this.f19898e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19896b).lambda$checkChatInviter$374((TLRPC.Chat) this.f19898e, this.f19897c, this.d, tLObject, tL_error);
                return;
            case 2:
                j90.u((j90) this.f19896b, this.d, this.f19897c, (TLRPC.TL_messages_importChatInvite) this.f19898e, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.i3((ec0) this.f19896b, tLObject, this.d, (String) this.f19898e, this.f19897c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.i3((yh.g) this.f19896b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19898e, this.f19897c, this.d));
                return;
        }
    }

    public y9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19895a = i10;
        this.f19896b = notificationCenterDelegate;
        this.f19898e = obj;
        this.f19897c = z10;
        this.d = j3;
    }

    public y9(j90 j90Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19895a = 2;
        this.f19896b = j90Var;
        this.d = j3;
        this.f19897c = z10;
        this.f19898e = tL_messages_importChatInvite;
    }

    public y9(ec0 ec0Var, long j3, String str, boolean z10) {
        this.f19895a = 3;
        this.f19896b = ec0Var;
        this.d = j3;
        this.f19898e = str;
        this.f19897c = z10;
    }
}
