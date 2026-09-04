package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class yo implements vd1 {
    public final int f32974a;
    public final vi f32975b;
    public final org.telegram.ui.t3 f32976c;

    public yo(vi viVar, org.telegram.ui.t3 t3Var, int i10) {
        this.f32974a = i10;
        this.f32975b = viVar;
        this.f32976c = t3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f32974a) {
            case 0:
                this.f32975b.dismissInternal();
                this.f32976c.run(tL_wallPaper);
                return;
            default:
                this.f32975b.dismissInternal();
                this.f32976c.run(tL_wallPaper);
                return;
        }
    }
}
