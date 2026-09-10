package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wt0 implements fg.c2, org.telegram.ui.Cells.a5 {
    public final yt0 f28837a;

    public wt0(yt0 yt0Var) {
        this.f28837a = yt0Var;
    }

    @Override
    public a0.i D() {
        return null;
    }

    @Override
    public a0.i P() {
        return null;
    }

    @Override
    public void a(int i10) {
        yt0 yt0Var = this.f28837a;
        yt0Var.l();
        if (i10 == 1) {
            int i11 = yt0Var.f29497r - 1;
            yt0Var.f29497r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    iv0 iv0Var = yt0Var.f29498s;
                    au0[] au0VarArr = iv0Var.f24107k0;
                    if (i12 < au0VarArr.length) {
                        au0 au0Var = au0VarArr[i12];
                        if (au0Var.F == 7) {
                            if (yt0Var.h == 0) {
                                au0Var.f21597w.e(false, true);
                            } else {
                                iv0Var.z(au0Var.h, 0, null);
                            }
                        }
                        i12++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public boolean c0(int i10) {
        return true;
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        yt0 yt0Var = this.f28837a;
        TLObject E = yt0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return yt0Var.f29498s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public void k0(ArrayList arrayList) {
    }
}
