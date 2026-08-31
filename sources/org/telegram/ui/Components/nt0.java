package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nt0 implements uf.j1, org.telegram.ui.Cells.a5 {
    public final pt0 f29626a;

    public nt0(pt0 pt0Var) {
        this.f29626a = pt0Var;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public boolean R(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        pt0 pt0Var = this.f29626a;
        TLObject E = pt0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return pt0Var.f30203s.A1.h(tL_chatChannelParticipant, true, !z4, b5Var);
        }
        return false;
    }

    @Override
    public void g(int i10) {
        pt0 pt0Var = this.f29626a;
        pt0Var.l();
        if (i10 == 1) {
            int i11 = pt0Var.f30202r - 1;
            pt0Var.f30202r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    zu0 zu0Var = pt0Var.f30203s;
                    rt0[] rt0VarArr = zu0Var.f33980h0;
                    if (i12 < rt0VarArr.length) {
                        rt0 rt0Var = rt0VarArr[i12];
                        if (rt0Var.C == 7) {
                            if (pt0Var.h == 0) {
                                rt0Var.f30852w.e(false, true);
                            } else {
                                zu0Var.z(rt0Var.h, 0, null);
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
    public a0.h y() {
        return null;
    }

    @Override
    public void V(ArrayList arrayList) {
    }
}
