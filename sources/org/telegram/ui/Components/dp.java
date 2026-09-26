package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class dp implements nd1 {
    public final int f23706a;
    public final ep f23707b;

    public dp(ep epVar, int i10) {
        this.f23706a = i10;
        this.f23707b = epVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23706a) {
            case 0:
                np npVar = this.f23707b.f23981a;
                npVar.Y.dismissInternal();
                npVar.dismiss();
                return;
            default:
                np npVar2 = this.f23707b.f23981a;
                npVar2.Y.dismissInternal();
                npVar2.dismiss();
                return;
        }
    }
}
