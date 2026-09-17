package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class yo implements vd1 {
    public final int f32975a;
    public final vi f32976b;
    public final org.telegram.ui.t3 f32977c;

    public yo(vi viVar, org.telegram.ui.t3 t3Var, int i10) {
        this.f32975a = i10;
        this.f32976b = viVar;
        this.f32977c = t3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f32975a) {
            case 0:
                this.f32976b.dismissInternal();
                this.f32977c.run(tL_wallPaper);
                return;
            default:
                this.f32976b.dismissInternal();
                this.f32977c.run(tL_wallPaper);
                return;
        }
    }
}
