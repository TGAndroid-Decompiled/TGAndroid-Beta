package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pu0 implements ig.z1, org.telegram.ui.Cells.e5 {
    public final ru0 f31703a;

    public pu0(ru0 ru0Var) {
        this.f31703a = ru0Var;
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        int intValue = ((Integer) f5Var.getTag()).intValue();
        ru0 ru0Var = this.f31703a;
        TLObject E = ru0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return ru0Var.f32337s.F1.h(tL_chatChannelParticipant, true, !z10, f5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        ru0 ru0Var = this.f31703a;
        ru0Var.l();
        if (i10 == 1) {
            int i11 = ru0Var.f32336r - 1;
            ru0Var.f32336r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    aw0 aw0Var = ru0Var.f32337s;
                    tu0[] tu0VarArr = aw0Var.m0;
                    if (i12 < tu0VarArr.length) {
                        tu0 tu0Var = tu0VarArr[i12];
                        if (tu0Var.E == 7) {
                            if (ru0Var.h == 0) {
                                tu0Var.v.e(false, true);
                            } else {
                                aw0Var.C(tu0Var.h, 0, null);
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
    public boolean k0(int i10) {
        return true;
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void p0(ArrayList arrayList) {
    }
}
