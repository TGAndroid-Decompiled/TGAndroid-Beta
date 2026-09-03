package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;
public final class bp implements id1 {
    public final int f25672a;
    public final cp f25673b;

    public bp(cp cpVar, int i10) {
        this.f25672a = i10;
        this.f25673b = cpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f25672a) {
            case 0:
                mp mpVar = this.f25673b.f26019a;
                mpVar.V.dismissInternal();
                mpVar.dismiss();
                return;
            default:
                mp mpVar2 = this.f25673b.f26019a;
                mpVar2.V.dismissInternal();
                mpVar2.dismiss();
                return;
        }
    }
}
