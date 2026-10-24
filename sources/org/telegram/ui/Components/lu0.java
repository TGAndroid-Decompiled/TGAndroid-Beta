package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lu0 implements hg.z1, org.telegram.ui.Cells.z4 {
    public final nu0 f28437a;

    public lu0(nu0 nu0Var) {
        this.f28437a = nu0Var;
    }

    @Override
    public a0.h G() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        nu0 nu0Var = this.f28437a;
        TLObject E = nu0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return nu0Var.f29039s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        nu0 nu0Var = this.f28437a;
        nu0Var.l();
        if (i10 == 1) {
            int i11 = nu0Var.f29038r - 1;
            nu0Var.f29038r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    wv0 wv0Var = nu0Var.f29039s;
                    pu0[] pu0VarArr = wv0Var.f32386k0;
                    if (i12 < pu0VarArr.length) {
                        pu0 pu0Var = pu0VarArr[i12];
                        if (pu0Var.F == 7) {
                            if (nu0Var.h == 0) {
                                pu0Var.f29679w.e(false, true);
                            } else {
                                wv0Var.z(pu0Var.h, 0, null);
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
    public a0.h x() {
        return null;
    }

    @Override
    public void S(ArrayList arrayList) {
    }
}
