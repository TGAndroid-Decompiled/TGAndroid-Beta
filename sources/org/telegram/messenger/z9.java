package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z9 implements RequestDelegate {
    public final int f21980a;
    public final MessagesController f21981b;
    public final long f21982c;

    public z9(MessagesController messagesController, long j10, int i10) {
        this.f21980a = i10;
        this.f21981b = messagesController;
        this.f21982c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21980a) {
            case 0:
                this.f21981b.lambda$markMessageAsRead2$234(this.f21982c, tLObject, tL_error);
                return;
            case 1:
                this.f21981b.lambda$markMessageAsRead2$235(this.f21982c, tLObject, tL_error);
                return;
            case 2:
                this.f21981b.lambda$pinDialog$365(this.f21982c, tLObject, tL_error);
                return;
            case 3:
                this.f21981b.lambda$saveWallpaperToServer$120(this.f21982c, tLObject, tL_error);
                return;
            case 4:
                this.f21981b.lambda$updateTimerProc$159(this.f21982c, tLObject, tL_error);
                return;
            case 5:
                this.f21981b.lambda$deleteUserPhoto$114(this.f21982c, tLObject, tL_error);
                return;
            case 6:
                this.f21981b.lambda$reorderPinnedDialogs$364(this.f21982c, tLObject, tL_error);
                return;
            case 7:
                this.f21981b.lambda$loadPeerSettings$79(this.f21982c, tLObject, tL_error);
                return;
            case 8:
                this.f21981b.lambda$setChannelSlowMode$93(this.f21982c, tLObject, tL_error);
                return;
            case 9:
                this.f21981b.lambda$loadChannelAdmins$64(this.f21982c, tLObject, tL_error);
                return;
            case 10:
                this.f21981b.lambda$deleteDialog$140(this.f21982c, tLObject, tL_error);
                return;
            case 11:
                this.f21981b.lambda$addDialogToFolder$197(this.f21982c, tLObject, tL_error);
                return;
            case 12:
                this.f21981b.lambda$setDefaultSendAs$274(this.f21982c, tLObject, tL_error);
                return;
            case 13:
                this.f21981b.lambda$deleteMessages$121(this.f21982c, tLObject, tL_error);
                return;
            case 14:
                this.f21981b.lambda$deleteMessages$122(this.f21982c, tLObject, tL_error);
                return;
            case 15:
                this.f21981b.lambda$deleteMessages$124(this.f21982c, tLObject, tL_error);
                return;
            case 16:
                this.f21981b.lambda$setBoostsToUnblockRestrictions$95(this.f21982c, tLObject, tL_error);
                return;
            default:
                this.f21981b.lambda$markDialogAsUnread$361(this.f21982c, tLObject, tL_error);
                return;
        }
    }
}
