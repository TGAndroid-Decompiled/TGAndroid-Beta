package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class lo implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, ed0, MessagesStorage.BooleanCallback {
    public final int f35419a;
    public final uo f35420b;

    public lo(uo uoVar, int i10) {
        this.f35419a = i10;
        this.f35420b = uoVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        uo uoVar = this.f35420b;
        TLRPC.ChatFull chatFull = uoVar.f38067y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        uoVar.p0(false, true);
        uoVar.getMessagesController().loadFullChat(uoVar.f38063w0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35419a) {
            case 0:
                this.f35420b.j0();
                return;
            case 1:
                this.f35420b.finishFragment();
                return;
            case 2:
                this.f35420b.j0();
                return;
            default:
                this.f35420b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        uo uoVar = this.f35420b;
        uoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-uoVar.f38063w0));
        } else {
            uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        uoVar.finishFragment();
        uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-uoVar.f38065x0.f18296id), null, uoVar.f38065x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f35419a) {
            case 4:
                this.f35420b.t0(Long.valueOf(j3));
                return;
            default:
                uo uoVar = this.f35420b;
                if (j3 == 0) {
                    uoVar.N0 = false;
                    return;
                }
                uoVar.f38063w0 = j3;
                uoVar.f38065x0 = uoVar.getMessagesController().getChat(Long.valueOf(j3));
                uoVar.N0 = false;
                TLRPC.ChatFull chatFull = uoVar.f38067y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                uoVar.j0();
                return;
        }
    }
}
