package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class iu0 implements hg.z1, org.telegram.ui.Cells.z4 {
    public final ku0 f27361a;

    public iu0(ku0 ku0Var) {
        this.f27361a = ku0Var;
    }

    @Override
    public a0.h G() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ku0 ku0Var = this.f27361a;
        TLObject E = ku0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return ku0Var.f27976s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        ku0 ku0Var = this.f27361a;
        ku0Var.l();
        if (i10 == 1) {
            int i11 = ku0Var.f27975r - 1;
            ku0Var.f27975r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    tv0 tv0Var = ku0Var.f27976s;
                    mu0[] mu0VarArr = tv0Var.f30710k0;
                    if (i12 < mu0VarArr.length) {
                        mu0 mu0Var = mu0VarArr[i12];
                        if (mu0Var.F == 7) {
                            if (ku0Var.h == 0) {
                                mu0Var.f28613w.e(false, true);
                            } else {
                                tv0Var.z(mu0Var.h, 0, null);
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
    public void S(ArrayList arrayList) {
    }
}
