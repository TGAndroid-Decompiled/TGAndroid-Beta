package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class po implements org.telegram.ui.ActionBar.z1, MessagesStorage.LongCallback, dd0, MessagesStorage.BooleanCallback {
    public final int f41060a;
    public final xo f41061b;

    public po(xo xoVar, int i10) {
        this.f41060a = i10;
        this.f41061b = xoVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        xo xoVar = this.f41061b;
        TLRPC.ChatFull chatFull = xoVar.f44081y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        xoVar.p0(false, true);
        xoVar.getMessagesController().loadFullChat(xoVar.f44077w0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41060a) {
            case 0:
                this.f41061b.j0();
                return;
            case 1:
                this.f41061b.finishFragment();
                return;
            case 2:
                this.f41061b.j0();
                return;
            default:
                this.f41061b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        xo xoVar = this.f41061b;
        xoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            xoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-xoVar.f44077w0));
        } else {
            xoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        xoVar.finishFragment();
        xoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-xoVar.f44079x0.f19802id), null, xoVar.f44079x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f41060a) {
            case 4:
                this.f41061b.t0(Long.valueOf(j3));
                return;
            default:
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                xo xoVar = this.f41061b;
                if (i10 == 0) {
                    xoVar.N0 = false;
                    return;
                }
                xoVar.f44077w0 = j3;
                xoVar.f44079x0 = xoVar.getMessagesController().getChat(Long.valueOf(j3));
                xoVar.N0 = false;
                TLRPC.ChatFull chatFull = xoVar.f44081y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                xoVar.j0();
                return;
        }
    }
}
