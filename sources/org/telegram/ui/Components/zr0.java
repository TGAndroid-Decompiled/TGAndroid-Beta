package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zr0 implements jg.y1, org.telegram.ui.Cells.a5 {
    public final bs0 f42973a;

    public zr0(bs0 bs0Var) {
        this.f42973a = bs0Var;
    }

    @Override
    public a0.h K0() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        bs0 bs0Var = this.f42973a;
        TLObject E = bs0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = org.telegram.messenger.gj.B1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return bs0Var.f33915s.G1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.h d1() {
        return null;
    }

    @Override
    public void r(int i7) {
        bs0 bs0Var = this.f42973a;
        bs0Var.f();
        if (i7 == 1) {
            int i10 = bs0Var.f33914r - 1;
            bs0Var.f33914r = i10;
            if (i10 == 0) {
                int i11 = 0;
                while (true) {
                    jt0 jt0Var = bs0Var.f33915s;
                    ds0[] ds0VarArr = jt0Var.f36650n0;
                    if (i11 < ds0VarArr.length) {
                        ds0 ds0Var = ds0VarArr[i11];
                        if (ds0Var.F == 7) {
                            if (bs0Var.h == 0) {
                                ds0Var.f34564w.e(false, true);
                            } else {
                                jt0Var.D(ds0Var.h, 0, null);
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
    public boolean v1(int i7) {
        return true;
    }

    @Override
    public void P1(ArrayList arrayList) {
    }
}
