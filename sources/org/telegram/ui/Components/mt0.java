package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mt0 implements hg.a2, org.telegram.ui.Cells.z4 {
    public final ot0 f28514a;

    public mt0(ot0 ot0Var) {
        this.f28514a = ot0Var;
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public boolean Q(int i10) {
        return true;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ot0 ot0Var = this.f28514a;
        TLObject E = ot0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return ot0Var.f29186s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        ot0 ot0Var = this.f28514a;
        ot0Var.l();
        if (i10 == 1) {
            int i11 = ot0Var.f29185r - 1;
            ot0Var.f29185r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    xu0 xu0Var = ot0Var.f29186s;
                    qt0[] qt0VarArr = xu0Var.f32702k0;
                    if (i12 < qt0VarArr.length) {
                        qt0 qt0Var = qt0VarArr[i12];
                        if (qt0Var.F == 7) {
                            if (ot0Var.h == 0) {
                                qt0Var.f29823w.e(false, true);
                            } else {
                                xu0Var.z(qt0Var.h, 0, null);
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
    public void Y(ArrayList arrayList) {
    }
}
