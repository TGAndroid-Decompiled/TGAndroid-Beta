package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ho implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, mc0, MessagesStorage.BooleanCallback {
    public final int f39942a;
    public final oo f39943b;

    public ho(oo ooVar, int i10) {
        this.f39942a = i10;
        this.f39943b = ooVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        oo ooVar = this.f39943b;
        TLRPC.ChatFull chatFull = ooVar.f42160x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        ooVar.q0(false, true);
        ooVar.getMessagesController().loadFullChat(ooVar.f42156v0, 0, true);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39942a) {
            case 0:
                this.f39943b.k0();
                return;
            case 1:
                this.f39943b.finishFragment();
                return;
            case 2:
                this.f39943b.k0();
                return;
            default:
                this.f39943b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        oo ooVar = this.f39943b;
        ooVar.getClass();
        if (AndroidUtilities.isTablet()) {
            ooVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-ooVar.f42156v0));
        } else {
            ooVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        ooVar.finishFragment();
        ooVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-ooVar.f42158w0.f22028id), null, ooVar.f42158w0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f39942a) {
            case 4:
                this.f39943b.u0(Long.valueOf(j10));
                return;
            default:
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                oo ooVar = this.f39943b;
                if (i10 == 0) {
                    ooVar.M0 = false;
                    return;
                }
                ooVar.f42156v0 = j10;
                ooVar.f42158w0 = ooVar.getMessagesController().getChat(Long.valueOf(j10));
                ooVar.M0 = false;
                TLRPC.ChatFull chatFull = ooVar.f42160x0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                ooVar.k0();
                return;
        }
    }
}
