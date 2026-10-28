package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uc1;
public final class np implements uc1 {
    public final int f31018a;
    public final ti f31019b;
    public final org.telegram.ui.gc f31020c;

    public np(ti tiVar, org.telegram.ui.gc gcVar, int i10) {
        this.f31018a = i10;
        this.f31019b = tiVar;
        this.f31020c = gcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31018a) {
            case 0:
                this.f31019b.dismissInternal();
                this.f31020c.run(tL_wallPaper);
                return;
            default:
                this.f31019b.dismissInternal();
                this.f31020c.run(tL_wallPaper);
                return;
        }
    }
}
