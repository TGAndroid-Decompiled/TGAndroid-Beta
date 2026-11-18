package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xr0 implements jg.y1, org.telegram.ui.Cells.z4 {
    public final zr0 f42174a;

    public xr0(zr0 zr0Var) {
        this.f42174a = zr0Var;
    }

    @Override
    public a0.h K0() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        zr0 zr0Var = this.f42174a;
        TLObject E = zr0Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = org.telegram.messenger.fj.B1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return zr0Var.f42942s.G1.h(tL_chatChannelParticipant, true, !z10, a5Var);
        }
        return false;
    }

    @Override
    public a0.h d1() {
        return null;
    }

    @Override
    public void r(int i7) {
        zr0 zr0Var = this.f42174a;
        zr0Var.f();
        if (i7 == 1) {
            int i10 = zr0Var.f42941r - 1;
            zr0Var.f42941r = i10;
            if (i10 == 0) {
                int i11 = 0;
                while (true) {
                    gt0 gt0Var = zr0Var.f42942s;
                    bs0[] bs0VarArr = gt0Var.f35609n0;
                    if (i11 < bs0VarArr.length) {
                        bs0 bs0Var = bs0VarArr[i11];
                        if (bs0Var.F == 7) {
                            if (zr0Var.h == 0) {
                                bs0Var.f33774w.e(false, true);
                            } else {
                                gt0Var.D(bs0Var.h, 0, null);
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
    public boolean v1(int i7) {
        return true;
    }

    @Override
    public void P1(ArrayList arrayList) {
    }
}
