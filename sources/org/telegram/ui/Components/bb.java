package org.telegram.ui.Components;
public final class bb extends r1.e {
    public final int f32194a;

    public bb(int i7) {
        this.f32194a = i7;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f32194a) {
            case 0:
                return ((fb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.oe0) obj).N;
            default:
                return ((org.telegram.ui.oe0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f32194a) {
            case 0:
                fb.access$2200((fb) obj, f10);
                return;
            case 1:
                org.telegram.ui.oe0 oe0Var = (org.telegram.ui.oe0) obj;
                oe0Var.N = f10;
                oe0Var.invalidate();
                return;
            default:
                org.telegram.ui.oe0 oe0Var2 = (org.telegram.ui.oe0) obj;
                oe0Var2.M = f10;
                oe0Var2.invalidate();
                return;
        }
    }
}
