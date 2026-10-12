package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yd1;
public final class up implements yd1 {
    public final int f31241a;
    public final vp f31242b;

    public up(vp vpVar, int i10) {
        this.f31241a = i10;
        this.f31242b = vpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31241a) {
            case 0:
                eq eqVar = this.f31242b.f32153a;
                eqVar.Y.dismissInternal();
                eqVar.dismiss();
                return;
            default:
                eq eqVar2 = this.f31242b.f32153a;
                eqVar2.Y.dismissInternal();
                eqVar2.dismiss();
                return;
        }
    }
}
