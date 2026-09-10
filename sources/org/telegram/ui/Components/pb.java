package org.telegram.ui.Components;
public final class pb extends o1.i {
    public final int f26073a;

    public pb(int i10) {
        this.f26073a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f26073a) {
            case 0:
                return ((tb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.hh0) obj).N;
            default:
                return ((org.telegram.ui.hh0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f26073a) {
            case 0:
                tb.access$2200((tb) obj, f7);
                return;
            case 1:
                org.telegram.ui.hh0 hh0Var = (org.telegram.ui.hh0) obj;
                hh0Var.N = f7;
                hh0Var.invalidate();
                return;
            default:
                org.telegram.ui.hh0 hh0Var2 = (org.telegram.ui.hh0) obj;
                hh0Var2.M = f7;
                hh0Var2.invalidate();
                return;
        }
    }
}
