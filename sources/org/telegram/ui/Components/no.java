package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t71;
public final class no implements t71 {
    public final int f36386a;
    public final oo f36387b;

    public no(oo ooVar, int i7) {
        this.f36386a = i7;
        this.f36387b = ooVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f36386a) {
            case 0:
                vo voVar = this.f36387b.f36653a;
                voVar.O1.K();
                voVar.dismiss();
                return;
            default:
                vo voVar2 = this.f36387b.f36653a;
                voVar2.O1.K();
                voVar2.dismiss();
                return;
        }
    }
}
