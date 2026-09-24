package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ww extends g.p {
    public final lz f30183c;

    public ww(lz lzVar) {
        this.f30183c = lzVar;
    }

    @Override
    public final int i(int i10) {
        lz lzVar = this.f30183c;
        gz gzVar = lzVar.f26302z0;
        s4.h0 adapter = lzVar.D0.getAdapter();
        cz czVar = lzVar.f26299y0;
        if (adapter == czVar) {
            if (i10 == 0) {
                return czVar.d;
            }
            if (i10 == czVar.f23409s || (czVar.h.get(i10) != null && !(czVar.h.get(i10) instanceof TLRPC.Document))) {
                return czVar.d;
            }
            return 1;
        } else if (i10 != gzVar.f24569x && (gzVar.f24566r.get(i10) == null || (gzVar.f24566r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return czVar.d;
        }
    }
}
