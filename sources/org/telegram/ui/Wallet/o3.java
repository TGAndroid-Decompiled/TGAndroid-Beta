package org.telegram.ui.Wallet;
public final class o3 implements r1.d {
    public final int f42936a;
    public final Object f42937b;

    public o3(Object obj, int i7) {
        this.f42936a = i7;
        this.f42937b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f42936a) {
            case 0:
                u3 u3Var = (u3) this.f42937b;
                u3Var.G = f10;
                u3Var.c();
                return;
            case 1:
                n8 n8Var = (n8) this.f42937b;
                n8Var.f42901e = f10;
                n8Var.setScaleX(f10);
                n8Var.setScaleY(f10);
                return;
            case 2:
                l9 l9Var = (l9) this.f42937b;
                l9Var.f42733b0 = f10;
                l9Var.G0();
                return;
            default:
                ((k9) this.f42937b).d.setConversionWobble(f10);
                return;
        }
    }
}
