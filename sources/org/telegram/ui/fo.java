package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class fo implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, kc0, MessagesStorage.BooleanCallback {
    public final int f39424a;
    public final mo f39425b;

    public fo(mo moVar, int i10) {
        this.f39424a = i10;
        this.f39425b = moVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        mo moVar = this.f39425b;
        TLRPC.ChatFull chatFull = moVar.f41625x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        moVar.q0(false, true);
        moVar.getMessagesController().loadFullChat(moVar.f41621v0, 0, true);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39424a) {
            case 0:
                this.f39425b.k0();
                return;
            case 1:
                this.f39425b.finishFragment();
                return;
            case 2:
                this.f39425b.k0();
                return;
            default:
                this.f39425b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        mo moVar = this.f39425b;
        moVar.getClass();
        if (AndroidUtilities.isTablet()) {
            moVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-moVar.f41621v0));
        } else {
            moVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        moVar.finishFragment();
        moVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-moVar.f41623w0.f22027id), null, moVar.f41623w0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f39424a) {
            case 4:
                this.f39425b.u0(Long.valueOf(j10));
                return;
            default:
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                mo moVar = this.f39425b;
                if (i10 == 0) {
                    moVar.M0 = false;
                    return;
                }
                moVar.f41621v0 = j10;
                moVar.f41623w0 = moVar.getMessagesController().getChat(Long.valueOf(j10));
                moVar.M0 = false;
                TLRPC.ChatFull chatFull = moVar.f41625x0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                moVar.k0();
                return;
        }
    }
}
