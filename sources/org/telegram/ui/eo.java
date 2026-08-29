package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class eo implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, mc0, MessagesStorage.BooleanCallback {
    public final int f37878a;
    public final ko f37879b;

    public eo(ko koVar, int i10) {
        this.f37878a = i10;
        this.f37879b = koVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ko koVar = this.f37879b;
        TLRPC.ChatFull chatFull = koVar.f39965u0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        koVar.p0(false, true);
        koVar.getMessagesController().loadFullChat(koVar.f39963s0, 0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37878a) {
            case 0:
                this.f37879b.j0();
                return;
            case 1:
                this.f37879b.finishFragment();
                return;
            case 2:
                this.f37879b.j0();
                return;
            default:
                this.f37879b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        ko koVar = this.f37879b;
        koVar.getClass();
        if (AndroidUtilities.isTablet()) {
            koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-koVar.f39963s0));
        } else {
            koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        koVar.finishFragment();
        koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-koVar.f39964t0.f22392id), null, koVar.f39964t0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f37878a) {
            case 4:
                this.f37879b.t0(Long.valueOf(j10));
                return;
            default:
                ko koVar = this.f37879b;
                if (j10 == 0) {
                    koVar.J0 = false;
                    return;
                }
                koVar.f39963s0 = j10;
                koVar.f39964t0 = koVar.getMessagesController().getChat(Long.valueOf(j10));
                koVar.J0 = false;
                TLRPC.ChatFull chatFull = koVar.f39965u0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                koVar.j0();
                return;
        }
    }
}
