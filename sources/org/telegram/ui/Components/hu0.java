package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hu0 implements hg.z1, org.telegram.ui.Cells.z4 {
    public final ju0 f26936a;

    public hu0(ju0 ju0Var) {
        this.f26936a = ju0Var;
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ju0 ju0Var = this.f26936a;
        TLObject E = ju0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return ju0Var.f27603s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        ju0 ju0Var = this.f26936a;
        ju0Var.l();
        if (i10 == 1) {
            int i11 = ju0Var.f27602r - 1;
            ju0Var.f27602r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    sv0 sv0Var = ju0Var.f27603s;
                    lu0[] lu0VarArr = sv0Var.f30364k0;
                    if (i12 < lu0VarArr.length) {
                        lu0 lu0Var = lu0VarArr[i12];
                        if (lu0Var.F == 7) {
                            if (ju0Var.h == 0) {
                                lu0Var.f28334w.e(false, true);
                            } else {
                                sv0Var.z(lu0Var.h, 0, null);
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
    public void Y(ArrayList arrayList) {
    }
}
