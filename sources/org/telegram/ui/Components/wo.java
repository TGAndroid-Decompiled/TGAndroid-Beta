package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc1;
public final class wo implements pc1 {
    public final int f34469a;
    public final xo f34470b;

    public wo(xo xoVar, int i10) {
        this.f34469a = i10;
        this.f34470b = xoVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f34469a) {
            case 0:
                gp gpVar = this.f34470b.f34813a;
                gpVar.U.dismissInternal();
                gpVar.dismiss();
                return;
            default:
                gp gpVar2 = this.f34470b.f34813a;
                gpVar2.U.dismissInternal();
                gpVar2.dismiss();
                return;
        }
    }
}
