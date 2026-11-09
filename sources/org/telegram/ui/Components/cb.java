package org.telegram.ui.Components;
public final class cb extends r1.e {
    public final int f32618a;

    public cb(int i7) {
        this.f32618a = i7;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f32618a) {
            case 0:
                return ((gb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.ne0) obj).N;
            default:
                return ((org.telegram.ui.ne0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f32618a) {
            case 0:
                gb.access$2200((gb) obj, f10);
                return;
            case 1:
                org.telegram.ui.ne0 ne0Var = (org.telegram.ui.ne0) obj;
                ne0Var.N = f10;
                ne0Var.invalidate();
                return;
            default:
                org.telegram.ui.ne0 ne0Var2 = (org.telegram.ui.ne0) obj;
                ne0Var2.M = f10;
                ne0Var2.invalidate();
                return;
        }
    }
}
