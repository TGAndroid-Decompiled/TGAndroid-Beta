package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vw extends g.p {
    public final lz f29406c;

    public vw(lz lzVar) {
        this.f29406c = lzVar;
    }

    @Override
    public final int i(int i10) {
        lz lzVar = this.f29406c;
        gz gzVar = lzVar.f26041z0;
        s4.h0 adapter = lzVar.D0.getAdapter();
        cz czVar = lzVar.f26038y0;
        if (adapter == czVar) {
            if (i10 == 0) {
                return czVar.d;
            }
            if (i10 == czVar.f23151s || (czVar.h.get(i10) != null && !(czVar.h.get(i10) instanceof TLRPC.Document))) {
                return czVar.d;
            }
            return 1;
        } else if (i10 != gzVar.f24458x && (gzVar.f24455r.get(i10) == null || (gzVar.f24455r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return czVar.d;
        }
    }
}
