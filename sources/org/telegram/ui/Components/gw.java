package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class gw extends f2.w {

    public final yy f28834c;

    public gw(yy yyVar) {
        this.f28834c = yyVar;
    }

    @Override
    public final int i(int i10) {
        yy yyVar = this.f28834c;
        ty tyVar = yyVar.f35044v0;
        f2.q0 adapter = yyVar.f35059z0.getAdapter();
        py pyVar = yyVar.f35041u0;
        if (adapter != pyVar) {
            if (i10 == tyVar.f32913x || !(tyVar.f32910r.get(i10) == null || (tyVar.f32910r.get(i10) instanceof TLRPC.Document))) {
                return pyVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return pyVar.d;
        }
        if (i10 == pyVar.f31691s || !(pyVar.h.get(i10) == null || (pyVar.h.get(i10) instanceof TLRPC.Document))) {
            return pyVar.d;
        }
        return 1;
    }
}
