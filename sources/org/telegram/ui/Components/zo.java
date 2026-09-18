package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ud1;
public final class zo implements ud1 {
    public final int f30850a;
    public final vi f30851b;
    public final org.telegram.ui.s3 f30852c;

    public zo(vi viVar, org.telegram.ui.s3 s3Var, int i10) {
        this.f30850a = i10;
        this.f30851b = viVar;
        this.f30852c = s3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30850a) {
            case 0:
                this.f30851b.dismissInternal();
                this.f30852c.run(tL_wallPaper);
                return;
            default:
                this.f30851b.dismissInternal();
                this.f30852c.run(tL_wallPaper);
                return;
        }
    }
}
