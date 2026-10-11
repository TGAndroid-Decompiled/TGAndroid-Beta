package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class pp implements vd1 {
    public final int f29791a;
    public final yi f29792b;
    public final org.telegram.ui.ec f29793c;

    public pp(yi yiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f29791a = i10;
        this.f29792b = yiVar;
        this.f29793c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f29791a) {
            case 0:
                this.f29792b.dismissInternal();
                this.f29793c.run(tL_wallPaper);
                return;
            default:
                this.f29792b.dismissInternal();
                this.f29793c.run(tL_wallPaper);
                return;
        }
    }
}
