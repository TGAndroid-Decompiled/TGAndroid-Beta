package org.telegram.ui.Components;
public final class uw implements Runnable {
    public final int f40172a;
    public final float f40173b;
    public final int f40174c;
    public final Object d;

    public uw(Object obj, float f10, int i7, int i10) {
        this.f40172a = i10;
        this.d = obj;
        this.f40173b = f10;
        this.f40174c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40172a) {
            case 0:
                float f10 = this.f40173b;
                int i7 = this.f40174c;
                ly lyVar = ((vw) this.d).G;
                try {
                    pi.l lVar = new pi.l(lyVar.Q.getContext(), 0, f10);
                    lVar.f58480a = i7;
                    lyVar.R.w0(lVar);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.n11 n11Var = (org.telegram.ui.n11) this.d;
                float f11 = this.f40173b;
                int i10 = this.f40174c;
                try {
                    pi.l lVar2 = new pi.l(n11Var.f49385i0.getContext(), 0, f11);
                    lVar2.f58480a = i10;
                    n11Var.f49405s0.w0(lVar2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
