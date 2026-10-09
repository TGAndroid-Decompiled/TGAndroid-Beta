package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class kx extends g.o {
    public final a00 f28180c;

    public kx(a00 a00Var) {
        this.f28180c = a00Var;
    }

    @Override
    public final int i(int i10) {
        a00 a00Var = this.f28180c;
        vz vzVar = a00Var.f24475z0;
        s4.i0 adapter = a00Var.D0.getAdapter();
        qz qzVar = a00Var.f24472y0;
        if (adapter == qzVar) {
            if (i10 == 0) {
                return qzVar.d;
            }
            if (i10 == qzVar.f30309s || (qzVar.h.get(i10) != null && !(qzVar.h.get(i10) instanceof TLRPC.Document))) {
                return qzVar.d;
            }
            return 1;
        } else if (i10 != vzVar.f32484x && (vzVar.f32481r.get(i10) == null || (vzVar.f32481r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return qzVar.d;
        }
    }
}
