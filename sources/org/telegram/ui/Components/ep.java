package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class ep implements nd1 {
    public final int f24037a;
    public final fp f24038b;

    public ep(fp fpVar, int i10) {
        this.f24037a = i10;
        this.f24038b = fpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f24037a) {
            case 0:
                op opVar = this.f24038b.f24330a;
                opVar.Y.dismissInternal();
                opVar.dismiss();
                return;
            default:
                op opVar2 = this.f24038b.f24330a;
                opVar2.Y.dismissInternal();
                opVar2.dismiss();
                return;
        }
    }
}
