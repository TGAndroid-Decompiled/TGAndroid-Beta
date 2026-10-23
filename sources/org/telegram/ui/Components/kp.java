package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc1;
public final class kp implements pc1 {
    public final int f28099a;
    public final ti f28100b;
    public final org.telegram.ui.fc f28101c;

    public kp(ti tiVar, org.telegram.ui.fc fcVar, int i10) {
        this.f28099a = i10;
        this.f28100b = tiVar;
        this.f28101c = fcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28099a) {
            case 0:
                this.f28100b.dismissInternal();
                this.f28101c.run(tL_wallPaper);
                return;
            default:
                this.f28100b.dismissInternal();
                this.f28101c.run(tL_wallPaper);
                return;
        }
    }
}
