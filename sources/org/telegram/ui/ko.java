package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ko implements org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, xc0, MessagesStorage.BooleanCallback {
    public final int f35561a;
    public final ro f35562b;

    public ko(ro roVar, int i10) {
        this.f35561a = i10;
        this.f35562b = roVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ro roVar = this.f35562b;
        TLRPC.ChatFull chatFull = roVar.f37927v0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        roVar.p0(false, true);
        roVar.getMessagesController().loadFullChat(roVar.f37925t0, 0, true);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35561a) {
            case 0:
                this.f35562b.j0();
                return;
            case 1:
                this.f35562b.finishFragment();
                return;
            case 2:
                this.f35562b.j0();
                return;
            default:
                this.f35562b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z4) {
        ro roVar = this.f35562b;
        roVar.getClass();
        if (AndroidUtilities.isTablet()) {
            roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-roVar.f37925t0));
        } else {
            roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        roVar.finishFragment();
        roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-roVar.f37926u0.f19159id), null, roVar.f37926u0, Boolean.valueOf(z4));
    }

    @Override
    public void run(long j10) {
        switch (this.f35561a) {
            case 4:
                this.f35562b.t0(Long.valueOf(j10));
                return;
            default:
                ro roVar = this.f35562b;
                if (j10 == 0) {
                    roVar.K0 = false;
                    return;
                }
                roVar.f37925t0 = j10;
                roVar.f37926u0 = roVar.getMessagesController().getChat(Long.valueOf(j10));
                roVar.K0 = false;
                TLRPC.ChatFull chatFull = roVar.f37927v0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                roVar.j0();
                return;
        }
    }
}
