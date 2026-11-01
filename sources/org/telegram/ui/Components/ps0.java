package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ps0 implements zf.l1, org.telegram.ui.Cells.d5 {
    public final rs0 f29530a;

    public ps0(rs0 rs0Var) {
        this.f29530a = rs0Var;
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
        rs0 rs0Var = this.f29530a;
        TLObject E = rs0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = org.telegram.messenger.kj.C1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return rs0Var.f30084s.F1.h(tL_chatChannelParticipant, true, !z10, e5Var);
        }
        return false;
    }

    @Override
    public void i(int i10) {
        rs0 rs0Var = this.f29530a;
        rs0Var.f();
        if (i10 == 1) {
            int i11 = rs0Var.f30083r - 1;
            rs0Var.f30083r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    au0 au0Var = rs0Var.f30084s;
                    ts0[] ts0VarArr = au0Var.m0;
                    if (i12 < ts0VarArr.length) {
                        ts0 ts0Var = ts0VarArr[i12];
                        if (ts0Var.E == 7) {
                            if (rs0Var.h == 0) {
                                ts0Var.f30722w.e(false, true);
                            } else {
                                au0Var.C(ts0Var.h, 0, null);
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
