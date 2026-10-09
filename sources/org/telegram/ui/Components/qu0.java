package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qu0 implements gg.a2, org.telegram.ui.Cells.a5 {
    public final su0 f30267a;

    public qu0(su0 su0Var) {
        this.f30267a = su0Var;
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        su0 su0Var = this.f30267a;
        TLObject E = su0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return su0Var.f30899s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void h(int i10) {
        su0 su0Var = this.f30267a;
        su0Var.l();
        if (i10 == 1) {
            int i11 = su0Var.f30898r - 1;
            su0Var.f30898r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    bw0 bw0Var = su0Var.f30899s;
                    uu0[] uu0VarArr = bw0Var.f25142k0;
                    if (i12 < uu0VarArr.length) {
                        uu0 uu0Var = uu0VarArr[i12];
                        if (uu0Var.F == 7) {
                            if (su0Var.h == 0) {
                                uu0Var.f31627w.e(false, true);
                            } else {
                                bw0Var.z(uu0Var.h, 0, null);
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
    public boolean s0(int i10) {
        return true;
    }

    @Override
    public void x0(ArrayList arrayList) {
    }
}
