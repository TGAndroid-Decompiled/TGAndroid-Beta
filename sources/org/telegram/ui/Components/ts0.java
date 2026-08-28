package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ts0 implements of.u1, org.telegram.ui.Cells.a5 {
    public final vs0 f32787a;

    public ts0(vs0 vs0Var) {
        this.f32787a = vs0Var;
    }

    @Override
    public a0.h O() {
        return null;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        vs0 vs0Var = this.f32787a;
        TLObject E = vs0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return vs0Var.f34002s.f28180z1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public void e(int i9) {
        vs0 vs0Var = this.f32787a;
        vs0Var.l();
        if (i9 == 1) {
            int i10 = vs0Var.f34001r - 1;
            vs0Var.f34001r = i10;
            if (i10 == 0) {
                int i11 = 0;
                while (true) {
                    eu0 eu0Var = vs0Var.f34002s;
                    xs0[] xs0VarArr = eu0Var.f28137g0;
                    if (i11 < xs0VarArr.length) {
                        xs0 xs0Var = xs0VarArr[i11];
                        if (xs0Var.B == 7) {
                            if (vs0Var.h == 0) {
                                xs0Var.f34763w.e(false, true);
                            } else {
                                eu0Var.z(xs0Var.h, 0, null);
                            }
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public boolean p0(int i9) {
        return true;
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void H0(ArrayList arrayList) {
    }
}
