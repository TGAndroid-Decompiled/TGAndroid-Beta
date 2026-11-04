package org.telegram.ui.Components;
public final class bb extends q1.e {
    public final int f32152a;

    public bb(int i3) {
        this.f32152a = i3;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f32152a) {
            case 0:
                return ((fb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.ge0) obj).O;
            default:
                return ((org.telegram.ui.ge0) obj).N;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f32152a) {
            case 0:
                fb.access$2200((fb) obj, f10);
                return;
            case 1:
                org.telegram.ui.ge0 ge0Var = (org.telegram.ui.ge0) obj;
                ge0Var.O = f10;
                ge0Var.invalidate();
                return;
            default:
                org.telegram.ui.ge0 ge0Var2 = (org.telegram.ui.ge0) obj;
                ge0Var2.N = f10;
                ge0Var2.invalidate();
                return;
        }
    }
}
