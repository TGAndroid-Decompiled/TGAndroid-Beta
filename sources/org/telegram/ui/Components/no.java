package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t71;
public final class no implements t71 {
    public final int f36453a;
    public final oo f36454b;

    public no(oo ooVar, int i7) {
        this.f36453a = i7;
        this.f36454b = ooVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f36453a) {
            case 0:
                vo voVar = this.f36454b.f36757a;
                voVar.O1.K();
                voVar.dismiss();
                return;
            default:
                vo voVar2 = this.f36454b.f36757a;
                voVar2.O1.K();
                voVar2.dismiss();
                return;
        }
    }
}
