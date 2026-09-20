package org.telegram.ui.Components;
public final class pb extends o1.i {
    public final int f27244a;

    public pb(int i10) {
        this.f27244a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f27244a) {
            case 0:
                return ((tb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.ih0) obj).N;
            default:
                return ((org.telegram.ui.ih0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f27244a) {
            case 0:
                tb.access$2200((tb) obj, f7);
                return;
            case 1:
                org.telegram.ui.ih0 ih0Var = (org.telegram.ui.ih0) obj;
                ih0Var.N = f7;
                ih0Var.invalidate();
                return;
            default:
                org.telegram.ui.ih0 ih0Var2 = (org.telegram.ui.ih0) obj;
                ih0Var2.M = f7;
                ih0Var2.invalidate();
                return;
        }
    }
}
