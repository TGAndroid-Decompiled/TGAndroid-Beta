package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class y9 implements RequestDelegate {

    public final int f22217a;

    public final MessagesController f22218b;

    public final long f22219c;

    public y9(MessagesController messagesController, long j10, int i10) {
        this.f22217a = i10;
        this.f22218b = messagesController;
        this.f22219c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22217a) {
            case 0:
                this.f22218b.lambda$markMessageAsRead2$235(this.f22219c, tLObject, tL_error);
                break;
            case 1:
                this.f22218b.lambda$markMessageAsRead2$236(this.f22219c, tLObject, tL_error);
                break;
            case 2:
                this.f22218b.lambda$pinDialog$364(this.f22219c, tLObject, tL_error);
                break;
            case 3:
                this.f22218b.lambda$saveWallpaperToServer$121(this.f22219c, tLObject, tL_error);
                break;
            case 4:
                this.f22218b.lambda$updateTimerProc$160(this.f22219c, tLObject, tL_error);
                break;
            case 5:
                this.f22218b.lambda$deleteUserPhoto$115(this.f22219c, tLObject, tL_error);
                break;
            case 6:
                this.f22218b.lambda$reorderPinnedDialogs$363(this.f22219c, tLObject, tL_error);
                break;
            case 7:
                this.f22218b.lambda$loadPeerSettings$80(this.f22219c, tLObject, tL_error);
                break;
            case 8:
                this.f22218b.lambda$setChannelSlowMode$94(this.f22219c, tLObject, tL_error);
                break;
            case 9:
                this.f22218b.lambda$loadChannelAdmins$65(this.f22219c, tLObject, tL_error);
                break;
            case 10:
                this.f22218b.lambda$deleteDialog$141(this.f22219c, tLObject, tL_error);
                break;
            case 11:
                this.f22218b.lambda$addDialogToFolder$198(this.f22219c, tLObject, tL_error);
                break;
            case 12:
                this.f22218b.lambda$setDefaultSendAs$275(this.f22219c, tLObject, tL_error);
                break;
            case 13:
                this.f22218b.lambda$deleteMessages$122(this.f22219c, tLObject, tL_error);
                break;
            case 14:
                this.f22218b.lambda$deleteMessages$123(this.f22219c, tLObject, tL_error);
                break;
            case 15:
                this.f22218b.lambda$deleteMessages$125(this.f22219c, tLObject, tL_error);
                break;
            case 16:
                this.f22218b.lambda$setBoostsToUnblockRestrictions$96(this.f22219c, tLObject, tL_error);
                break;
            default:
                this.f22218b.lambda$markDialogAsUnread$360(this.f22219c, tLObject, tL_error);
                break;
        }
    }
}
