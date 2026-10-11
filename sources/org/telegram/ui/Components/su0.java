package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class su0 implements gg.a2, org.telegram.ui.Cells.a5 {
    public final uu0 f30865a;

    public su0(uu0 uu0Var) {
        this.f30865a = uu0Var;
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        uu0 uu0Var = this.f30865a;
        TLObject E = uu0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return uu0Var.f31570s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void h(int i10) {
        uu0 uu0Var = this.f30865a;
        uu0Var.l();
        if (i10 == 1) {
            int i11 = uu0Var.f31569r - 1;
            uu0Var.f31569r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    dw0 dw0Var = uu0Var.f31570s;
                    wu0[] wu0VarArr = dw0Var.f25711k0;
                    if (i12 < wu0VarArr.length) {
                        wu0 wu0Var = wu0VarArr[i12];
                        if (wu0Var.F == 7) {
                            if (uu0Var.h == 0) {
                                wu0Var.f32746w.e(false, true);
                            } else {
                                dw0Var.z(wu0Var.h, 0, null);
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
