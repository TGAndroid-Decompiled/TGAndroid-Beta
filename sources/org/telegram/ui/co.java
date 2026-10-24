package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class co implements org.telegram.ui.ActionBar.z1, MessagesStorage.LongCallback, mc0, MessagesStorage.BooleanCallback {
    public final int f36376a;
    public final ko f36377b;

    public co(ko koVar, int i10) {
        this.f36376a = i10;
        this.f36377b = koVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ko koVar = this.f36377b;
        TLRPC.ChatFull chatFull = koVar.f38982x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        koVar.p0(false, true);
        koVar.getMessagesController().loadFullChat(koVar.f38978v0, 0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36376a) {
            case 0:
                this.f36377b.j0();
                return;
            case 1:
                this.f36377b.finishFragment();
                return;
            case 2:
                this.f36377b.j0();
                return;
            default:
                this.f36377b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        ko koVar = this.f36377b;
        koVar.getClass();
        if (AndroidUtilities.isTablet()) {
            koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-koVar.f38978v0));
        } else {
            koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        koVar.finishFragment();
        koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-koVar.f38980w0.f20344id), null, koVar.f38980w0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f36376a) {
            case 4:
                this.f36377b.t0(Long.valueOf(j10));
                return;
            default:
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                ko koVar = this.f36377b;
                if (i10 == 0) {
                    koVar.M0 = false;
                    return;
                }
                koVar.f38978v0 = j10;
                koVar.f38980w0 = koVar.getMessagesController().getChat(Long.valueOf(j10));
                koVar.M0 = false;
                TLRPC.ChatFull chatFull = koVar.f38982x0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                koVar.j0();
                return;
        }
    }
}
