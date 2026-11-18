package org.telegram.ui.Components;
public final class ax implements Runnable {
    public final int f33478a;
    public final float f33479b;
    public final int f33480c;
    public final Object d;

    public ax(Object obj, float f10, int i7, int i10) {
        this.f33478a = i10;
        this.d = obj;
        this.f33479b = f10;
        this.f33480c = i7;
    }

    @Override
    public final void run() {
        switch (this.f33478a) {
            case 0:
                float f10 = this.f33479b;
                int i7 = this.f33480c;
                ry ryVar = ((bx) this.d).G;
                try {
                    pi.l lVar = new pi.l(ryVar.Q.getContext(), 0, f10);
                    lVar.f59066a = i7;
                    ryVar.R.w0(lVar);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) this.d;
                float f11 = this.f33479b;
                int i10 = this.f33480c;
                try {
                    pi.l lVar2 = new pi.l(r11Var.f51438i0.getContext(), 0, f11);
                    lVar2.f59066a = i10;
                    r11Var.f51458s0.w0(lVar2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
