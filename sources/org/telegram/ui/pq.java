package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pq implements org.telegram.ui.Cells.a5, jg.y1 {
    public final qq f51092a;

    public pq(qq qqVar) {
        this.f51092a = qqVar;
    }

    @Override
    public boolean W1(int i7) {
        return true;
    }

    @Override
    public a0.h Y0() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        qq qqVar = this.f51092a;
        TLObject E = qqVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return qqVar.E.m0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.h u1() {
        return null;
    }

    @Override
    public void v(int i7) {
        qq qqVar = this.f51092a;
        rq rqVar = qqVar.E;
        if (!qqVar.h.e()) {
            int i10 = qqVar.f51508r;
            qqVar.f();
            if (qqVar.f51508r > i10) {
                rqVar.D0(i10);
            }
            if (!qqVar.f51509s && qqVar.f51508r == 0 && i7 != 0) {
                rqVar.f51813b.e(false, true);
            }
        }
    }

    @Override
    public void m2(ArrayList arrayList) {
    }
}
