package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mq implements org.telegram.ui.Cells.z4, jg.y1 {
    public final nq f47840a;

    public mq(nq nqVar) {
        this.f47840a = nqVar;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        nq nqVar = this.f47840a;
        TLObject E = nqVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return nqVar.D.m0((TLRPC.ChannelParticipant) E, !z9, a5Var);
        }
        return false;
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public void q(int i7) {
        nq nqVar = this.f47840a;
        oq oqVar = nqVar.D;
        if (!nqVar.h.e()) {
            int i10 = nqVar.f48081r;
            nqVar.f();
            if (nqVar.f48081r > i10) {
                oqVar.D0(i10);
            }
            if (!nqVar.f48082s && nqVar.f48081r == 0 && i7 != 0) {
                oqVar.f48444b.e(false, true);
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
