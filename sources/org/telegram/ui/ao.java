package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ao implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, ic0, MessagesStorage.BooleanCallback {
    public final int f35399a;
    public final io f35400b;

    public ao(io ioVar, int i10) {
        this.f35399a = i10;
        this.f35400b = ioVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        io ioVar = this.f35400b;
        TLRPC.ChatFull chatFull = ioVar.f38069y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        ioVar.p0(false, true);
        ioVar.getMessagesController().loadFullChat(ioVar.f38065w0, 0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35399a) {
            case 0:
                this.f35400b.j0();
                return;
            case 1:
                this.f35400b.finishFragment();
                return;
            case 2:
                this.f35400b.j0();
                return;
            default:
                this.f35400b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        io ioVar = this.f35400b;
        ioVar.getClass();
        if (AndroidUtilities.isTablet()) {
            ioVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-ioVar.f38065w0));
        } else {
            ioVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        ioVar.finishFragment();
        ioVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-ioVar.f38067x0.f20279id), null, ioVar.f38067x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f35399a) {
            case 4:
                this.f35400b.t0(Long.valueOf(j10));
                return;
            default:
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                io ioVar = this.f35400b;
                if (i10 == 0) {
                    ioVar.N0 = false;
                    return;
                }
                ioVar.f38065w0 = j10;
                ioVar.f38067x0 = ioVar.getMessagesController().getChat(Long.valueOf(j10));
                ioVar.N0 = false;
                TLRPC.ChatFull chatFull = ioVar.f38069y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                ioVar.j0();
                return;
        }
    }
}
