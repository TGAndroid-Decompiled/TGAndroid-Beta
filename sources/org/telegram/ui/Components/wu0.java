package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wu0 implements gg.a2, org.telegram.ui.Cells.a5 {
    public final yu0 f32551a;

    public wu0(yu0 yu0Var) {
        this.f32551a = yu0Var;
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public a0.i W() {
        return null;
    }

    @Override
    public boolean b0(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        yu0 yu0Var = this.f32551a;
        TLObject E = yu0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return yu0Var.f33181s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public void h(int i10) {
        yu0 yu0Var = this.f32551a;
        yu0Var.l();
        if (i10 == 1) {
            int i11 = yu0Var.f33180r - 1;
            yu0Var.f33180r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    hw0 hw0Var = yu0Var.f33181s;
                    av0[] av0VarArr = hw0Var.f26933k0;
                    if (i12 < av0VarArr.length) {
                        av0 av0Var = av0VarArr[i12];
                        if (av0Var.F == 7) {
                            if (yu0Var.h == 0) {
                                av0Var.f24490w.e(false, true);
                            } else {
                                hw0Var.z(av0Var.h, 0, null);
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
    public void i0(ArrayList arrayList) {
    }
}
