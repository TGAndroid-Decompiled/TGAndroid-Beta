package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cp implements org.telegram.ui.w71 {
    public final int f34233a;
    public final ui f34234b;
    public final org.telegram.ui.vb f34235c;

    public cp(ui uiVar, org.telegram.ui.vb vbVar, int i7) {
        this.f34233a = i7;
        this.f34234b = uiVar;
        this.f34235c = vbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f34233a) {
            case 0:
                this.f34234b.L();
                this.f34235c.a(tL_wallPaper);
                return;
            default:
                this.f34234b.L();
                this.f34235c.a(tL_wallPaper);
                return;
        }
    }
}
