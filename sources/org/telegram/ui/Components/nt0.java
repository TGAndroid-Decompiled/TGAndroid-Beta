package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nt0 implements gg.b2, org.telegram.ui.Cells.a5 {
    public final pt0 f26509a;

    public nt0(pt0 pt0Var) {
        this.f26509a = pt0Var;
    }

    @Override
    public a0.i F() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        pt0 pt0Var = this.f26509a;
        TLObject E = pt0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return pt0Var.f27134s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public void h(int i10) {
        pt0 pt0Var = this.f26509a;
        pt0Var.l();
        if (i10 == 1) {
            int i11 = pt0Var.f27133r - 1;
            pt0Var.f27133r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    yu0 yu0Var = pt0Var.f27134s;
                    rt0[] rt0VarArr = yu0Var.f30426k0;
                    if (i12 < rt0VarArr.length) {
                        rt0 rt0Var = rt0VarArr[i12];
                        if (rt0Var.F == 7) {
                            if (pt0Var.h == 0) {
                                rt0Var.f27730w.e(false, true);
                            } else {
                                yu0Var.z(rt0Var.h, 0, null);
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
    public a0.i w() {
        return null;
    }

    @Override
    public void Q(ArrayList arrayList) {
    }
}
