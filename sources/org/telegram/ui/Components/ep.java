package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;
public final class ep implements od1 {
    public final int f24098a;
    public final fp f24099b;

    public ep(fp fpVar, int i10) {
        this.f24098a = i10;
        this.f24099b = fpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f24098a) {
            case 0:
                op opVar = this.f24099b.f24368a;
                opVar.Y.dismissInternal();
                opVar.dismiss();
                return;
            default:
                op opVar2 = this.f24099b.f24368a;
                opVar2.Y.dismissInternal();
                opVar2.dismiss();
                return;
        }
    }
}
