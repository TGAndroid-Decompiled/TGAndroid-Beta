package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gn implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.lr, ia0, org.telegram.messenger.ir {
    public final int f45681a;
    public final ln f45682b;

    public gn(ln lnVar, int i3) {
        this.f45681a = i3;
        this.f45682b = lnVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ln lnVar = this.f45682b;
        TLRPC.ChatFull chatFull = lnVar.f47398y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        lnVar.u0(false, true);
        lnVar.getMessagesController().V2(0, lnVar.f47394w0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f45681a) {
            case 0:
                this.f45682b.o0();
                return;
            case 1:
                this.f45682b.finishFragment();
                return;
            case 2:
                this.f45682b.o0();
                return;
            default:
                this.f45682b.finishFragment();
                return;
        }
    }

    @Override
    public void o(boolean z10) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i3 = org.telegram.messenger.hs.f23305t;
        ln lnVar = this.f45682b;
        if (Q1) {
            lnVar.getNotificationCenter().k(i3, Long.valueOf(-lnVar.f47394w0));
        } else {
            lnVar.getNotificationCenter().k(i3, new Object[0]);
        }
        lnVar.finishFragment();
        lnVar.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(-lnVar.f47396x0.f27001id), null, lnVar.f47396x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f45681a) {
            case 4:
                this.f45682b.y0(Long.valueOf(j10));
                return;
            default:
                int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                ln lnVar = this.f45682b;
                if (i3 == 0) {
                    lnVar.O0 = false;
                    return;
                }
                lnVar.f47394w0 = j10;
                lnVar.f47396x0 = lnVar.getMessagesController().M0(Long.valueOf(j10));
                lnVar.O0 = false;
                TLRPC.ChatFull chatFull = lnVar.f47398y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                lnVar.o0();
                return;
        }
    }
}
