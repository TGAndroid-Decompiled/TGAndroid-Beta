package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class et0 implements rf.j1, org.telegram.ui.Cells.y4 {
    public final gt0 f28178a;

    public et0(gt0 gt0Var) {
        this.f28178a = gt0Var;
    }

    @Override
    public boolean A(int i10) {
        return true;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.z4 z4Var, boolean z10) {
        int intValue = ((Integer) z4Var.getTag()).intValue();
        gt0 gt0Var = this.f28178a;
        TLObject E = gt0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return gt0Var.f28985s.f32113z1.h(tL_chatChannelParticipant, true, !z10, z4Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        gt0 gt0Var = this.f28178a;
        gt0Var.l();
        if (i10 == 1) {
            int i11 = gt0Var.f28984r - 1;
            gt0Var.f28984r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    qu0 qu0Var = gt0Var.f28985s;
                    it0[] it0VarArr = qu0Var.f32070g0;
                    if (i12 < it0VarArr.length) {
                        it0 it0Var = it0VarArr[i12];
                        if (it0Var.B == 7) {
                            if (gt0Var.h == 0) {
                                it0Var.f29471w.e(false, true);
                            } else {
                                qu0Var.z(it0Var.h, 0, null);
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
    public a0.h q() {
        return null;
    }

    @Override
    public a0.h t() {
        return null;
    }

    @Override
    public void E(ArrayList arrayList) {
    }
}
