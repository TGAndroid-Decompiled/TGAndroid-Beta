package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class vs0 implements pf.i1, org.telegram.ui.Cells.x4 {

    public final xs0 f34050a;

    public vs0(xs0 xs0Var) {
        this.f34050a = xs0Var;
    }

    @Override
    public boolean D0(int i10) {
        return true;
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.y4 y4Var, boolean z10) {
        int iIntValue = ((Integer) y4Var.getTag()).intValue();
        xs0 xs0Var = this.f34050a;
        TLObject tLObjectE = xs0Var.E(iIntValue);
        if (!(tLObjectE instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObjectE;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return xs0Var.f34697s.f29165z1.h(tL_chatChannelParticipant, true, !z10, y4Var);
    }

    @Override
    public a0.h h0() {
        return null;
    }

    @Override
    public void i(int i10) {
        xs0 xs0Var = this.f34050a;
        xs0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = xs0Var.f34696r - 1;
        xs0Var.f34696r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            hu0 hu0Var = xs0Var.f34697s;
            zs0[] zs0VarArr = hu0Var.f29122g0;
            if (i12 >= zs0VarArr.length) {
                return;
            }
            zs0 zs0Var = zs0VarArr[i12];
            if (zs0Var.B == 7) {
                if (xs0Var.h == 0) {
                    zs0Var.f35342w.e(false, true);
                } else {
                    hu0Var.z(zs0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override
    public void V0(ArrayList arrayList) {
    }
}
