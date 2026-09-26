package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zt0 implements gg.b2, org.telegram.ui.Cells.a5 {
    public final bu0 f30963a;

    public zt0(bu0 bu0Var) {
        this.f30963a = bu0Var;
    }

    @Override
    public void a(int i10) {
        bu0 bu0Var = this.f30963a;
        bu0Var.l();
        if (i10 == 1) {
            int i11 = bu0Var.f23106r - 1;
            bu0Var.f23106r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    kv0 kv0Var = bu0Var.f23107s;
                    du0[] du0VarArr = kv0Var.f25842k0;
                    if (i12 < du0VarArr.length) {
                        du0 du0Var = du0VarArr[i12];
                        if (du0Var.F == 7) {
                            if (bu0Var.h == 0) {
                                du0Var.f23759w.e(false, true);
                            } else {
                                kv0Var.z(du0Var.h, 0, null);
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
        bu0 bu0Var = this.f30963a;
        TLObject E = bu0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return bu0Var.f23107s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
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
