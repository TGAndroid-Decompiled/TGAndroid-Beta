package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nr implements org.telegram.ui.Cells.d5, zf.l1 {
    public final or f40031a;

    public nr(or orVar) {
        this.f40031a = orVar;
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
        or orVar = this.f40031a;
        TLObject E = orVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return orVar.D.l0((TLRPC.ChannelParticipant) E, !z10, e5Var);
        }
        return false;
    }

    @Override
    public void i(int i10) {
        or orVar = this.f40031a;
        pr prVar = orVar.D;
        if (!orVar.h.e()) {
            int i11 = orVar.f40372r;
            orVar.f();
            if (orVar.f40372r > i11) {
                prVar.C0(i11);
            }
            if (!orVar.f40373s && orVar.f40372r == 0 && i10 != 0) {
                prVar.f40721b.e(false, true);
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
