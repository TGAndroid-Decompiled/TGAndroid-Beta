package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ru0 implements gg.a2, org.telegram.ui.Cells.a5 {
    public final tu0 f30571a;

    public ru0(tu0 tu0Var) {
        this.f30571a = tu0Var;
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        tu0 tu0Var = this.f30571a;
        TLObject E = tu0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return tu0Var.f31225s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void h(int i10) {
        tu0 tu0Var = this.f30571a;
        tu0Var.l();
        if (i10 == 1) {
            int i11 = tu0Var.f31224r - 1;
            tu0Var.f31224r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    cw0 cw0Var = tu0Var.f31225s;
                    vu0[] vu0VarArr = cw0Var.f25450k0;
                    if (i12 < vu0VarArr.length) {
                        vu0 vu0Var = vu0VarArr[i12];
                        if (vu0Var.F == 7) {
                            if (tu0Var.h == 0) {
                                vu0Var.f32521w.e(false, true);
                            } else {
                                cw0Var.z(vu0Var.h, 0, null);
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
    public boolean s0(int i10) {
        return true;
    }

    @Override
    public void x0(ArrayList arrayList) {
    }
}
