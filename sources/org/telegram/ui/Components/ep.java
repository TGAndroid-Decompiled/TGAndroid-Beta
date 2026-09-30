package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class ep implements nd1 {
    public final int f24035a;
    public final fp f24036b;

    public ep(fp fpVar, int i10) {
        this.f24035a = i10;
        this.f24036b = fpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f24035a) {
            case 0:
                op opVar = this.f24036b.f24310a;
                opVar.Y.dismissInternal();
                opVar.dismiss();
                return;
            default:
                op opVar2 = this.f24036b.f24310a;
                opVar2.Y.dismissInternal();
                opVar2.dismiss();
                return;
        }
    }
}
