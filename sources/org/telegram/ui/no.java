package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class no implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, fd0, MessagesStorage.BooleanCallback {
    public final int f36138a;
    public final wo f36139b;

    public no(wo woVar, int i10) {
        this.f36138a = i10;
        this.f36139b = woVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        wo woVar = this.f36139b;
        TLRPC.ChatFull chatFull = woVar.f39115y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        woVar.p0(false, true);
        woVar.getMessagesController().loadFullChat(woVar.f39111w0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36138a) {
            case 0:
                this.f36139b.j0();
                return;
            case 1:
                this.f36139b.finishFragment();
                return;
            case 2:
                this.f36139b.j0();
                return;
            default:
                this.f36139b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        wo woVar = this.f36139b;
        woVar.getClass();
        if (AndroidUtilities.isTablet()) {
            woVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-woVar.f39111w0));
        } else {
            woVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        woVar.finishFragment();
        woVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-woVar.f39113x0.f18121id), null, woVar.f39113x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f36138a) {
            case 4:
                this.f36139b.t0(Long.valueOf(j3));
                return;
            default:
                wo woVar = this.f36139b;
                if (j3 == 0) {
                    woVar.N0 = false;
                    return;
                }
                woVar.f39111w0 = j3;
                woVar.f39113x0 = woVar.getMessagesController().getChat(Long.valueOf(j3));
                woVar.N0 = false;
                TLRPC.ChatFull chatFull = woVar.f39115y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                woVar.j0();
                return;
        }
    }
}
