package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class bp implements vd1 {
    public final int f24777a;
    public final cp f24778b;

    public bp(cp cpVar, int i10) {
        this.f24777a = i10;
        this.f24778b = cpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f24777a) {
            case 0:
                lp lpVar = this.f24778b.f25072a;
                lpVar.Y.dismissInternal();
                lpVar.dismiss();
                return;
            default:
                lp lpVar2 = this.f24778b.f25072a;
                lpVar2.Y.dismissInternal();
                lpVar2.dismiss();
                return;
        }
    }
}
