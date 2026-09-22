package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class zo implements wd1 {
    public final int f30908a;
    public final vi f30909b;
    public final org.telegram.ui.s3 f30910c;

    public zo(vi viVar, org.telegram.ui.s3 s3Var, int i10) {
        this.f30908a = i10;
        this.f30909b = viVar;
        this.f30910c = s3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30908a) {
            case 0:
                this.f30909b.dismissInternal();
                this.f30910c.run(tL_wallPaper);
                return;
            default:
                this.f30909b.dismissInternal();
                this.f30910c.run(tL_wallPaper);
                return;
        }
    }
}
