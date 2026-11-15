package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class to implements org.telegram.ui.s71 {
    public final int f39750a;
    public final ki f39751b;
    public final org.telegram.ui.vb f39752c;

    public to(ki kiVar, org.telegram.ui.vb vbVar, int i7) {
        this.f39750a = i7;
        this.f39751b = kiVar;
        this.f39752c = vbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f39750a) {
            case 0:
                this.f39751b.L();
                this.f39752c.a(tL_wallPaper);
                return;
            default:
                this.f39751b.L();
                this.f39752c.a(tL_wallPaper);
                return;
        }
    }
}
