package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc1;
public final class np implements pc1 {
    public final int f28993a;
    public final op f28994b;

    public np(op opVar, int i10) {
        this.f28993a = i10;
        this.f28994b = opVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28993a) {
            case 0:
                wp wpVar = this.f28994b.f29285a;
                wpVar.X.dismissInternal();
                wpVar.dismiss();
                return;
            default:
                wp wpVar2 = this.f28994b.f29285a;
                wpVar2.X.dismissInternal();
                wpVar2.dismiss();
                return;
        }
    }
}
