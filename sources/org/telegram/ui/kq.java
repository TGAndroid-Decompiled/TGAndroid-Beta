package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kq implements org.telegram.ui.Cells.z4, kg.u1 {
    public final mq f46998a;

    public kq(mq mqVar) {
        this.f46998a = mqVar;
    }

    @Override
    public a0.h C0() {
        return null;
    }

    @Override
    public boolean J1(int i3) {
        return true;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        mq mqVar = this.f46998a;
        TLObject E = mqVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return mqVar.E.m0((TLRPC.ChannelParticipant) E, !z10, a5Var);
        }
        return false;
    }

    @Override
    public a0.h k1() {
        return null;
    }

    @Override
    public void r(int i3) {
        mq mqVar = this.f46998a;
        nq nqVar = mqVar.E;
        if (!mqVar.h.e()) {
            int i10 = mqVar.f47746r;
            mqVar.f();
            if (mqVar.f47746r > i10) {
                nqVar.D0(i10);
            }
            if (!mqVar.f47747s && mqVar.f47746r == 0 && i3 != 0) {
                nqVar.f48049b.e(false, true);
            }
        }
    }

    @Override
    public void b2(ArrayList arrayList) {
    }
}
