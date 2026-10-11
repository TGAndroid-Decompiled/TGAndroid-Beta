package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class pp implements vd1 {
    public final int f29934a;
    public final yi f29935b;
    public final org.telegram.ui.ec f29936c;

    public pp(yi yiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f29934a = i10;
        this.f29935b = yiVar;
        this.f29936c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f29934a) {
            case 0:
                this.f29935b.dismissInternal();
                this.f29936c.run(tL_wallPaper);
                return;
            default:
                this.f29935b.dismissInternal();
                this.f29936c.run(tL_wallPaper);
                return;
        }
    }
}
