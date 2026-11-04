package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.k71;
public final class no implements k71 {
    public final int f36594a;
    public final oo f36595b;

    public no(oo ooVar, int i3) {
        this.f36594a = i3;
        this.f36595b = ooVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f36594a) {
            case 0:
                vo voVar = this.f36595b.f36874a;
                voVar.P1.K();
                voVar.dismiss();
                return;
            default:
                vo voVar2 = this.f36595b.f36874a;
                voVar2.P1.K();
                voVar2.dismiss();
                return;
        }
    }
}
