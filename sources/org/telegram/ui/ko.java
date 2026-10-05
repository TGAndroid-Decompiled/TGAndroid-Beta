package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ko implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, bd0, MessagesStorage.BooleanCallback {
    public final int f38138a;
    public final to f38139b;

    public ko(to toVar, int i10) {
        this.f38138a = i10;
        this.f38139b = toVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        to toVar = this.f38139b;
        TLRPC.ChatFull chatFull = toVar.f40978y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        toVar.p0(false, true);
        toVar.getMessagesController().loadFullChat(toVar.f40974w0, 0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38138a) {
            case 0:
                this.f38139b.j0();
                return;
            case 1:
                this.f38139b.finishFragment();
                return;
            case 2:
                this.f38139b.j0();
                return;
            default:
                this.f38139b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        to toVar = this.f38139b;
        toVar.getClass();
        if (AndroidUtilities.isTablet()) {
            toVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-toVar.f40974w0));
        } else {
            toVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        toVar.finishFragment();
        toVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-toVar.f40976x0.f20047id), null, toVar.f40976x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f38138a) {
            case 4:
                this.f38139b.t0(Long.valueOf(j3));
                return;
            default:
                to toVar = this.f38139b;
                if (j3 == 0) {
                    toVar.N0 = false;
                    return;
                }
                toVar.f40974w0 = j3;
                toVar.f40976x0 = toVar.getMessagesController().getChat(Long.valueOf(j3));
                toVar.N0 = false;
                TLRPC.ChatFull chatFull = toVar.f40978y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                toVar.j0();
                return;
        }
    }
}
