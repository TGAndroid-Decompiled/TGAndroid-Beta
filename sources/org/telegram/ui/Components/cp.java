package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class cp implements nd1 {
    public final int f23391a;
    public final xi f23392b;
    public final org.telegram.ui.ec f23393c;

    public cp(xi xiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f23391a = i10;
        this.f23392b = xiVar;
        this.f23393c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23391a) {
            case 0:
                this.f23392b.dismissInternal();
                this.f23393c.run(tL_wallPaper);
                return;
            default:
                this.f23392b.dismissInternal();
                this.f23393c.run(tL_wallPaper);
                return;
        }
    }
}
