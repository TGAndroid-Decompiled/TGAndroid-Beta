package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nr0 implements kg.u1, org.telegram.ui.Cells.z4 {
    public final pr0 f36612a;

    public nr0(pr0 pr0Var) {
        this.f36612a = pr0Var;
    }

    @Override
    public a0.h C0() {
        return null;
    }

    @Override
    public boolean J1(int i3) {
        return true;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        pr0 pr0Var = this.f36612a;
        TLObject E = pr0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = org.telegram.messenger.zi.C1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return pr0Var.f37231s.G1.h(tL_chatChannelParticipant, true, !z10, a5Var);
        }
        return false;
    }

    @Override
    public a0.h k1() {
        return null;
    }

    @Override
    public void r(int i3) {
        pr0 pr0Var = this.f36612a;
        pr0Var.f();
        if (i3 == 1) {
            int i10 = pr0Var.f37230r - 1;
            pr0Var.f37230r = i10;
            if (i10 == 0) {
                int i11 = 0;
                while (true) {
                    ws0 ws0Var = pr0Var.f37231s;
                    rr0[] rr0VarArr = ws0Var.f40108n0;
                    if (i11 < rr0VarArr.length) {
                        rr0 rr0Var = rr0VarArr[i11];
                        if (rr0Var.F == 7) {
                            if (pr0Var.h == 0) {
                                rr0Var.f37790w.e(false, true);
                            } else {
                                ws0Var.D(rr0Var.h, 0, null);
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
    public void b2(ArrayList arrayList) {
    }
}
