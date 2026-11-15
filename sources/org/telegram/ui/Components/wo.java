package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wo implements org.telegram.ui.s71 {
    public final int f41413a;
    public final xo f41414b;

    public wo(xo xoVar, int i7) {
        this.f41413a = i7;
        this.f41414b = xoVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f41413a) {
            case 0:
                ep epVar = this.f41414b.f41735a;
                epVar.S1.L();
                epVar.dismiss();
                return;
            default:
                ep epVar2 = this.f41414b.f41735a;
                epVar2.S1.L();
                epVar2.dismiss();
                return;
        }
    }
}
