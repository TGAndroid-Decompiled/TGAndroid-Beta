package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z9 implements RequestDelegate {
    public final int f20018a;
    public final MessagesController f20019b;
    public final long f20020c;

    public z9(MessagesController messagesController, long j3, int i10) {
        this.f20018a = i10;
        this.f20019b = messagesController;
        this.f20020c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20018a) {
            case 0:
                this.f20019b.lambda$markMessageAsRead2$234(this.f20020c, tLObject, tL_error);
                return;
            case 1:
                this.f20019b.lambda$markMessageAsRead2$235(this.f20020c, tLObject, tL_error);
                return;
            case 2:
                this.f20019b.lambda$pinDialog$363(this.f20020c, tLObject, tL_error);
                return;
            case 3:
                this.f20019b.lambda$saveWallpaperToServer$120(this.f20020c, tLObject, tL_error);
                return;
            case 4:
                this.f20019b.lambda$updateTimerProc$159(this.f20020c, tLObject, tL_error);
                return;
            case 5:
                this.f20019b.lambda$deleteUserPhoto$114(this.f20020c, tLObject, tL_error);
                return;
            case 6:
                this.f20019b.lambda$reorderPinnedDialogs$362(this.f20020c, tLObject, tL_error);
                return;
            case 7:
                this.f20019b.lambda$loadPeerSettings$79(this.f20020c, tLObject, tL_error);
                return;
            case 8:
                this.f20019b.lambda$setChannelSlowMode$93(this.f20020c, tLObject, tL_error);
                return;
            case 9:
                this.f20019b.lambda$loadChannelAdmins$64(this.f20020c, tLObject, tL_error);
                return;
            case 10:
                this.f20019b.lambda$deleteDialog$140(this.f20020c, tLObject, tL_error);
                return;
            case 11:
                this.f20019b.lambda$addDialogToFolder$197(this.f20020c, tLObject, tL_error);
                return;
            case 12:
                this.f20019b.lambda$setDefaultSendAs$274(this.f20020c, tLObject, tL_error);
                return;
            case 13:
                this.f20019b.lambda$deleteMessages$121(this.f20020c, tLObject, tL_error);
                return;
            case 14:
                this.f20019b.lambda$deleteMessages$122(this.f20020c, tLObject, tL_error);
                return;
            case 15:
                this.f20019b.lambda$deleteMessages$124(this.f20020c, tLObject, tL_error);
                return;
            case 16:
                this.f20019b.lambda$setBoostsToUnblockRestrictions$95(this.f20020c, tLObject, tL_error);
                return;
            default:
                this.f20019b.lambda$markDialogAsUnread$359(this.f20020c, tLObject, tL_error);
                return;
        }
    }
}
