package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class dp implements nd1 {
    public final int f23707a;
    public final ep f23708b;

    public dp(ep epVar, int i10) {
        this.f23707a = i10;
        this.f23708b = epVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23707a) {
            case 0:
                np npVar = this.f23708b.f23982a;
                npVar.Y.dismissInternal();
                npVar.dismiss();
                return;
            default:
                np npVar2 = this.f23708b.f23982a;
                npVar2.Y.dismissInternal();
                npVar2.dismiss();
                return;
        }
    }
}
