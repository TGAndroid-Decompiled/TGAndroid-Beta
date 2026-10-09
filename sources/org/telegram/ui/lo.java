package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class lo implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, cd0, MessagesStorage.BooleanCallback {
    public final int f39643a;
    public final uo f39644b;

    public lo(uo uoVar, int i10) {
        this.f39643a = i10;
        this.f39644b = uoVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        uo uoVar = this.f39644b;
        TLRPC.ChatFull chatFull = uoVar.f42498y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        uoVar.p0(false, true);
        uoVar.getMessagesController().loadFullChat(uoVar.f42494w0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39643a) {
            case 0:
                this.f39644b.j0();
                return;
            case 1:
                this.f39644b.finishFragment();
                return;
            case 2:
                this.f39644b.j0();
                return;
            default:
                this.f39644b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        uo uoVar = this.f39644b;
        uoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-uoVar.f42494w0));
        } else {
            uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        uoVar.finishFragment();
        uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-uoVar.f42496x0.f20038id), null, uoVar.f42496x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f39643a) {
            case 4:
                this.f39644b.t0(Long.valueOf(j3));
                return;
            default:
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                uo uoVar = this.f39644b;
                if (i10 == 0) {
                    uoVar.N0 = false;
                    return;
                }
                uoVar.f42494w0 = j3;
                uoVar.f42496x0 = uoVar.getMessagesController().getChat(Long.valueOf(j3));
                uoVar.N0 = false;
                TLRPC.ChatFull chatFull = uoVar.f42498y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                uoVar.j0();
                return;
        }
    }
}
