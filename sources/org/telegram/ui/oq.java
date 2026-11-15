package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oq implements org.telegram.ui.Cells.z4, jg.y1 {
    public final pq f50022a;

    public oq(pq pqVar) {
        this.f50022a = pqVar;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        pq pqVar = this.f50022a;
        TLObject E = pqVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return pqVar.E.m0((TLRPC.ChannelParticipant) E, !z10, a5Var);
        }
        return false;
    }

    @Override
    public boolean e0(int i7) {
        return true;
    }

    @Override
    public void i(int i7) {
        pq pqVar = this.f50022a;
        qq qqVar = pqVar.E;
        if (!pqVar.h.e()) {
            int i10 = pqVar.f50330r;
            pqVar.f();
            if (pqVar.f50330r > i10) {
                qqVar.D0(i10);
            }
            if (!pqVar.f50331s && pqVar.f50330r == 0 && i7 != 0) {
                qqVar.f50711b.e(false, true);
            }
        }
    }

    @Override
    public void l0(ArrayList arrayList) {
    }
}
