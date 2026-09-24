package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class io implements org.telegram.ui.ActionBar.z1, MessagesStorage.LongCallback, xc0, MessagesStorage.BooleanCallback {
    public final int f34546a;
    public final ro f34547b;

    public io(ro roVar, int i10) {
        this.f34546a = i10;
        this.f34547b = roVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ro roVar = this.f34547b;
        TLRPC.ChatFull chatFull = roVar.f37409y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        roVar.p0(false, true);
        roVar.getMessagesController().loadFullChat(roVar.f37405w0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34546a) {
            case 0:
                this.f34547b.j0();
                return;
            case 1:
                this.f34547b.finishFragment();
                return;
            case 2:
                this.f34547b.j0();
                return;
            default:
                this.f34547b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        ro roVar = this.f34547b;
        roVar.getClass();
        if (AndroidUtilities.isTablet()) {
            roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-roVar.f37405w0));
        } else {
            roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        roVar.finishFragment();
        roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-roVar.f37407x0.f18321id), null, roVar.f37407x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f34546a) {
            case 4:
                this.f34547b.t0(Long.valueOf(j3));
                return;
            default:
                ro roVar = this.f34547b;
                if (j3 == 0) {
                    roVar.N0 = false;
                    return;
                }
                roVar.f37405w0 = j3;
                roVar.f37407x0 = roVar.getMessagesController().getChat(Long.valueOf(j3));
                roVar.N0 = false;
                TLRPC.ChatFull chatFull = roVar.f37409y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                roVar.j0();
                return;
        }
    }
}
