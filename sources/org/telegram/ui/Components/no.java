package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mc1;

public final class no implements mc1 {

    public final int f31003a;

    public final gi f31004b;

    public final org.telegram.ui.x3 f31005c;

    public no(gi giVar, org.telegram.ui.x3 x3Var, int i10) {
        this.f31003a = i10;
        this.f31004b = giVar;
        this.f31005c = x3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31003a) {
            case 0:
                this.f31004b.dismissInternal();
                this.f31005c.run(tL_wallPaper);
                break;
            default:
                this.f31004b.dismissInternal();
                this.f31005c.run(tL_wallPaper);
                break;
        }
    }
}
