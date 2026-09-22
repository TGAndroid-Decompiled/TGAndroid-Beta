package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class zo implements vd1 {
    public final int f30624a;
    public final vi f30625b;
    public final org.telegram.ui.s3 f30626c;

    public zo(vi viVar, org.telegram.ui.s3 s3Var, int i10) {
        this.f30624a = i10;
        this.f30625b = viVar;
        this.f30626c = s3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30624a) {
            case 0:
                this.f30625b.dismissInternal();
                this.f30626c.run(tL_wallPaper);
                return;
            default:
                this.f30625b.dismissInternal();
                this.f30626c.run(tL_wallPaper);
                return;
        }
    }
}
