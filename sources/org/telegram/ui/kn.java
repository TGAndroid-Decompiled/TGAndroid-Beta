package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kn implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.tr, ma0, org.telegram.messenger.qr {
    public final int f47211a;
    public final pn f47212b;

    public kn(pn pnVar, int i7) {
        this.f47211a = i7;
        this.f47212b = pnVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        pn pnVar = this.f47212b;
        TLRPC.ChatFull chatFull = pnVar.f48888x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        pnVar.u0(false, true);
        pnVar.getMessagesController().V2(0, pnVar.f48884v0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47211a) {
            case 0:
                this.f47212b.o0();
                return;
            case 1:
                this.f47212b.finishFragment();
                return;
            case 2:
                this.f47212b.o0();
                return;
            default:
                this.f47212b.finishFragment();
                return;
        }
    }

    @Override
    public void k(boolean z9) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i7 = org.telegram.messenger.qs.f25067t;
        pn pnVar = this.f47212b;
        if (Q1) {
            pnVar.getNotificationCenter().k(i7, Long.valueOf(-pnVar.f48884v0));
        } else {
            pnVar.getNotificationCenter().k(i7, new Object[0]);
        }
        pnVar.finishFragment();
        pnVar.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-pnVar.f48886w0.f26953id), null, pnVar.f48886w0, Boolean.valueOf(z9));
    }

    @Override
    public void run(long j3) {
        switch (this.f47211a) {
            case 4:
                this.f47212b.y0(Long.valueOf(j3));
                return;
            default:
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                pn pnVar = this.f47212b;
                if (i7 == 0) {
                    pnVar.N0 = false;
                    return;
                }
                pnVar.f48884v0 = j3;
                pnVar.f48886w0 = pnVar.getMessagesController().M0(Long.valueOf(j3));
                pnVar.N0 = false;
                TLRPC.ChatFull chatFull = pnVar.f48888x0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                pnVar.o0();
                return;
        }
    }
}
