package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class os0 implements zf.l1, org.telegram.ui.Cells.d5 {
    public final qs0 f29174a;

    public os0(qs0 qs0Var) {
        this.f29174a = qs0Var;
    }

    @Override
    public a0.h M() {
        return null;
    }

    @Override
    public boolean Y(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        int intValue = ((Integer) e5Var.getTag()).intValue();
        qs0 qs0Var = this.f29174a;
        TLObject E = qs0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = org.telegram.messenger.jj.C1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return qs0Var.f29738s.F1.h(tL_chatChannelParticipant, true, !z10, e5Var);
        }
        return false;
    }

    @Override
    public void i(int i10) {
        qs0 qs0Var = this.f29174a;
        qs0Var.f();
        if (i10 == 1) {
            int i11 = qs0Var.f29737r - 1;
            qs0Var.f29737r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    zt0 zt0Var = qs0Var.f29738s;
                    ss0[] ss0VarArr = zt0Var.m0;
                    if (i12 < ss0VarArr.length) {
                        ss0 ss0Var = ss0VarArr[i12];
                        if (ss0Var.E == 7) {
                            if (qs0Var.h == 0) {
                                ss0Var.f30355w.e(false, true);
                            } else {
                                zt0Var.C(ss0Var.h, 0, null);
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
    public void c0(ArrayList arrayList) {
    }
}
