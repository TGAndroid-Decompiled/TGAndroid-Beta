package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ln implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.or, ma0, org.telegram.messenger.lr {
    public final int f49783a;
    public final rn f49784b;

    public ln(rn rnVar, int i7) {
        this.f49783a = i7;
        this.f49784b = rnVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        rn rnVar = this.f49784b;
        TLRPC.ChatFull chatFull = rnVar.f51798y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        rnVar.u0(false, true);
        rnVar.getMessagesController().b3(0, rnVar.f51794w0, true);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f49783a) {
            case 0:
                this.f49784b.o0();
                return;
            case 1:
                this.f49784b.finishFragment();
                return;
            case 2:
                this.f49784b.o0();
                return;
            default:
                this.f49784b.finishFragment();
                return;
        }
    }

    @Override
    public void q(boolean z10) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i7 = org.telegram.messenger.ks.f25289t;
        rn rnVar = this.f49784b;
        if (Q1) {
            rnVar.getNotificationCenter().k(i7, Long.valueOf(-rnVar.f51794w0));
        } else {
            rnVar.getNotificationCenter().k(i7, new Object[0]);
        }
        rnVar.finishFragment();
        rnVar.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(-rnVar.f51796x0.f28492id), null, rnVar.f51796x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f49783a) {
            case 4:
                this.f49784b.y0(Long.valueOf(j3));
                return;
            default:
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                rn rnVar = this.f49784b;
                if (i7 == 0) {
                    rnVar.O0 = false;
                    return;
                }
                rnVar.f51794w0 = j3;
                rnVar.f51796x0 = rnVar.getMessagesController().O0(Long.valueOf(j3));
                rnVar.O0 = false;
                TLRPC.ChatFull chatFull = rnVar.f51798y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                rnVar.o0();
                return;
        }
    }
}
