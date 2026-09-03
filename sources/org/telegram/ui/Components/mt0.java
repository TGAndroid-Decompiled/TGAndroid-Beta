package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mt0 implements tf.i1, org.telegram.ui.Cells.z4 {
    public final ot0 f27138a;

    public mt0(ot0 ot0Var) {
        this.f27138a = ot0Var;
    }

    @Override
    public a0.h H0() {
        return null;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z4) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ot0 ot0Var = this.f27138a;
        TLObject E = ot0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return ot0Var.f27650s.A1.h(tL_chatChannelParticipant, true, !z4, a5Var);
        }
        return false;
    }

    @Override
    public void k(int i10) {
        ot0 ot0Var = this.f27138a;
        ot0Var.l();
        if (i10 == 1) {
            int i11 = ot0Var.f27649r - 1;
            ot0Var.f27649r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    yu0 yu0Var = ot0Var.f27650s;
                    qt0[] qt0VarArr = yu0Var.f31131h0;
                    if (i12 < qt0VarArr.length) {
                        qt0 qt0Var = qt0VarArr[i12];
                        if (qt0Var.C == 7) {
                            if (ot0Var.h == 0) {
                                qt0Var.f28263w.e(false, true);
                            } else {
                                yu0Var.z(qt0Var.h, 0, null);
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
    public boolean t1(int i10) {
        return true;
    }

    @Override
    public void J1(ArrayList arrayList) {
    }
}
