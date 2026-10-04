package org.telegram.ui.Components;
public final class rb extends o1.i {
    public final int f30329a;

    public rb(int i10) {
        this.f30329a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f30329a) {
            case 0:
                return ((vb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.eh0) obj).N;
            default:
                return ((org.telegram.ui.eh0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f30329a) {
            case 0:
                vb.access$2200((vb) obj, f7);
                return;
            case 1:
                org.telegram.ui.eh0 eh0Var = (org.telegram.ui.eh0) obj;
                eh0Var.N = f7;
                eh0Var.invalidate();
                return;
            default:
                org.telegram.ui.eh0 eh0Var2 = (org.telegram.ui.eh0) obj;
                eh0Var2.M = f7;
                eh0Var2.invalidate();
                return;
        }
    }
}
