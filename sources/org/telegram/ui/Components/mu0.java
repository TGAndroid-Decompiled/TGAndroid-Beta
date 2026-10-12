package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mu0 implements hg.z1, org.telegram.ui.Cells.a5 {
    public final ou0 f27502a;

    public mu0(ou0 ou0Var) {
        this.f27502a = ou0Var;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        ou0 ou0Var = this.f27502a;
        TLObject E = ou0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return ou0Var.f28063s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.h j0() {
        return null;
    }

    @Override
    public void k(int i10) {
        ou0 ou0Var = this.f27502a;
        ou0Var.l();
        if (i10 == 1) {
            int i11 = ou0Var.f28062r - 1;
            ou0Var.f28062r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    xv0 xv0Var = ou0Var.f28063s;
                    qu0[] qu0VarArr = xv0Var.f31364k0;
                    if (i12 < qu0VarArr.length) {
                        qu0 qu0Var = qu0VarArr[i12];
                        if (qu0Var.F == 7) {
                            if (ou0Var.h == 0) {
                                qu0Var.f28682w.e(false, true);
                            } else {
                                xv0Var.z(qu0Var.h, 0, null);
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
    public boolean t0(int i10) {
        return true;
    }

    @Override
    public void I0(ArrayList arrayList) {
    }
}
