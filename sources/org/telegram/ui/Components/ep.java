package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class ep implements nd1 {
    public final int f24038a;
    public final fp f24039b;

    public ep(fp fpVar, int i10) {
        this.f24038a = i10;
        this.f24039b = fpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f24038a) {
            case 0:
                op opVar = this.f24039b.f24331a;
                opVar.Y.dismissInternal();
                opVar.dismiss();
                return;
            default:
                op opVar2 = this.f24039b.f24331a;
                opVar2.Y.dismissInternal();
                opVar2.dismiss();
                return;
        }
    }
}
