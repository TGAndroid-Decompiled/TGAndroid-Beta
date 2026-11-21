package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cp implements org.telegram.ui.w71 {
    public final int f34271a;
    public final ui f34272b;
    public final org.telegram.ui.vb f34273c;

    public cp(ui uiVar, org.telegram.ui.vb vbVar, int i7) {
        this.f34271a = i7;
        this.f34272b = uiVar;
        this.f34273c = vbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f34271a) {
            case 0:
                this.f34272b.L();
                this.f34273c.a(tL_wallPaper);
                return;
            default:
                this.f34272b.L();
                this.f34273c.a(tL_wallPaper);
                return;
        }
    }
}
