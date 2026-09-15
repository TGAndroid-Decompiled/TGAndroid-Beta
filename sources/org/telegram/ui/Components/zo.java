package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ud1;
public final class zo implements ud1 {
    public final int f30627a;
    public final vi f30628b;
    public final org.telegram.ui.s3 f30629c;

    public zo(vi viVar, org.telegram.ui.s3 s3Var, int i10) {
        this.f30627a = i10;
        this.f30628b = viVar;
        this.f30629c = s3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30627a) {
            case 0:
                this.f30628b.dismissInternal();
                this.f30629c.run(tL_wallPaper);
                return;
            default:
                this.f30628b.dismissInternal();
                this.f30629c.run(tL_wallPaper);
                return;
        }
    }
}
