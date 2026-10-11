package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class lx extends g.o {
    public final b00 f28632c;

    public lx(b00 b00Var) {
        this.f28632c = b00Var;
    }

    @Override
    public final int i(int i10) {
        b00 b00Var = this.f28632c;
        wz wzVar = b00Var.f24805z0;
        s4.i0 adapter = b00Var.D0.getAdapter();
        rz rzVar = b00Var.f24802y0;
        if (adapter == rzVar) {
            if (i10 == 0) {
                return rzVar.d;
            }
            if (i10 == rzVar.f30672s || (rzVar.h.get(i10) != null && !(rzVar.h.get(i10) instanceof TLRPC.Document))) {
                return rzVar.d;
            }
            return 1;
        } else if (i10 != wzVar.f32818x && (wzVar.f32815r.get(i10) == null || (wzVar.f32815r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return rzVar.d;
        }
    }
}
