package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ju0 implements hg.z1, org.telegram.ui.Cells.z4 {
    public final lu0 f27640a;

    public ju0(lu0 lu0Var) {
        this.f27640a = lu0Var;
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
        lu0 lu0Var = this.f27640a;
        TLObject E = lu0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return lu0Var.f28281s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        lu0 lu0Var = this.f27640a;
        lu0Var.l();
        if (i10 == 1) {
            int i11 = lu0Var.f28280r - 1;
            lu0Var.f28280r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    uv0 uv0Var = lu0Var.f28281s;
                    nu0[] nu0VarArr = uv0Var.f31046k0;
                    if (i12 < nu0VarArr.length) {
                        nu0 nu0Var = nu0VarArr[i12];
                        if (nu0Var.F == 7) {
                            if (lu0Var.h == 0) {
                                nu0Var.f28882w.e(false, true);
                            } else {
                                uv0Var.z(nu0Var.h, 0, null);
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
