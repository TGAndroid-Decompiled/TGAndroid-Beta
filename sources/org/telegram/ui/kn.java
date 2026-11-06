package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kn implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.tr, ma0, org.telegram.messenger.qr {
    public final int f47189a;
    public final pn f47190b;

    public kn(pn pnVar, int i7) {
        this.f47189a = i7;
        this.f47190b = pnVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        pn pnVar = this.f47190b;
        TLRPC.ChatFull chatFull = pnVar.f48894x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        pnVar.u0(false, true);
        pnVar.getMessagesController().V2(0, pnVar.f48890v0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47189a) {
            case 0:
                this.f47190b.o0();
                return;
            case 1:
                this.f47190b.finishFragment();
                return;
            case 2:
                this.f47190b.o0();
                return;
            default:
                this.f47190b.finishFragment();
                return;
        }
    }

    @Override
    public void k(boolean z9) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i7 = org.telegram.messenger.qs.f25059t;
        pn pnVar = this.f47190b;
        if (Q1) {
            pnVar.getNotificationCenter().k(i7, Long.valueOf(-pnVar.f48890v0));
        } else {
            pnVar.getNotificationCenter().k(i7, new Object[0]);
        }
        pnVar.finishFragment();
        pnVar.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-pnVar.f48892w0.f26952id), null, pnVar.f48892w0, Boolean.valueOf(z9));
    }

    @Override
    public void run(long j3) {
        switch (this.f47189a) {
            case 4:
                this.f47190b.y0(Long.valueOf(j3));
                return;
            default:
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                pn pnVar = this.f47190b;
                if (i7 == 0) {
                    pnVar.N0 = false;
                    return;
                }
                pnVar.f48890v0 = j3;
                pnVar.f48892w0 = pnVar.getMessagesController().M0(Long.valueOf(j3));
                pnVar.N0 = false;
                TLRPC.ChatFull chatFull = pnVar.f48894x0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                pnVar.o0();
                return;
        }
    }
}
