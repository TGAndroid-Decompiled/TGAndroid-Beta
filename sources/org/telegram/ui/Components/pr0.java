package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pr0 implements jg.y1, org.telegram.ui.Cells.z4 {
    public final rr0 f37068a;

    public pr0(rr0 rr0Var) {
        this.f37068a = rr0Var;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        rr0 rr0Var = this.f37068a;
        TLObject E = rr0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = org.telegram.messenger.ij.B1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return rr0Var.f37730s.F1.h(tL_chatChannelParticipant, true, !z9, a5Var);
        }
        return false;
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public void q(int i7) {
        rr0 rr0Var = this.f37068a;
        rr0Var.f();
        if (i7 == 1) {
            int i10 = rr0Var.f37729r - 1;
            rr0Var.f37729r = i10;
            if (i10 == 0) {
                int i11 = 0;
                while (true) {
                    ys0 ys0Var = rr0Var.f37730s;
                    tr0[] tr0VarArr = ys0Var.m0;
                    if (i11 < tr0VarArr.length) {
                        tr0 tr0Var = tr0VarArr[i11];
                        if (tr0Var.E == 7) {
                            if (rr0Var.h == 0) {
                                tr0Var.f38389w.e(false, true);
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
    public a0.h v0() {
        return null;
    }

    @Override
    public void m1(ArrayList arrayList) {
    }
}
