package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y9 implements RequestDelegate {
    public final int f20137a;
    public final MessagesController f20138b;
    public final long f20139c;

    public y9(MessagesController messagesController, long j10, int i10) {
        this.f20137a = i10;
        this.f20138b = messagesController;
        this.f20139c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20137a) {
            case 0:
                this.f20138b.lambda$markMessageAsRead2$234(this.f20139c, tLObject, tL_error);
                return;
            case 1:
                this.f20138b.lambda$markMessageAsRead2$235(this.f20139c, tLObject, tL_error);
                return;
            case 2:
                this.f20138b.lambda$pinDialog$363(this.f20139c, tLObject, tL_error);
                return;
            case 3:
                this.f20138b.lambda$saveWallpaperToServer$120(this.f20139c, tLObject, tL_error);
                return;
            case 4:
                this.f20138b.lambda$updateTimerProc$159(this.f20139c, tLObject, tL_error);
                return;
            case 5:
                this.f20138b.lambda$deleteUserPhoto$114(this.f20139c, tLObject, tL_error);
                return;
            case 6:
                this.f20138b.lambda$reorderPinnedDialogs$362(this.f20139c, tLObject, tL_error);
                return;
            case 7:
                this.f20138b.lambda$loadPeerSettings$79(this.f20139c, tLObject, tL_error);
                return;
            case 8:
                this.f20138b.lambda$setChannelSlowMode$93(this.f20139c, tLObject, tL_error);
                return;
            case 9:
                this.f20138b.lambda$loadChannelAdmins$64(this.f20139c, tLObject, tL_error);
                return;
            case 10:
                this.f20138b.lambda$deleteDialog$140(this.f20139c, tLObject, tL_error);
                return;
            case 11:
                this.f20138b.lambda$addDialogToFolder$197(this.f20139c, tLObject, tL_error);
                return;
            case 12:
                this.f20138b.lambda$setDefaultSendAs$274(this.f20139c, tLObject, tL_error);
                return;
            case 13:
                this.f20138b.lambda$deleteMessages$121(this.f20139c, tLObject, tL_error);
                return;
            case 14:
                this.f20138b.lambda$deleteMessages$122(this.f20139c, tLObject, tL_error);
                return;
            case 15:
                this.f20138b.lambda$deleteMessages$124(this.f20139c, tLObject, tL_error);
                return;
            case 16:
                this.f20138b.lambda$setBoostsToUnblockRestrictions$95(this.f20139c, tLObject, tL_error);
                return;
            default:
                this.f20138b.lambda$markDialogAsUnread$359(this.f20139c, tLObject, tL_error);
                return;
        }
    }
}
