package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class pp implements wd1 {
    public final int f29898a;
    public final yi f29899b;
    public final org.telegram.ui.fc f29900c;

    public pp(yi yiVar, org.telegram.ui.fc fcVar, int i10) {
        this.f29898a = i10;
        this.f29899b = yiVar;
        this.f29900c = fcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f29898a) {
            case 0:
                this.f29899b.dismissInternal();
                this.f29900c.run(tL_wallPaper);
                return;
            default:
                this.f29899b.dismissInternal();
                this.f29900c.run(tL_wallPaper);
                return;
        }
    }
}
