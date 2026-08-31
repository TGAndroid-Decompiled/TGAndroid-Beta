package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dd1;
public final class bp implements dd1 {
    public final int f25691a;
    public final cp f25692b;

    public bp(cp cpVar, int i10) {
        this.f25691a = i10;
        this.f25692b = cpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f25691a) {
            case 0:
                mp mpVar = this.f25692b.f26064a;
                mpVar.V.dismissInternal();
                mpVar.dismiss();
                return;
            default:
                mp mpVar2 = this.f25692b.f26064a;
                mpVar2.V.dismissInternal();
                mpVar2.dismiss();
                return;
        }
    }
}
