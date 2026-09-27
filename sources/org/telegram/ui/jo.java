package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class jo implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, ad0, MessagesStorage.BooleanCallback {
    public final int f34827a;
    public final so f34828b;

    public jo(so soVar, int i10) {
        this.f34827a = i10;
        this.f34828b = soVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        so soVar = this.f34828b;
        TLRPC.ChatFull chatFull = soVar.f37536y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        soVar.p0(false, true);
        soVar.getMessagesController().loadFullChat(soVar.f37532w0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f34827a) {
            case 0:
                this.f34828b.j0();
                return;
            case 1:
                this.f34828b.finishFragment();
                return;
            case 2:
                this.f34828b.j0();
                return;
            default:
                this.f34828b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        so soVar = this.f34828b;
        soVar.getClass();
        if (AndroidUtilities.isTablet()) {
            soVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-soVar.f37532w0));
        } else {
            soVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        soVar.finishFragment();
        soVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-soVar.f37534x0.f18329id), null, soVar.f37534x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f34827a) {
            case 4:
                this.f34828b.t0(Long.valueOf(j3));
                return;
            default:
                so soVar = this.f34828b;
                if (j3 == 0) {
                    soVar.N0 = false;
                    return;
                }
                soVar.f37532w0 = j3;
                soVar.f37534x0 = soVar.getMessagesController().getChat(Long.valueOf(j3));
                soVar.N0 = false;
                TLRPC.ChatFull chatFull = soVar.f37536y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                soVar.j0();
                return;
        }
    }
}
