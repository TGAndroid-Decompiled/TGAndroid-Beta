package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hr implements org.telegram.ui.Cells.z4, hg.z1 {
    public final ir f37967a;

    @Override
    public a0.h G() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ir irVar = this.f37967a;
        TLObject E = irVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return irVar.f38374y.h0((TLRPC.ChannelParticipant) E, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        ir irVar = this.f37967a;
        jr jrVar = irVar.f38374y;
        if (!irVar.h.e()) {
            int i11 = irVar.f38370r;
            irVar.l();
            if (irVar.f38370r > i11) {
                jrVar.y0(i11);
            }
            if (!irVar.f38371s && irVar.f38370r == 0 && i10 != 0) {
                jrVar.f38619b.e(false, true);
            }
        }
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public void S(ArrayList arrayList) {
    }
}
