package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class zo implements wd1 {
    public final int f30887a;
    public final vi f30888b;
    public final org.telegram.ui.s3 f30889c;

    public zo(vi viVar, org.telegram.ui.s3 s3Var, int i10) {
        this.f30887a = i10;
        this.f30888b = viVar;
        this.f30889c = s3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30887a) {
            case 0:
                this.f30888b.dismissInternal();
                this.f30889c.run(tL_wallPaper);
                return;
            default:
                this.f30888b.dismissInternal();
                this.f30889c.run(tL_wallPaper);
                return;
        }
    }
}
