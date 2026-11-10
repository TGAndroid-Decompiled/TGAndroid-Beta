package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mn implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.tr, pa0, org.telegram.messenger.qr {
    public final int f47991a;
    public final rn f47992b;

    public mn(rn rnVar, int i7) {
        this.f47991a = i7;
        this.f47992b = rnVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        rn rnVar = this.f47992b;
        TLRPC.ChatFull chatFull = rnVar.f49479x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        rnVar.u0(false, true);
        rnVar.getMessagesController().V2(0, rnVar.f49475v0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47991a) {
            case 0:
                this.f47992b.o0();
                return;
            case 1:
                this.f47992b.finishFragment();
                return;
            case 2:
                this.f47992b.o0();
                return;
            default:
                this.f47992b.finishFragment();
                return;
        }
    }

    @Override
    public void k(boolean z9) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i7 = org.telegram.messenger.qs.f25080t;
        rn rnVar = this.f47992b;
        if (Q1) {
            rnVar.getNotificationCenter().k(i7, Long.valueOf(-rnVar.f49475v0));
        } else {
            rnVar.getNotificationCenter().k(i7, new Object[0]);
        }
        rnVar.finishFragment();
        rnVar.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-rnVar.f49477w0.f26960id), null, rnVar.f49477w0, Boolean.valueOf(z9));
    }

    @Override
    public void run(long j3) {
        switch (this.f47991a) {
            case 4:
                this.f47992b.y0(Long.valueOf(j3));
                return;
            default:
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                rn rnVar = this.f47992b;
                if (i7 == 0) {
                    rnVar.N0 = false;
                    return;
                }
                rnVar.f49475v0 = j3;
                rnVar.f49477w0 = rnVar.getMessagesController().M0(Long.valueOf(j3));
                rnVar.N0 = false;
                TLRPC.ChatFull chatFull = rnVar.f49479x0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                rnVar.o0();
                return;
        }
    }
}
