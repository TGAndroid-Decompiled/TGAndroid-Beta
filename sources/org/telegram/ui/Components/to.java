package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class to implements org.telegram.ui.s71 {
    public final int f39753a;
    public final ki f39754b;
    public final org.telegram.ui.vb f39755c;

    public to(ki kiVar, org.telegram.ui.vb vbVar, int i7) {
        this.f39753a = i7;
        this.f39754b = kiVar;
        this.f39755c = vbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f39753a) {
            case 0:
                this.f39754b.L();
                this.f39755c.a(tL_wallPaper);
                return;
            default:
                this.f39754b.L();
                this.f39755c.a(tL_wallPaper);
                return;
        }
    }
}
