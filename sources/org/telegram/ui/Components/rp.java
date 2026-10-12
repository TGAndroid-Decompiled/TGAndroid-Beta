package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yd1;
public final class rp implements yd1 {
    public final int f30198a;
    public final aj f30199b;
    public final org.telegram.ui.ic f30200c;

    public rp(aj ajVar, org.telegram.ui.ic icVar, int i10) {
        this.f30198a = i10;
        this.f30199b = ajVar;
        this.f30200c = icVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30198a) {
            case 0:
                this.f30199b.dismissInternal();
                this.f30200c.run(tL_wallPaper);
                return;
            default:
                this.f30199b.dismissInternal();
                this.f30200c.run(tL_wallPaper);
                return;
        }
    }
}
