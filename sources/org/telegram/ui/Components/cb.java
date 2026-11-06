package org.telegram.ui.Components;
public final class cb extends r1.e {
    public final int f32503a;

    public cb(int i7) {
        this.f32503a = i7;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f32503a) {
            case 0:
                return ((gb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.le0) obj).N;
            default:
                return ((org.telegram.ui.le0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f32503a) {
            case 0:
                gb.access$2200((gb) obj, f10);
                return;
            case 1:
                org.telegram.ui.le0 le0Var = (org.telegram.ui.le0) obj;
                le0Var.N = f10;
                le0Var.invalidate();
                return;
            default:
                org.telegram.ui.le0 le0Var2 = (org.telegram.ui.le0) obj;
                le0Var2.M = f10;
                le0Var2.invalidate();
                return;
        }
    }
}
