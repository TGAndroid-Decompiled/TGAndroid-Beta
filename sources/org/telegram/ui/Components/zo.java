package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zo implements org.telegram.ui.u71 {
    public final int f42967a;
    public final ti f42968b;
    public final org.telegram.ui.vb f42969c;

    public zo(ti tiVar, org.telegram.ui.vb vbVar, int i7) {
        this.f42967a = i7;
        this.f42968b = tiVar;
        this.f42969c = vbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f42967a) {
            case 0:
                this.f42968b.L();
                this.f42969c.a(tL_wallPaper);
                return;
            default:
                this.f42968b.L();
                this.f42969c.a(tL_wallPaper);
                return;
        }
    }
}
