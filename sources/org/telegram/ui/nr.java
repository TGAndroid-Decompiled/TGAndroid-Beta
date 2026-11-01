package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nr implements org.telegram.ui.Cells.d5, zf.l1 {
    public final or f39960a;

    public nr(or orVar) {
        this.f39960a = orVar;
    }

    @Override
    public a0.h M() {
        return null;
    }

    @Override
    public boolean Y(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        int intValue = ((Integer) e5Var.getTag()).intValue();
        or orVar = this.f39960a;
        TLObject E = orVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return orVar.D.m0((TLRPC.ChannelParticipant) E, !z10, e5Var);
        }
        return false;
    }

    @Override
    public void i(int i10) {
        or orVar = this.f39960a;
        pr prVar = orVar.D;
        if (!orVar.h.e()) {
            int i11 = orVar.f40254r;
            orVar.f();
            if (orVar.f40254r > i11) {
                prVar.D0(i11);
            }
            if (!orVar.f40255s && orVar.f40254r == 0 && i10 != 0) {
                prVar.f40528b.e(false, true);
            }
        }
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public void c0(ArrayList arrayList) {
    }
}
