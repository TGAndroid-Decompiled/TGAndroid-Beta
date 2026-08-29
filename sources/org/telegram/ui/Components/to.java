package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc1;
public final class to implements pc1 {
    public final int f33013a;
    public final ni f33014b;
    public final org.telegram.ui.x3 f33015c;

    public to(ni niVar, org.telegram.ui.x3 x3Var, int i10) {
        this.f33013a = i10;
        this.f33014b = niVar;
        this.f33015c = x3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f33013a) {
            case 0:
                this.f33014b.dismissInternal();
                this.f33015c.run(tL_wallPaper);
                return;
            default:
                this.f33014b.dismissInternal();
                this.f33015c.run(tL_wallPaper);
                return;
        }
    }
}
