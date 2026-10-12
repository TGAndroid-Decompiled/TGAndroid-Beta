package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yd1;
public final class up implements yd1 {
    public final int f31233a;
    public final vp f31234b;

    public up(vp vpVar, int i10) {
        this.f31233a = i10;
        this.f31234b = vpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31233a) {
            case 0:
                eq eqVar = this.f31234b.f32138a;
                eqVar.Y.dismissInternal();
                eqVar.dismiss();
                return;
            default:
                eq eqVar2 = this.f31234b.f32138a;
                eqVar2.Y.dismissInternal();
                eqVar2.dismiss();
                return;
        }
    }
}
