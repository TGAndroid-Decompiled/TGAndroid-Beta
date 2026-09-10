package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zd1;
public final class fp implements zd1 {
    public final int f23051a;
    public final yi f23052b;
    public final org.telegram.ui.u3 f23053c;

    public fp(yi yiVar, org.telegram.ui.u3 u3Var, int i10) {
        this.f23051a = i10;
        this.f23052b = yiVar;
        this.f23053c = u3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23051a) {
            case 0:
                this.f23052b.dismissInternal();
                this.f23053c.run(tL_wallPaper);
                return;
            default:
                this.f23052b.dismissInternal();
                this.f23053c.run(tL_wallPaper);
                return;
        }
    }
}
