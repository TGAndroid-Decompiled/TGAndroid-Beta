package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.u71;
public final class no implements u71 {
    public final int f36402a;
    public final oo f36403b;

    public no(oo ooVar, int i7) {
        this.f36402a = i7;
        this.f36403b = ooVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f36402a) {
            case 0:
                vo voVar = this.f36403b.f36673a;
                voVar.O1.K();
                voVar.dismiss();
                return;
            default:
                vo voVar2 = this.f36403b.f36673a;
                voVar2.O1.K();
                voVar2.dismiss();
                return;
        }
    }
}
