package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class lo implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, fd0, MessagesStorage.BooleanCallback {
    public final int f35516a;
    public final uo f35517b;

    public lo(uo uoVar, int i10) {
        this.f35516a = i10;
        this.f35517b = uoVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        uo uoVar = this.f35517b;
        TLRPC.ChatFull chatFull = uoVar.f38197y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        uoVar.p0(false, true);
        uoVar.getMessagesController().loadFullChat(uoVar.f38193w0, 0, true);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35516a) {
            case 0:
                this.f35517b.j0();
                return;
            case 1:
                this.f35517b.finishFragment();
                return;
            case 2:
                this.f35517b.j0();
                return;
            default:
                this.f35517b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        uo uoVar = this.f35517b;
        uoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-uoVar.f38193w0));
        } else {
            uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        uoVar.finishFragment();
        uoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-uoVar.f38195x0.f18343id), null, uoVar.f38195x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f35516a) {
            case 4:
                this.f35517b.t0(Long.valueOf(j3));
                return;
            default:
                uo uoVar = this.f35517b;
                if (j3 == 0) {
                    uoVar.N0 = false;
                    return;
                }
                uoVar.f38193w0 = j3;
                uoVar.f38195x0 = uoVar.getMessagesController().getChat(Long.valueOf(j3));
                uoVar.N0 = false;
                TLRPC.ChatFull chatFull = uoVar.f38197y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                uoVar.j0();
                return;
        }
    }
}
