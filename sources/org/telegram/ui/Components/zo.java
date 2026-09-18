package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class zo implements wd1 {
    public final int f30574a;
    public final vi f30575b;
    public final org.telegram.ui.s3 f30576c;

    public zo(vi viVar, org.telegram.ui.s3 s3Var, int i10) {
        this.f30574a = i10;
        this.f30575b = viVar;
        this.f30576c = s3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30574a) {
            case 0:
                this.f30575b.dismissInternal();
                this.f30576c.run(tL_wallPaper);
                return;
            default:
                this.f30575b.dismissInternal();
                this.f30576c.run(tL_wallPaper);
                return;
        }
    }
}
