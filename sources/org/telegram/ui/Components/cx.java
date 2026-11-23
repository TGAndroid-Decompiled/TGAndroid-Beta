package org.telegram.ui.Components;
public final class cx implements Runnable {
    public final int f34315a;
    public final float f34316b;
    public final int f34317c;
    public final Object d;

    public cx(Object obj, float f10, int i7, int i10) {
        this.f34315a = i10;
        this.d = obj;
        this.f34316b = f10;
        this.f34317c = i7;
    }

    @Override
    public final void run() {
        switch (this.f34315a) {
            case 0:
                float f10 = this.f34316b;
                int i7 = this.f34317c;
                ty tyVar = ((dx) this.d).G;
                try {
                    pi.l lVar = new pi.l(tyVar.Q.getContext(), 0, f10);
                    lVar.f59109a = i7;
                    tyVar.R.w0(lVar);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.s11 s11Var = (org.telegram.ui.s11) this.d;
                float f11 = this.f34316b;
                int i10 = this.f34317c;
                try {
                    pi.l lVar2 = new pi.l(s11Var.f51844i0.getContext(), 0, f11);
                    lVar2.f59109a = i10;
                    s11Var.f51864s0.w0(lVar2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
