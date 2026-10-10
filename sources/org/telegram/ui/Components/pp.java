package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class pp implements wd1 {
    public final int f29831a;
    public final yi f29832b;
    public final org.telegram.ui.fc f29833c;

    public pp(yi yiVar, org.telegram.ui.fc fcVar, int i10) {
        this.f29831a = i10;
        this.f29832b = yiVar;
        this.f29833c = fcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f29831a) {
            case 0:
                this.f29832b.dismissInternal();
                this.f29833c.run(tL_wallPaper);
                return;
            default:
                this.f29832b.dismissInternal();
                this.f29833c.run(tL_wallPaper);
                return;
        }
    }
}
