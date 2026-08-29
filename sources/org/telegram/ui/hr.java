package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hr implements org.telegram.ui.Cells.y4, rf.j1 {
    public final ir f39000a;

    @Override
    public boolean A(int i10) {
        return true;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.z4 z4Var, boolean z10) {
        int intValue = ((Integer) z4Var.getTag()).intValue();
        ir irVar = this.f39000a;
        TLObject E = irVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return irVar.f39329y.h0((TLRPC.ChannelParticipant) E, !z10, z4Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        ir irVar = this.f39000a;
        jr jrVar = irVar.f39329y;
        if (!irVar.h.e()) {
            int i11 = irVar.f39325r;
            irVar.l();
            if (irVar.f39325r > i11) {
                jrVar.y0(i11);
            }
            if (!irVar.f39326s && irVar.f39325r == 0 && i10 != 0) {
                jrVar.f39621b.e(false, true);
            }
        }
    }

    @Override
    public a0.h q() {
        return null;
    }

    @Override
    public a0.h t() {
        return null;
    }

    @Override
    public void E(ArrayList arrayList) {
    }
}
