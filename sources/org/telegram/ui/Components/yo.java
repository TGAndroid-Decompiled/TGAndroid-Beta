package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class yo implements vd1 {
    public final int f33002a;
    public final vi f33003b;
    public final org.telegram.ui.t3 f33004c;

    public yo(vi viVar, org.telegram.ui.t3 t3Var, int i10) {
        this.f33002a = i10;
        this.f33003b = viVar;
        this.f33004c = t3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f33002a) {
            case 0:
                this.f33003b.dismissInternal();
                this.f33004c.run(tL_wallPaper);
                return;
            default:
                this.f33003b.dismissInternal();
                this.f33004c.run(tL_wallPaper);
                return;
        }
    }
}
