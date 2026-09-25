package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yt0 implements gg.b2, org.telegram.ui.Cells.a5 {
    public final au0 f30687a;

    public yt0(au0 au0Var) {
        this.f30687a = au0Var;
    }

    @Override
    public void a(int i10) {
        au0 au0Var = this.f30687a;
        au0Var.l();
        if (i10 == 1) {
            int i11 = au0Var.f22774r - 1;
            au0Var.f22774r = i11;
            if (i11 == 0) {
                int i12 = 0;
                while (true) {
                    jv0 jv0Var = au0Var.f22775s;
                    cu0[] cu0VarArr = jv0Var.f25536k0;
                    if (i12 < cu0VarArr.length) {
                        cu0 cu0Var = cu0VarArr[i12];
                        if (cu0Var.F == 7) {
                            if (au0Var.h == 0) {
                                cu0Var.f23402w.e(false, true);
                            } else {
                                jv0Var.z(cu0Var.h, 0, null);
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
        au0 au0Var = this.f30687a;
        TLObject E = au0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return au0Var.f22775s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
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
