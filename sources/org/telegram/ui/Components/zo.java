package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class zo implements wd1 {
    public final int f30571a;
    public final vi f30572b;
    public final org.telegram.ui.s3 f30573c;

    public zo(vi viVar, org.telegram.ui.s3 s3Var, int i10) {
        this.f30571a = i10;
        this.f30572b = viVar;
        this.f30573c = s3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30571a) {
            case 0:
                this.f30572b.dismissInternal();
                this.f30573c.run(tL_wallPaper);
                return;
            default:
                this.f30572b.dismissInternal();
                this.f30573c.run(tL_wallPaper);
                return;
        }
    }
}
