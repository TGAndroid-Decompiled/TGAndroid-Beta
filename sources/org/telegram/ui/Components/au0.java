package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class au0 implements gg.b2, org.telegram.ui.Cells.b5 {
    public final cu0 f22738a;

    public au0(cu0 cu0Var) {
        this.f22738a = cu0Var;
    }

    @Override
    public a0.i D() {
        return null;
    }

    @Override
    public boolean L(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.c5 c5Var, boolean z10) {
        int intValue = ((Integer) c5Var.getTag()).intValue();
        cu0 cu0Var = this.f22738a;
        TLObject E = cu0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return cu0Var.f23448s.D1.h(tL_chatChannelParticipant, true, !z10, c5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        cu0 cu0Var = this.f22738a;
        cu0Var.l();
        if (i10 == 1) {
            int i11 = cu0Var.f23447r - 1;
            cu0Var.f23447r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    lv0 lv0Var = cu0Var.f23448s;
                    eu0[] eu0VarArr = lv0Var.f26210k0;
                    if (i12 < eu0VarArr.length) {
                        eu0 eu0Var = eu0VarArr[i12];
                        if (eu0Var.F == 7) {
                            if (cu0Var.h == 0) {
                                eu0Var.f24045w.e(false, true);
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
    public a0.i y() {
        return null;
    }

    @Override
    public void O(ArrayList arrayList) {
    }
}
