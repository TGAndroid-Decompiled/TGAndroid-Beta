package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ww extends g.p {
    public final lz f30197c;

    public ww(lz lzVar) {
        this.f30197c = lzVar;
    }

    @Override
    public final int i(int i10) {
        lz lzVar = this.f30197c;
        gz gzVar = lzVar.f26309z0;
        s4.h0 adapter = lzVar.D0.getAdapter();
        cz czVar = lzVar.f26306y0;
        if (adapter == czVar) {
            if (i10 == 0) {
                return czVar.d;
            }
            if (i10 == czVar.f23417s || (czVar.h.get(i10) != null && !(czVar.h.get(i10) instanceof TLRPC.Document))) {
                return czVar.d;
            }
            return 1;
        } else if (i10 != gzVar.f24575x && (gzVar.f24572r.get(i10) == null || (gzVar.f24572r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return czVar.d;
        }
    }
}
