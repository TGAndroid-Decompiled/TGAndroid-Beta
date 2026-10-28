package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qu0 implements ig.z1, org.telegram.ui.Cells.e5 {
    public final su0 f32022a;

    public qu0(su0 su0Var) {
        this.f32022a = su0Var;
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        int intValue = ((Integer) f5Var.getTag()).intValue();
        su0 su0Var = this.f32022a;
        TLObject E = su0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return su0Var.f32688s.F1.h(tL_chatChannelParticipant, true, !z10, f5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        su0 su0Var = this.f32022a;
        su0Var.l();
        if (i10 == 1) {
            int i11 = su0Var.f32687r - 1;
            su0Var.f32687r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    bw0 bw0Var = su0Var.f32688s;
                    uu0[] uu0VarArr = bw0Var.m0;
                    if (i12 < uu0VarArr.length) {
                        uu0 uu0Var = uu0VarArr[i12];
                        if (uu0Var.E == 7) {
                            if (su0Var.h == 0) {
                                uu0Var.v.e(false, true);
                            } else {
                                bw0Var.C(uu0Var.h, 0, null);
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
