package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qr0 implements jg.y1, org.telegram.ui.Cells.z4 {
    public final sr0 f37470a;

    public qr0(sr0 sr0Var) {
        this.f37470a = sr0Var;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        sr0 sr0Var = this.f37470a;
        TLObject E = sr0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = org.telegram.messenger.ij.B1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return sr0Var.f38146s.F1.h(tL_chatChannelParticipant, true, !z9, a5Var);
        }
        return false;
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public void q(int i7) {
        sr0 sr0Var = this.f37470a;
        sr0Var.f();
        if (i7 == 1) {
            int i10 = sr0Var.f38145r - 1;
            sr0Var.f38145r = i10;
            if (i10 == 0) {
                int i11 = 0;
                while (true) {
                    zs0 zs0Var = sr0Var.f38146s;
                    ur0[] ur0VarArr = zs0Var.m0;
                    if (i11 < ur0VarArr.length) {
                        ur0 ur0Var = ur0VarArr[i11];
                        if (ur0Var.E == 7) {
                            if (sr0Var.h == 0) {
                                ur0Var.f38795w.e(false, true);
                            } else {
                                zs0Var.D(ur0Var.h, 0, null);
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
    public a0.h v0() {
        return null;
    }

    @Override
    public void m1(ArrayList arrayList) {
    }
}
