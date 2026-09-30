package org.telegram.ui.Components;
public final class rb extends o1.i {
    public final int f27937a;

    public rb(int i10) {
        this.f27937a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f27937a) {
            case 0:
                return ((vb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.ah0) obj).N;
            default:
                return ((org.telegram.ui.ah0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f27937a) {
            case 0:
                vb.access$2200((vb) obj, f7);
                return;
            case 1:
                org.telegram.ui.ah0 ah0Var = (org.telegram.ui.ah0) obj;
                ah0Var.N = f7;
                ah0Var.invalidate();
                return;
            default:
                org.telegram.ui.ah0 ah0Var2 = (org.telegram.ui.ah0) obj;
                ah0Var2.M = f7;
                ah0Var2.invalidate();
                return;
        }
    }
}
