package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yr0 implements jg.y1, org.telegram.ui.Cells.a5 {
    public final bs0 f42548a;

    public yr0(bs0 bs0Var) {
        this.f42548a = bs0Var;
    }

    @Override
    public boolean W1(int i7) {
        return true;
    }

    @Override
    public a0.h Y0() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        bs0 bs0Var = this.f42548a;
        TLObject E = bs0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = org.telegram.messenger.fj.B1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return bs0Var.f33811s.G1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.h u1() {
        return null;
    }

    @Override
    public void v(int i7) {
        bs0 bs0Var = this.f42548a;
        bs0Var.f();
        if (i7 == 1) {
            int i10 = bs0Var.f33810r - 1;
            bs0Var.f33810r = i10;
            if (i10 == 0) {
                int i11 = 0;
                while (true) {
                    it0 it0Var = bs0Var.f33811s;
                    ds0[] ds0VarArr = it0Var.f36133n0;
                    if (i11 < ds0VarArr.length) {
                        ds0 ds0Var = ds0VarArr[i11];
                        if (ds0Var.F == 7) {
                            if (bs0Var.h == 0) {
                                ds0Var.f34449w.e(false, true);
                            } else {
                                it0Var.D(ds0Var.h, 0, null);
                            }
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void m2(ArrayList arrayList) {
    }
}
