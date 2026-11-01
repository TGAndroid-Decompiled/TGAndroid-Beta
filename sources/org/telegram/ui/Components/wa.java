package org.telegram.ui.Components;
public final class wa extends o1.h {
    public final int f32193a;

    public wa(int i10) {
        this.f32193a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f32193a) {
            case 0:
                return ((bb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.qf0) obj).N;
            default:
                return ((org.telegram.ui.qf0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f32193a) {
            case 0:
                bb.access$2200((bb) obj, f7);
                return;
            case 1:
                org.telegram.ui.qf0 qf0Var = (org.telegram.ui.qf0) obj;
                qf0Var.N = f7;
                qf0Var.invalidate();
                return;
            default:
                org.telegram.ui.qf0 qf0Var2 = (org.telegram.ui.qf0) obj;
                qf0Var2.M = f7;
                qf0Var2.invalidate();
                return;
        }
    }
}
