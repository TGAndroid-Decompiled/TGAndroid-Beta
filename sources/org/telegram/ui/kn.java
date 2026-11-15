package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kn implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.qr, ma0, org.telegram.messenger.nr {
    public final int f48723a;
    public final qn f48724b;

    public kn(qn qnVar, int i7) {
        this.f48723a = i7;
        this.f48724b = qnVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        qn qnVar = this.f48724b;
        TLRPC.ChatFull chatFull = qnVar.f50695y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        qnVar.u0(false, true);
        qnVar.getMessagesController().V2(0, qnVar.f50691w0, true);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f48723a) {
            case 0:
                this.f48724b.o0();
                return;
            case 1:
                this.f48724b.finishFragment();
                return;
            case 2:
                this.f48724b.o0();
                return;
            default:
                this.f48724b.finishFragment();
                return;
        }
    }

    @Override
    public void j(boolean z10) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i7 = org.telegram.messenger.ns.f25572t;
        qn qnVar = this.f48724b;
        if (Q1) {
            qnVar.getNotificationCenter().k(i7, Long.valueOf(-qnVar.f50691w0));
        } else {
            qnVar.getNotificationCenter().k(i7, new Object[0]);
        }
        qnVar.finishFragment();
        qnVar.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(-qnVar.f50693x0.f28051id), null, qnVar.f50693x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j3) {
        switch (this.f48723a) {
            case 4:
                this.f48724b.y0(Long.valueOf(j3));
                return;
            default:
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                qn qnVar = this.f48724b;
                if (i7 == 0) {
                    qnVar.O0 = false;
                    return;
                }
                qnVar.f50691w0 = j3;
                qnVar.f50693x0 = qnVar.getMessagesController().M0(Long.valueOf(j3));
                qnVar.O0 = false;
                TLRPC.ChatFull chatFull = qnVar.f50695y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                qnVar.o0();
                return;
        }
    }
}
