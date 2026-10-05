package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fu0 implements gg.b2, org.telegram.ui.Cells.a5 {
    public final hu0 f26589a;

    public fu0(hu0 hu0Var) {
        this.f26589a = hu0Var;
    }

    @Override
    public void a(int i10) {
        hu0 hu0Var = this.f26589a;
        hu0Var.l();
        if (i10 == 1) {
            int i11 = hu0Var.f27332r - 1;
            hu0Var.f27332r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    qv0 qv0Var = hu0Var.f27333s;
                    ju0[] ju0VarArr = qv0Var.f30239k0;
                    if (i12 < ju0VarArr.length) {
                        ju0 ju0Var = ju0VarArr[i12];
                        if (ju0Var.F == 7) {
                            if (hu0Var.h == 0) {
                                ju0Var.f27979w.e(false, true);
                            } else {
                                qv0Var.z(ju0Var.h, 0, null);
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
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        hu0 hu0Var = this.f26589a;
        TLObject E = hu0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return hu0Var.f27333s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i s() {
        return null;
    }

    @Override
    public a0.i x() {
        return null;
    }

    @Override
    public boolean z(int i10) {
        return true;
    }

    @Override
    public void F(ArrayList arrayList) {
    }
}
