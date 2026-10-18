package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class co implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, kc0, MessagesStorage.BooleanCallback {
    public final int f35978a;
    public final ko f35979b;

    public co(ko koVar, int i10) {
        this.f35978a = i10;
        this.f35979b = koVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ko koVar = this.f35979b;
        TLRPC.ChatFull chatFull = koVar.f38624y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        koVar.p0(false, true);
        koVar.getMessagesController().loadFullChat(koVar.f38620w0, 0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35978a) {
            case 0:
                this.f35979b.j0();
                return;
            case 1:
                this.f35979b.finishFragment();
                return;
            case 2:
                this.f35979b.j0();
                return;
            default:
                this.f35979b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        ko koVar = this.f35979b;
        koVar.getClass();
        if (AndroidUtilities.isTablet()) {
            koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-koVar.f38620w0));
        } else {
            koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        koVar.finishFragment();
        koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-koVar.f38622x0.f20279id), null, koVar.f38622x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f35978a) {
            case 4:
                this.f35979b.t0(Long.valueOf(j10));
                return;
            default:
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                ko koVar = this.f35979b;
                if (i10 == 0) {
                    koVar.N0 = false;
                    return;
                }
                koVar.f38620w0 = j10;
                koVar.f38622x0 = koVar.getMessagesController().getChat(Long.valueOf(j10));
                koVar.N0 = false;
                TLRPC.ChatFull chatFull = koVar.f38624y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                koVar.j0();
                return;
        }
    }
}
