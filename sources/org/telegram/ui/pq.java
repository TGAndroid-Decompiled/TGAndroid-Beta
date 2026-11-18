package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pq implements org.telegram.ui.Cells.z4, jg.y1 {
    public final qq f50956a;

    public pq(qq qqVar) {
        this.f50956a = qqVar;
    }

    @Override
    public a0.h K0() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        qq qqVar = this.f50956a;
        TLObject E = qqVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return qqVar.E.m0((TLRPC.ChannelParticipant) E, !z10, a5Var);
        }
        return false;
    }

    @Override
    public a0.h d1() {
        return null;
    }

    @Override
    public void r(int i7) {
        qq qqVar = this.f50956a;
        rq rqVar = qqVar.E;
        if (!qqVar.h.e()) {
            int i10 = qqVar.f51308r;
            qqVar.f();
            if (qqVar.f51308r > i10) {
                rqVar.D0(i10);
            }
            if (!qqVar.f51309s && qqVar.f51308r == 0 && i7 != 0) {
                rqVar.f51730b.e(false, true);
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
