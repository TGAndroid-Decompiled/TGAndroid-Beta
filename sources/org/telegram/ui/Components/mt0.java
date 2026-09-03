package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mt0 implements uf.j1, org.telegram.ui.Cells.a5 {
    public final ot0 f29258a;

    public mt0(ot0 ot0Var) {
        this.f29258a = ot0Var;
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
        ot0 ot0Var = this.f29258a;
        TLObject E = ot0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return ot0Var.f29886s.A1.h(tL_chatChannelParticipant, true, !z4, b5Var);
        }
        return false;
    }

    @Override
    public void g(int i10) {
        ot0 ot0Var = this.f29258a;
        ot0Var.l();
        if (i10 == 1) {
            int i11 = ot0Var.f29885r - 1;
            ot0Var.f29885r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    yu0 yu0Var = ot0Var.f29886s;
                    qt0[] qt0VarArr = yu0Var.f33625h0;
                    if (i12 < qt0VarArr.length) {
                        qt0 qt0Var = qt0VarArr[i12];
                        if (qt0Var.C == 7) {
                            if (ot0Var.h == 0) {
                                qt0Var.f30524w.e(false, true);
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
    public a0.h y() {
        return null;
    }

    @Override
    public void V(ArrayList arrayList) {
    }
}
