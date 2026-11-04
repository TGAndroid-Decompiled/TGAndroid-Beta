package org.telegram.ui.Wallet;
public final class o3 implements q1.d {
    public final int f43003a;
    public final Object f43004b;

    public o3(Object obj, int i3) {
        this.f43003a = i3;
        this.f43004b = obj;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.f43003a) {
            case 0:
                u3 u3Var = (u3) this.f43004b;
                u3Var.H = f10;
                u3Var.c();
                return;
            case 1:
                o8 o8Var = (o8) this.f43004b;
                o8Var.f43017e = f10;
                o8Var.setScaleX(f10);
                o8Var.setScaleY(f10);
                return;
            case 2:
                m9 m9Var = (m9) this.f43004b;
                m9Var.f42871c0 = f10;
                m9Var.G0();
                return;
            default:
                ((l9) this.f43004b).d.setConversionWobble(f10);
                return;
        }
    }
}
