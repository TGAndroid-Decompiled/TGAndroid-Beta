package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t71;
public final class no implements t71 {
    public final int f36347a;
    public final oo f36348b;

    public no(oo ooVar, int i7) {
        this.f36347a = i7;
        this.f36348b = ooVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f36347a) {
            case 0:
                vo voVar = this.f36348b.f36635a;
                voVar.O1.K();
                voVar.dismiss();
                return;
            default:
                vo voVar2 = this.f36348b.f36635a;
                voVar2.O1.K();
                voVar2.dismiss();
                return;
        }
    }
}
