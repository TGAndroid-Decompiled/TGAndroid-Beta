package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dc0;
public final class y9 implements RequestDelegate {
    public final int f19886a;
    public final Object f19887b;
    public final boolean f19888c;
    public final long d;
    public final Object f19889e;

    public y9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19886a = 0;
        this.f19887b = messagesController;
        this.f19888c = z10;
        this.f19889e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19886a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19887b).lambda$deleteParticipantFromChat$315(this.f19888c, (TLRPC.User) this.f19889e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19887b).lambda$checkChatInviter$374((TLRPC.Chat) this.f19889e, this.f19888c, this.d, tLObject, tL_error);
                return;
            case 2:
                j90.u((j90) this.f19887b, this.d, this.f19888c, (TLRPC.TL_messages_importChatInvite) this.f19889e, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.i3((dc0) this.f19887b, tLObject, this.d, (String) this.f19889e, this.f19888c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.i3((yh.g) this.f19887b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19889e, this.f19888c, this.d));
                return;
        }
    }

    public y9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19886a = i10;
        this.f19887b = notificationCenterDelegate;
        this.f19889e = obj;
        this.f19888c = z10;
        this.d = j3;
    }

    public y9(j90 j90Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19886a = 2;
        this.f19887b = j90Var;
        this.d = j3;
        this.f19888c = z10;
        this.f19889e = tL_messages_importChatInvite;
    }

    public y9(dc0 dc0Var, long j3, String str, boolean z10) {
        this.f19886a = 3;
        this.f19887b = dc0Var;
        this.d = j3;
        this.f19889e = str;
        this.f19888c = z10;
    }
}
