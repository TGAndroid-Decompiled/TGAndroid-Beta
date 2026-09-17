package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class bp implements vd1 {
    public final int f24778a;
    public final cp f24779b;

    public bp(cp cpVar, int i10) {
        this.f24778a = i10;
        this.f24779b = cpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f24778a) {
            case 0:
                lp lpVar = this.f24779b.f25073a;
                lpVar.Y.dismissInternal();
                lpVar.dismiss();
                return;
            default:
                lp lpVar2 = this.f24779b.f25073a;
                lpVar2.Y.dismissInternal();
                lpVar2.dismiss();
                return;
        }
    }
}
