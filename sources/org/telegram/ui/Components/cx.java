package org.telegram.ui.Components;
public final class cx implements Runnable {
    public final int f34278a;
    public final float f34279b;
    public final int f34280c;
    public final Object d;

    public cx(Object obj, float f10, int i7, int i10) {
        this.f34278a = i10;
        this.d = obj;
        this.f34279b = f10;
        this.f34280c = i7;
    }

    @Override
    public final void run() {
        switch (this.f34278a) {
            case 0:
                float f10 = this.f34279b;
                int i7 = this.f34280c;
                ty tyVar = ((dx) this.d).G;
                try {
                    pi.l lVar = new pi.l(tyVar.Q.getContext(), 0, f10);
                    lVar.f59055a = i7;
                    tyVar.R.w0(lVar);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) this.d;
                float f11 = this.f34279b;
                int i10 = this.f34280c;
                try {
                    pi.l lVar2 = new pi.l(r11Var.f51422i0.getContext(), 0, f11);
                    lVar2.f59055a = i10;
                    r11Var.f51442s0.w0(lVar2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
