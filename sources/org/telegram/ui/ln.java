package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ln implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.or, ma0, org.telegram.messenger.lr {
    public final int f49648a;
    public final rn f49649b;

    public ln(rn rnVar, int i7) {
        this.f49648a = i7;
        this.f49649b = rnVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        rn rnVar = this.f49649b;
        TLRPC.ChatFull chatFull = rnVar.f51709y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        rnVar.u0(false, true);
        rnVar.getMessagesController().b3(0, rnVar.f51705w0, true);
    }

    @Override
    public void d(boolean z10) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i7 = org.telegram.messenger.ks.f25192t;
        rn rnVar = this.f49649b;
        if (Q1) {
            rnVar.getNotificationCenter().k(i7, Long.valueOf(-rnVar.f51705w0));
        } else {
            rnVar.getNotificationCenter().k(i7, new Object[0]);
        }
        rnVar.finishFragment();
        rnVar.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(-rnVar.f51707x0.f28405id), null, rnVar.f51707x0, Boolean.valueOf(z10));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f49648a) {
            case 0:
                this.f49649b.o0();
                return;
            case 1:
                this.f49649b.finishFragment();
                return;
            case 2:
                this.f49649b.o0();
                return;
            default:
                this.f49649b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        switch (this.f49648a) {
            case 4:
                this.f49649b.y0(Long.valueOf(j3));
                return;
            default:
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                rn rnVar = this.f49649b;
                if (i7 == 0) {
                    rnVar.O0 = false;
                    return;
                }
                rnVar.f51705w0 = j3;
                rnVar.f51707x0 = rnVar.getMessagesController().O0(Long.valueOf(j3));
                rnVar.O0 = false;
                TLRPC.ChatFull chatFull = rnVar.f51709y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                rnVar.o0();
                return;
        }
    }
}
