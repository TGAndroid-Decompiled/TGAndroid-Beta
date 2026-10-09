package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class lo implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, cd0, MessagesStorage.BooleanCallback {
    public final int f39641a;
    public final uo f39642b;

    public lo(uo uoVar, int i10) {
        this.f39641a = i10;
        this.f39642b = uoVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        uo uoVar = this.f39642b;
        TLRPC.ChatFull chatFull = uoVar.f42496y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        uoVar.p0(false, true);
        uoVar.getMessagesController().loadFullChat(uoVar.f42492w0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39641a) {
            case 0:
                this.f39642b.j0();
                return;
            case 1:
                this.f39642b.finishFragment();
                return;
            case 2:
                this.f39642b.j0();
                return;
            default:
                this.f39642b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        uo uoVar = this.f39642b;
        uoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-uoVar.f42492w0));
        } else {
            uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        uoVar.finishFragment();
        uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-uoVar.f42494x0.f20038id), null, uoVar.f42494x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f39641a) {
            case 4:
                this.f39642b.t0(Long.valueOf(j3));
                return;
            default:
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                uo uoVar = this.f39642b;
                if (i10 == 0) {
                    uoVar.N0 = false;
                    return;
                }
                uoVar.f42492w0 = j3;
                uoVar.f42494x0 = uoVar.getMessagesController().getChat(Long.valueOf(j3));
                uoVar.N0 = false;
                TLRPC.ChatFull chatFull = uoVar.f42496y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                uoVar.j0();
                return;
        }
    }
}
