package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pq implements org.telegram.ui.Cells.z4, jg.y1 {
    public final qq f48819a;

    public pq(qq qqVar) {
        this.f48819a = qqVar;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        qq qqVar = this.f48819a;
        TLObject E = qqVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return qqVar.D.m0((TLRPC.ChannelParticipant) E, !z9, a5Var);
        }
        return false;
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public void q(int i7) {
        qq qqVar = this.f48819a;
        rq rqVar = qqVar.D;
        if (!qqVar.h.e()) {
            int i10 = qqVar.f49127r;
            qqVar.f();
            if (qqVar.f49127r > i10) {
                rqVar.D0(i10);
            }
            if (!qqVar.f49128s && qqVar.f49127r == 0 && i7 != 0) {
                rqVar.f49499b.e(false, true);
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
