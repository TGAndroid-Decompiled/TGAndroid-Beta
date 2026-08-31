package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class io implements org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, wc0, MessagesStorage.BooleanCallback {
    public final int f37900a;
    public final po f37901b;

    public io(po poVar, int i10) {
        this.f37900a = i10;
        this.f37901b = poVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        po poVar = this.f37901b;
        TLRPC.ChatFull chatFull = poVar.f40122v0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        poVar.p0(false, true);
        poVar.getMessagesController().loadFullChat(poVar.f40120t0, 0, true);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37900a) {
            case 0:
                this.f37901b.j0();
                return;
            case 1:
                this.f37901b.finishFragment();
                return;
            case 2:
                this.f37901b.j0();
                return;
            default:
                this.f37901b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z4) {
        po poVar = this.f37901b;
        poVar.getClass();
        if (AndroidUtilities.isTablet()) {
            poVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-poVar.f40120t0));
        } else {
            poVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        poVar.finishFragment();
        poVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-poVar.f40121u0.f20843id), null, poVar.f40121u0, Boolean.valueOf(z4));
    }

    @Override
    public void run(long j10) {
        switch (this.f37900a) {
            case 4:
                this.f37901b.t0(Long.valueOf(j10));
                return;
            default:
                po poVar = this.f37901b;
                if (j10 == 0) {
                    poVar.K0 = false;
                    return;
                }
                poVar.f40120t0 = j10;
                poVar.f40121u0 = poVar.getMessagesController().getChat(Long.valueOf(j10));
                poVar.K0 = false;
                TLRPC.ChatFull chatFull = poVar.f40122v0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                poVar.j0();
                return;
        }
    }
}
