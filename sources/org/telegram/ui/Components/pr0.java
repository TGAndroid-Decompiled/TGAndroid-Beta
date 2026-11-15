package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pr0 implements jg.y1, org.telegram.ui.Cells.z4 {
    public final rr0 f38394a;

    public pr0(rr0 rr0Var) {
        this.f38394a = rr0Var;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        rr0 rr0Var = this.f38394a;
        TLObject E = rr0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = org.telegram.messenger.gj.B1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return rr0Var.f39050s.G1.h(tL_chatChannelParticipant, true, !z10, a5Var);
        }
        return false;
    }

    @Override
    public boolean e0(int i7) {
        return true;
    }

    @Override
    public void i(int i7) {
        rr0 rr0Var = this.f38394a;
        rr0Var.f();
        if (i7 == 1) {
            int i10 = rr0Var.f39049r - 1;
            rr0Var.f39049r = i10;
            if (i10 == 0) {
                int i11 = 0;
                while (true) {
                    ys0 ys0Var = rr0Var.f39050s;
                    tr0[] tr0VarArr = ys0Var.f42119n0;
                    if (i11 < tr0VarArr.length) {
                        tr0 tr0Var = tr0VarArr[i11];
                        if (tr0Var.F == 7) {
                            if (rr0Var.h == 0) {
                                tr0Var.f39795w.e(false, true);
                            } else {
                                ys0Var.D(tr0Var.h, 0, null);
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
    public void l0(ArrayList arrayList) {
    }
}
