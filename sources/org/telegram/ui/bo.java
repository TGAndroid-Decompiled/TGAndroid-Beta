package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class bo implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, oc0, MessagesStorage.BooleanCallback {

    public final int f36860a;

    public final jo f36861b;

    public bo(jo joVar, int i10) {
        this.f36860a = i10;
        this.f36861b = joVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        jo joVar = this.f36861b;
        TLRPC.ChatFull chatFull = joVar.f39430u0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        joVar.p0(false, true);
        joVar.getMessagesController().loadFullChat(joVar.f39428s0, 0, true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36860a) {
            case 0:
                this.f36861b.j0();
                break;
            case 1:
                this.f36861b.finishFragment();
                break;
            case 2:
                this.f36861b.j0();
                break;
            default:
                this.f36861b.finishFragment();
                break;
        }
    }

    @Override
    public void run(boolean z10) {
        jo joVar = this.f36861b;
        joVar.getClass();
        if (AndroidUtilities.isTablet()) {
            joVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-joVar.f39428s0));
        } else {
            joVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        joVar.finishFragment();
        joVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-joVar.f39429t0.f22380id), null, joVar.f39429t0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f36860a) {
            case 4:
                this.f36861b.t0(Long.valueOf(j10));
                break;
            default:
                jo joVar = this.f36861b;
                if (j10 == 0) {
                    joVar.J0 = false;
                } else {
                    joVar.f39428s0 = j10;
                    joVar.f39429t0 = joVar.getMessagesController().getChat(Long.valueOf(j10));
                    joVar.J0 = false;
                    TLRPC.ChatFull chatFull = joVar.f39430u0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    joVar.j0();
                }
                break;
        }
    }
}
