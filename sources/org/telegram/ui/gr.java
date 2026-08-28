package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements org.telegram.ui.Cells.a5, of.u1 {
    public final ir f38595a;

    public gr(ir irVar) {
        this.f38595a = irVar;
    }

    @Override
    public a0.h O() {
        return null;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        ir irVar = this.f38595a;
        TLObject E = irVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return irVar.f39264y.g0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public void e(int i9) {
        ir irVar = this.f38595a;
        jr jrVar = irVar.f39264y;
        if (!irVar.h.e()) {
            int i10 = irVar.f39260r;
            irVar.l();
            if (irVar.f39260r > i10) {
                jrVar.x0(i10);
            }
            if (!irVar.f39261s && irVar.f39260r == 0 && i9 != 0) {
                jrVar.f39560b.e(false, true);
            }
        }
    }

    @Override
    public boolean p0(int i9) {
        return true;
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void H0(ArrayList arrayList) {
    }
}
