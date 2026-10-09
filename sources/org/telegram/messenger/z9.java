package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z9 implements RequestDelegate {
    public final int f19981a;
    public final MessagesController f19982b;
    public final long f19983c;

    public z9(MessagesController messagesController, long j3, int i10) {
        this.f19981a = i10;
        this.f19982b = messagesController;
        this.f19983c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19981a) {
            case 0:
                this.f19982b.lambda$markMessageAsRead2$234(this.f19983c, tLObject, tL_error);
                return;
            case 1:
                this.f19982b.lambda$markMessageAsRead2$235(this.f19983c, tLObject, tL_error);
                return;
            case 2:
                this.f19982b.lambda$pinDialog$363(this.f19983c, tLObject, tL_error);
                return;
            case 3:
                this.f19982b.lambda$saveWallpaperToServer$120(this.f19983c, tLObject, tL_error);
                return;
            case 4:
                this.f19982b.lambda$updateTimerProc$159(this.f19983c, tLObject, tL_error);
                return;
            case 5:
                this.f19982b.lambda$deleteUserPhoto$114(this.f19983c, tLObject, tL_error);
                return;
            case 6:
                this.f19982b.lambda$reorderPinnedDialogs$362(this.f19983c, tLObject, tL_error);
                return;
            case 7:
                this.f19982b.lambda$loadPeerSettings$79(this.f19983c, tLObject, tL_error);
                return;
            case 8:
                this.f19982b.lambda$setChannelSlowMode$93(this.f19983c, tLObject, tL_error);
                return;
            case 9:
                this.f19982b.lambda$loadChannelAdmins$64(this.f19983c, tLObject, tL_error);
                return;
            case 10:
                this.f19982b.lambda$deleteDialog$140(this.f19983c, tLObject, tL_error);
                return;
            case 11:
                this.f19982b.lambda$addDialogToFolder$197(this.f19983c, tLObject, tL_error);
                return;
            case 12:
                this.f19982b.lambda$setDefaultSendAs$274(this.f19983c, tLObject, tL_error);
                return;
            case 13:
                this.f19982b.lambda$deleteMessages$121(this.f19983c, tLObject, tL_error);
                return;
            case 14:
                this.f19982b.lambda$deleteMessages$122(this.f19983c, tLObject, tL_error);
                return;
            case 15:
                this.f19982b.lambda$deleteMessages$124(this.f19983c, tLObject, tL_error);
                return;
            case 16:
                this.f19982b.lambda$setBoostsToUnblockRestrictions$95(this.f19983c, tLObject, tL_error);
                return;
            default:
                this.f19982b.lambda$markDialogAsUnread$359(this.f19983c, tLObject, tL_error);
                return;
        }
    }
}
