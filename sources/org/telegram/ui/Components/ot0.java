package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ot0 implements gg.b2, org.telegram.ui.Cells.z4 {
    public final qt0 f26850a;

    public ot0(qt0 qt0Var) {
        this.f26850a = qt0Var;
    }

    @Override
    public a0.i F() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        qt0 qt0Var = this.f26850a;
        TLObject E = qt0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return qt0Var.f27407s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void h(int i10) {
        qt0 qt0Var = this.f26850a;
        qt0Var.l();
        if (i10 == 1) {
            int i11 = qt0Var.f27406r - 1;
            qt0Var.f27406r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    zu0 zu0Var = qt0Var.f27407s;
                    st0[] st0VarArr = zu0Var.f30635k0;
                    if (i12 < st0VarArr.length) {
                        st0 st0Var = st0VarArr[i12];
                        if (st0Var.F == 7) {
                            if (qt0Var.h == 0) {
                                st0Var.f27927w.e(false, true);
                            } else {
                                zu0Var.z(st0Var.h, 0, null);
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
    public a0.i w() {
        return null;
    }

    @Override
    public void Q(ArrayList arrayList) {
    }
}
