package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bu0 implements gg.b2, org.telegram.ui.Cells.a5 {
    public final du0 f23011a;

    public bu0(du0 du0Var) {
        this.f23011a = du0Var;
    }

    @Override
    public void a(int i10) {
        du0 du0Var = this.f23011a;
        du0Var.l();
        if (i10 == 1) {
            int i11 = du0Var.f23732r - 1;
            du0Var.f23732r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    mv0 mv0Var = du0Var.f23733s;
                    fu0[] fu0VarArr = mv0Var.f26425k0;
                    if (i12 < fu0VarArr.length) {
                        fu0 fu0Var = fu0VarArr[i12];
                        if (fu0Var.F == 7) {
                            if (du0Var.h == 0) {
                                fu0Var.f24358w.e(false, true);
                            } else {
                                mv0Var.z(fu0Var.h, 0, null);
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
        du0 du0Var = this.f23011a;
        TLObject E = du0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return du0Var.f23733s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
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
