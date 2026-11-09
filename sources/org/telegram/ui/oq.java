package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oq implements org.telegram.ui.Cells.z4, jg.y1 {
    public final pq f48503a;

    public oq(pq pqVar) {
        this.f48503a = pqVar;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        pq pqVar = this.f48503a;
        TLObject E = pqVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return pqVar.D.m0((TLRPC.ChannelParticipant) E, !z9, a5Var);
        }
        return false;
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public void q(int i7) {
        pq pqVar = this.f48503a;
        qq qqVar = pqVar.D;
        if (!pqVar.h.e()) {
            int i10 = pqVar.f48782r;
            pqVar.f();
            if (pqVar.f48782r > i10) {
                qqVar.D0(i10);
            }
            if (!pqVar.f48783s && pqVar.f48782r == 0 && i7 != 0) {
                qqVar.f49118b.e(false, true);
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
