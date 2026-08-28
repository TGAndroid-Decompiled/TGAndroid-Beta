package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z9 implements RequestDelegate {
    public final int f22320a;
    public final MessagesController f22321b;

    public z9(MessagesController messagesController, int i9) {
        this.f22320a = i9;
        this.f22321b = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22320a) {
            case 0:
                this.f22321b.lambda$updateTimerProc$152(tLObject, tL_error);
                return;
            case 1:
                this.f22321b.lambda$updateTimerProc$153(tLObject, tL_error);
                return;
            case 2:
                this.f22321b.lambda$loadCurrentState$325(tLObject, tL_error);
                return;
            case 3:
                this.f22321b.lambda$getContentSettings$502(tLObject, tL_error);
                return;
            case 4:
                this.f22321b.lambda$sendBotStart$293(tLObject, tL_error);
                return;
            case 5:
                this.f22321b.lambda$loadSignUpNotificationsSettings$207(tLObject, tL_error);
                return;
            case 6:
                this.f22321b.lambda$reloadDialogsReadValue$64(tLObject, tL_error);
                return;
            case 7:
                this.f22321b.lambda$completeReadTask$238(tLObject, tL_error);
                return;
            case 8:
                this.f22321b.lambda$markMentionMessageAsRead$234(tLObject, tL_error);
                return;
            case 9:
                this.f22321b.lambda$toggleChannelForum$286(tLObject, tL_error);
                return;
            case 10:
                this.f22321b.lambda$setDialogHistoryTTL$137(tLObject, tL_error);
                return;
            case 11:
                this.f22321b.lambda$loadUnreadDialogs$362(tLObject, tL_error);
                return;
            case 12:
                this.f22321b.lambda$checkTosUpdate$163(tLObject, tL_error);
                return;
            case 13:
                this.f22321b.lambda$reloadReactionsNotifySettings$205(tLObject, tL_error);
                return;
            case 14:
                this.f22321b.lambda$loadHintDialogs$196(tLObject, tL_error);
                return;
            case 15:
                this.f22321b.lambda$reloadUser$56(tLObject, tL_error);
                return;
            case 16:
                this.f22321b.lambda$processUpdateArray$414(tLObject, tL_error);
                return;
            case 17:
                this.f22321b.lambda$markMessageContentAsRead$232(tLObject, tL_error);
                return;
            case 18:
                this.f22321b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                return;
            case 19:
                this.f22321b.lambda$didReceivedNotification$43(tLObject, tL_error);
                return;
            case 20:
                this.f22321b.lambda$loadGlobalNotificationsSettings$203(tLObject, tL_error);
                return;
            case 21:
                this.f22321b.lambda$performLogout$322(tLObject, tL_error);
                return;
            case 22:
                this.f22321b.lambda$checkPeerColors$491(tLObject, tL_error);
                return;
            case 23:
                this.f22321b.lambda$checkPeerColors$493(tLObject, tL_error);
                return;
            case 24:
                this.f22321b.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                return;
            case 25:
                this.f22321b.lambda$toggleChannelInvitesHistory$288(tLObject, tL_error);
                return;
            default:
                this.f22321b.lambda$toggleChannelSignatures$284(tLObject, tL_error);
                return;
        }
    }
}
