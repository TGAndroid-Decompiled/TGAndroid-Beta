package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z9 implements RequestDelegate {
    public final int f19985a;
    public final MessagesController f19986b;
    public final long f19987c;

    public z9(MessagesController messagesController, long j3, int i10) {
        this.f19985a = i10;
        this.f19986b = messagesController;
        this.f19987c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19985a) {
            case 0:
                this.f19986b.lambda$markMessageAsRead2$234(this.f19987c, tLObject, tL_error);
                return;
            case 1:
                this.f19986b.lambda$markMessageAsRead2$235(this.f19987c, tLObject, tL_error);
                return;
            case 2:
                this.f19986b.lambda$pinDialog$363(this.f19987c, tLObject, tL_error);
                return;
            case 3:
                this.f19986b.lambda$saveWallpaperToServer$120(this.f19987c, tLObject, tL_error);
                return;
            case 4:
                this.f19986b.lambda$updateTimerProc$159(this.f19987c, tLObject, tL_error);
                return;
            case 5:
                this.f19986b.lambda$deleteUserPhoto$114(this.f19987c, tLObject, tL_error);
                return;
            case 6:
                this.f19986b.lambda$reorderPinnedDialogs$362(this.f19987c, tLObject, tL_error);
                return;
            case 7:
                this.f19986b.lambda$loadPeerSettings$79(this.f19987c, tLObject, tL_error);
                return;
            case 8:
                this.f19986b.lambda$setChannelSlowMode$93(this.f19987c, tLObject, tL_error);
                return;
            case 9:
                this.f19986b.lambda$loadChannelAdmins$64(this.f19987c, tLObject, tL_error);
                return;
            case 10:
                this.f19986b.lambda$deleteDialog$140(this.f19987c, tLObject, tL_error);
                return;
            case 11:
                this.f19986b.lambda$addDialogToFolder$197(this.f19987c, tLObject, tL_error);
                return;
            case 12:
                this.f19986b.lambda$setDefaultSendAs$274(this.f19987c, tLObject, tL_error);
                return;
            case 13:
                this.f19986b.lambda$deleteMessages$121(this.f19987c, tLObject, tL_error);
                return;
            case 14:
                this.f19986b.lambda$deleteMessages$122(this.f19987c, tLObject, tL_error);
                return;
            case 15:
                this.f19986b.lambda$deleteMessages$124(this.f19987c, tLObject, tL_error);
                return;
            case 16:
                this.f19986b.lambda$setBoostsToUnblockRestrictions$95(this.f19987c, tLObject, tL_error);
                return;
            default:
                this.f19986b.lambda$markDialogAsUnread$359(this.f19987c, tLObject, tL_error);
                return;
        }
    }
}
