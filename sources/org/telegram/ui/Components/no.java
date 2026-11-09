package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.v71;
public final class no implements v71 {
    public final int f36428a;
    public final oo f36429b;

    public no(oo ooVar, int i7) {
        this.f36428a = i7;
        this.f36429b = ooVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f36428a) {
            case 0:
                vo voVar = this.f36429b.f36756a;
                voVar.O1.K();
                voVar.dismiss();
                return;
            default:
                vo voVar2 = this.f36429b.f36756a;
                voVar2.O1.K();
                voVar2.dismiss();
                return;
        }
    }
}
