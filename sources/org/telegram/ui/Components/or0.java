package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class or0 implements jg.y1, org.telegram.ui.Cells.z4 {
    public final qr0 f36688a;

    public or0(qr0 qr0Var) {
        this.f36688a = qr0Var;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        qr0 qr0Var = this.f36688a;
        TLObject E = qr0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = org.telegram.messenger.ij.C1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return qr0Var.f37415s.F1.h(tL_chatChannelParticipant, true, !z9, a5Var);
        }
        return false;
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public void q(int i7) {
        qr0 qr0Var = this.f36688a;
        qr0Var.f();
        if (i7 == 1) {
            int i10 = qr0Var.f37414r - 1;
            qr0Var.f37414r = i10;
            if (i10 == 0) {
                int i11 = 0;
                while (true) {
                    xs0 xs0Var = qr0Var.f37415s;
                    sr0[] sr0VarArr = xs0Var.m0;
                    if (i11 < sr0VarArr.length) {
                        sr0 sr0Var = sr0VarArr[i11];
                        if (sr0Var.E == 7) {
                            if (qr0Var.h == 0) {
                                sr0Var.f38129w.e(false, true);
                            } else {
                                xs0Var.D(sr0Var.h, 0, null);
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
