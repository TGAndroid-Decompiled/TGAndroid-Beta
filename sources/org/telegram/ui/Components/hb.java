package org.telegram.ui.Components;
public final class hb extends r1.e {
    public final int f35861a;

    public hb(int i7) {
        this.f35861a = i7;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f35861a) {
            case 0:
                return ((lb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.oe0) obj).O;
            default:
                return ((org.telegram.ui.oe0) obj).N;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f35861a) {
            case 0:
                lb.access$2400((lb) obj, f10);
                return;
            case 1:
                org.telegram.ui.oe0 oe0Var = (org.telegram.ui.oe0) obj;
                oe0Var.O = f10;
                oe0Var.invalidate();
                return;
            default:
                org.telegram.ui.oe0 oe0Var2 = (org.telegram.ui.oe0) obj;
                oe0Var2.N = f10;
                oe0Var2.invalidate();
                return;
        }
    }
}
