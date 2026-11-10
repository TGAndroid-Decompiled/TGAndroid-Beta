package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.w71;
public final class mo implements w71 {
    public final int f36025a;
    public final no f36026b;

    public mo(no noVar, int i7) {
        this.f36025a = i7;
        this.f36026b = noVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f36025a) {
            case 0:
                vo voVar = this.f36026b.f36346a;
                voVar.R1.K();
                voVar.dismiss();
                return;
            default:
                vo voVar2 = this.f36026b.f36346a;
                voVar2.R1.K();
                voVar2.dismiss();
                return;
        }
    }
}
