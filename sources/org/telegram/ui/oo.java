package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class oo implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, dd0, MessagesStorage.BooleanCallback {
    public final int f39287a;
    public final xo f39288b;

    public oo(xo xoVar, int i10) {
        this.f39287a = i10;
        this.f39288b = xoVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        xo xoVar = this.f39288b;
        TLRPC.ChatFull chatFull = xoVar.f42801y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        xoVar.p0(false, true);
        xoVar.getMessagesController().loadFullChat(xoVar.f42797w0, 0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39287a) {
            case 0:
                this.f39288b.j0();
                return;
            case 1:
                this.f39288b.finishFragment();
                return;
            case 2:
                this.f39288b.j0();
                return;
            default:
                this.f39288b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        xo xoVar = this.f39288b;
        xoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            xoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-xoVar.f42797w0));
        } else {
            xoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        xoVar.finishFragment();
        xoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-xoVar.f42799x0.f19869id), null, xoVar.f42799x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f39287a) {
            case 4:
                this.f39288b.t0(Long.valueOf(j3));
                return;
            default:
                xo xoVar = this.f39288b;
                if (j3 == 0) {
                    xoVar.N0 = false;
                    return;
                }
                xoVar.f42797w0 = j3;
                xoVar.f42799x0 = xoVar.getMessagesController().getChat(Long.valueOf(j3));
                xoVar.N0 = false;
                TLRPC.ChatFull chatFull = xoVar.f42801y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                xoVar.j0();
                return;
        }
    }
}
