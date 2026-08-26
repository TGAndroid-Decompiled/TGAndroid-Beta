package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda88;
import org.telegram.ui.TwoStepVerificationActivity;

public final class BotStarsActivity$$ExternalSyntheticLambda26 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final long f$3;

    public BotStarsActivity$$ExternalSyntheticLambda26(MessagesController messagesController, boolean z, TLRPC.User user, long j) {
        this.$r8$classId = 1;
        this.f$0 = messagesController;
        this.f$2 = z;
        this.f$1 = user;
        this.f$3 = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                BotStarsActivity botStarsActivity = (BotStarsActivity) this.f$0;
                botStarsActivity.getClass();
                AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda88(botStarsActivity, tL_error, tLObject, (TwoStepVerificationActivity) this.f$1, this.f$2, this.f$3));
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$deleteParticipantFromChat$316(this.f$2, (TLRPC.User) this.f$1, this.f$3, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$checkChatInviter$375((TLRPC.Chat) this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            default:
                ((JoinGroupAlert) this.f$0).lambda$new$7(this.f$3, this.f$2, (TLRPC.TL_messages_importChatInvite) this.f$1, tLObject, tL_error);
                break;
        }
    }

    public BotStarsActivity$$ExternalSyntheticLambda26(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = obj;
        this.f$2 = z;
        this.f$3 = j;
    }

    public BotStarsActivity$$ExternalSyntheticLambda26(JoinGroupAlert joinGroupAlert, long j, boolean z, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.$r8$classId = 3;
        this.f$0 = joinGroupAlert;
        this.f$3 = j;
        this.f$2 = z;
        this.f$1 = tL_messages_importChatInvite;
    }
}
