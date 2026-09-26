package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class ep implements nd1 {
    public final int f24028a;
    public final fp f24029b;

    public ep(fp fpVar, int i10) {
        this.f24028a = i10;
        this.f24029b = fpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f24028a) {
            case 0:
                op opVar = this.f24029b.f24302a;
                opVar.Y.dismissInternal();
                opVar.dismiss();
                return;
            default:
                op opVar2 = this.f24029b.f24302a;
                opVar2.Y.dismissInternal();
                opVar2.dismiss();
                return;
        }
    }
}
