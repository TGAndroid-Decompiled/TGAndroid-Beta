package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cp implements org.telegram.ui.w71 {
    public final int f34265a;
    public final ui f34266b;
    public final org.telegram.ui.vb f34267c;

    public cp(ui uiVar, org.telegram.ui.vb vbVar, int i7) {
        this.f34265a = i7;
        this.f34266b = uiVar;
        this.f34267c = vbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f34265a) {
            case 0:
                this.f34266b.L();
                this.f34267c.a(tL_wallPaper);
                return;
            default:
                this.f34266b.L();
                this.f34267c.a(tL_wallPaper);
                return;
        }
    }
}
