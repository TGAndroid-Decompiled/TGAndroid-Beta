package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class go implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.ds, sb0, org.telegram.messenger.as {
    public final int f37532a;
    public final oo f37533b;

    public go(oo ooVar, int i10) {
        this.f37532a = i10;
        this.f37533b = ooVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        oo ooVar = this.f37533b;
        TLRPC.ChatFull chatFull = ooVar.f40234x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        ooVar.u0(false, true);
        ooVar.getMessagesController().T2(0, ooVar.f40230v0, true);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f37532a) {
            case 0:
                this.f37533b.o0();
                return;
            case 1:
                this.f37533b.finishFragment();
                return;
            case 2:
                this.f37533b.o0();
                return;
            default:
                this.f37533b.finishFragment();
                return;
        }
    }

    @Override
    public void i(boolean z10) {
        boolean Q1 = org.telegram.messenger.i0.Q1();
        int i10 = org.telegram.messenger.at.f14786t;
        oo ooVar = this.f37533b;
        if (Q1) {
            ooVar.getNotificationCenter().k(i10, Long.valueOf(-ooVar.f40230v0));
        } else {
            ooVar.getNotificationCenter().k(i10, new Object[0]);
        }
        ooVar.finishFragment();
        ooVar.getNotificationCenter().k(org.telegram.messenger.at.K2, Long.valueOf(-ooVar.f40232w0.f19794id), null, ooVar.f40232w0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f37532a) {
            case 4:
                this.f37533b.y0(Long.valueOf(j10));
                return;
            default:
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                oo ooVar = this.f37533b;
                if (i10 == 0) {
                    ooVar.N0 = false;
                    return;
                }
                ooVar.f40230v0 = j10;
                ooVar.f40232w0 = ooVar.getMessagesController().L0(Long.valueOf(j10));
                ooVar.N0 = false;
                TLRPC.ChatFull chatFull = ooVar.f40234x0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                ooVar.o0();
                return;
        }
    }
}
