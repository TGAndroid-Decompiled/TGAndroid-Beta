package org.telegram.ui.Components;
public final class tb extends o1.i {
    public final int f31086a;

    public tb(int i10) {
        this.f31086a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f31086a) {
            case 0:
                return ((xb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.hh0) obj).N;
            default:
                return ((org.telegram.ui.hh0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f31086a) {
            case 0:
                xb.access$2200((xb) obj, f7);
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
