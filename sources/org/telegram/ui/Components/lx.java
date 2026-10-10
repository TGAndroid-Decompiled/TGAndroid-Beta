package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class lx extends g.o {
    public final b00 f28556c;

    public lx(b00 b00Var) {
        this.f28556c = b00Var;
    }

    @Override
    public final int i(int i10) {
        b00 b00Var = this.f28556c;
        wz wzVar = b00Var.f24763z0;
        s4.i0 adapter = b00Var.D0.getAdapter();
        rz rzVar = b00Var.f24760y0;
        if (adapter == rzVar) {
            if (i10 == 0) {
                return rzVar.d;
            }
            if (i10 == rzVar.f30613s || (rzVar.h.get(i10) != null && !(rzVar.h.get(i10) instanceof TLRPC.Document))) {
                return rzVar.d;
            }
            return 1;
        } else if (i10 != wzVar.f32788x && (wzVar.f32785r.get(i10) == null || (wzVar.f32785r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return rzVar.d;
        }
    }
}
