package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eu0 implements gg.b2, org.telegram.ui.Cells.a5 {
    public final gu0 f26131a;

    public eu0(gu0 gu0Var) {
        this.f26131a = gu0Var;
    }

    @Override
    public void a(int i10) {
        gu0 gu0Var = this.f26131a;
        gu0Var.l();
        if (i10 == 1) {
            int i11 = gu0Var.f26924r - 1;
            gu0Var.f26924r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    pv0 pv0Var = gu0Var.f26925s;
                    iu0[] iu0VarArr = pv0Var.f29776k0;
                    if (i12 < iu0VarArr.length) {
                        iu0 iu0Var = iu0VarArr[i12];
                        if (iu0Var.F == 7) {
                            if (gu0Var.h == 0) {
                                iu0Var.f27503w.e(false, true);
                            } else {
                                pv0Var.z(iu0Var.h, 0, null);
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
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        gu0 gu0Var = this.f26131a;
        TLObject E = gu0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return gu0Var.f26925s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public a0.i y() {
        return null;
    }

    @Override
    public boolean z(int i10) {
        return true;
    }

    @Override
    public void C(ArrayList arrayList) {
    }
}
