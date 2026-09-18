package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class no implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, fd0, MessagesStorage.BooleanCallback {
    public final int f36143a;
    public final wo f36144b;

    public no(wo woVar, int i10) {
        this.f36143a = i10;
        this.f36144b = woVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        wo woVar = this.f36144b;
        TLRPC.ChatFull chatFull = woVar.f39120y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        woVar.p0(false, true);
        woVar.getMessagesController().loadFullChat(woVar.f39116w0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36143a) {
            case 0:
                this.f36144b.j0();
                return;
            case 1:
                this.f36144b.finishFragment();
                return;
            case 2:
                this.f36144b.j0();
                return;
            default:
                this.f36144b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        wo woVar = this.f36144b;
        woVar.getClass();
        if (AndroidUtilities.isTablet()) {
            woVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-woVar.f39116w0));
        } else {
            woVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        woVar.finishFragment();
        woVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-woVar.f39118x0.f18121id), null, woVar.f39118x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f36143a) {
            case 4:
                this.f36144b.t0(Long.valueOf(j3));
                return;
            default:
                wo woVar = this.f36144b;
                if (j3 == 0) {
                    woVar.N0 = false;
                    return;
                }
                woVar.f39116w0 = j3;
                woVar.f39118x0 = woVar.getMessagesController().getChat(Long.valueOf(j3));
                woVar.N0 = false;
                TLRPC.ChatFull chatFull = woVar.f39120y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                woVar.j0();
                return;
        }
    }
}
