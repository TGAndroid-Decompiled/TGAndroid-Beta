package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ao implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, kc0, MessagesStorage.BooleanCallback {
    public final int f36528a;
    public final ho f36529b;

    public ao(ho hoVar, int i9) {
        this.f36528a = i9;
        this.f36529b = hoVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ho hoVar = this.f36529b;
        TLRPC.ChatFull chatFull = hoVar.f38862u0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        hoVar.o0(false, true);
        hoVar.getMessagesController().loadFullChat(hoVar.f38860s0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f36528a) {
            case 0:
                this.f36529b.i0();
                return;
            case 1:
                this.f36529b.finishFragment();
                return;
            case 2:
                this.f36529b.i0();
                return;
            default:
                this.f36529b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        ho hoVar = this.f36529b;
        hoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            hoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-hoVar.f38860s0));
        } else {
            hoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        hoVar.finishFragment();
        hoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-hoVar.f38861t0.f22380id), null, hoVar.f38861t0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f36528a) {
            case 4:
                this.f36529b.s0(Long.valueOf(j10));
                return;
            default:
                ho hoVar = this.f36529b;
                if (j10 == 0) {
                    hoVar.J0 = false;
                    return;
                }
                hoVar.f38860s0 = j10;
                hoVar.f38861t0 = hoVar.getMessagesController().getChat(Long.valueOf(j10));
                hoVar.J0 = false;
                TLRPC.ChatFull chatFull = hoVar.f38862u0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                hoVar.i0();
                return;
        }
    }
}
