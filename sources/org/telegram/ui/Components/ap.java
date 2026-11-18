package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ap implements org.telegram.ui.w71 {
    public final int f33412a;
    public final si f33413b;
    public final org.telegram.ui.vb f33414c;

    public ap(si siVar, org.telegram.ui.vb vbVar, int i7) {
        this.f33412a = i7;
        this.f33413b = siVar;
        this.f33414c = vbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f33412a) {
            case 0:
                this.f33413b.L();
                this.f33414c.a(tL_wallPaper);
                return;
            default:
                this.f33413b.L();
                this.f33414c.a(tL_wallPaper);
                return;
        }
    }
}
