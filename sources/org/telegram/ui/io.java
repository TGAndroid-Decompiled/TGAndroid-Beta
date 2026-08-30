package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class io implements org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, vc0, MessagesStorage.BooleanCallback {
    public final int f35143a;
    public final po f35144b;

    public io(po poVar, int i10) {
        this.f35143a = i10;
        this.f35144b = poVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        po poVar = this.f35144b;
        TLRPC.ChatFull chatFull = poVar.f37407v0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        poVar.p0(false, true);
        poVar.getMessagesController().loadFullChat(poVar.f37405t0, 0, true);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35143a) {
            case 0:
                this.f35144b.j0();
                return;
            case 1:
                this.f35144b.finishFragment();
                return;
            case 2:
                this.f35144b.j0();
                return;
            default:
                this.f35144b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z4) {
        po poVar = this.f35144b;
        poVar.getClass();
        if (AndroidUtilities.isTablet()) {
            poVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-poVar.f37405t0));
        } else {
            poVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        poVar.finishFragment();
        poVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-poVar.f37406u0.f19184id), null, poVar.f37406u0, Boolean.valueOf(z4));
    }

    @Override
    public void run(long j10) {
        switch (this.f35143a) {
            case 4:
                this.f35144b.t0(Long.valueOf(j10));
                return;
            default:
                po poVar = this.f35144b;
                if (j10 == 0) {
                    poVar.K0 = false;
                    return;
                }
                poVar.f37405t0 = j10;
                poVar.f37406u0 = poVar.getMessagesController().getChat(Long.valueOf(j10));
                poVar.K0 = false;
                TLRPC.ChatFull chatFull = poVar.f37407v0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                poVar.j0();
                return;
        }
    }
}
