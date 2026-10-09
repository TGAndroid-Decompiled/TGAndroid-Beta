package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ec0;
public final class y9 implements RequestDelegate {
    public final int f19891a;
    public final Object f19892b;
    public final boolean f19893c;
    public final long d;
    public final Object f19894e;

    public y9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19891a = 0;
        this.f19892b = messagesController;
        this.f19893c = z10;
        this.f19894e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19891a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19892b).lambda$deleteParticipantFromChat$315(this.f19893c, (TLRPC.User) this.f19894e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19892b).lambda$checkChatInviter$374((TLRPC.Chat) this.f19894e, this.f19893c, this.d, tLObject, tL_error);
                return;
            case 2:
                i90.u((i90) this.f19892b, this.d, this.f19893c, (TLRPC.TL_messages_importChatInvite) this.f19894e, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.i3((ec0) this.f19892b, tLObject, this.d, (String) this.f19894e, this.f19893c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.i3((yh.g) this.f19892b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19894e, this.f19893c, this.d));
                return;
        }
    }

    public y9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19891a = i10;
        this.f19892b = notificationCenterDelegate;
        this.f19894e = obj;
        this.f19893c = z10;
        this.d = j3;
    }

    public y9(i90 i90Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19891a = 2;
        this.f19892b = i90Var;
        this.d = j3;
        this.f19893c = z10;
        this.f19894e = tL_messages_importChatInvite;
    }

    public y9(ec0 ec0Var, long j3, String str, boolean z10) {
        this.f19891a = 3;
        this.f19892b = ec0Var;
        this.d = j3;
        this.f19894e = str;
        this.f19893c = z10;
    }
}
