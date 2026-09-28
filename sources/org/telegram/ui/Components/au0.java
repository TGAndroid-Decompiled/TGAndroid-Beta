package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class au0 implements gg.b2, org.telegram.ui.Cells.a5 {
    public final cu0 f22727a;

    public au0(cu0 cu0Var) {
        this.f22727a = cu0Var;
    }

    @Override
    public void a(int i10) {
        cu0 cu0Var = this.f22727a;
        cu0Var.l();
        if (i10 == 1) {
            int i11 = cu0Var.f23398r - 1;
            cu0Var.f23398r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    lv0 lv0Var = cu0Var.f23399s;
                    eu0[] eu0VarArr = lv0Var.f26136k0;
                    if (i12 < eu0VarArr.length) {
                        eu0 eu0Var = eu0VarArr[i12];
                        if (eu0Var.F == 7) {
                            if (cu0Var.h == 0) {
                                eu0Var.f24072w.e(false, true);
                            } else {
                                lv0Var.z(eu0Var.h, 0, null);
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
        cu0 cu0Var = this.f22727a;
        TLObject E = cu0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return cu0Var.f23399s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i i() {
        return null;
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public boolean s(int i10) {
        return true;
    }

    @Override
    public void F(ArrayList arrayList) {
    }
}
