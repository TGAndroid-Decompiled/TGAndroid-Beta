package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class po implements org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, dd0, MessagesStorage.BooleanCallback {
    public final int f35885a;
    public final yo f35886b;

    public po(yo yoVar, int i10) {
        this.f35885a = i10;
        this.f35886b = yoVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        yo yoVar = this.f35886b;
        TLRPC.ChatFull chatFull = yoVar.f39072y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        yoVar.p0(false, true);
        yoVar.getMessagesController().loadFullChat(yoVar.f39068w0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35885a) {
            case 0:
                this.f35886b.j0();
                return;
            case 1:
                this.f35886b.finishFragment();
                return;
            case 2:
                this.f35886b.j0();
                return;
            default:
                this.f35886b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        yo yoVar = this.f35886b;
        yoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            yoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-yoVar.f39068w0));
        } else {
            yoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        yoVar.finishFragment();
        yoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-yoVar.f39070x0.f17195id), null, yoVar.f39070x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f35885a) {
            case 4:
                this.f35886b.t0(Long.valueOf(j3));
                return;
            default:
                yo yoVar = this.f35886b;
                if (j3 == 0) {
                    yoVar.N0 = false;
                    return;
                }
                yoVar.f39068w0 = j3;
                yoVar.f39070x0 = yoVar.getMessagesController().getChat(Long.valueOf(j3));
                yoVar.N0 = false;
                TLRPC.ChatFull chatFull = yoVar.f39072y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                yoVar.j0();
                return;
        }
    }
}
