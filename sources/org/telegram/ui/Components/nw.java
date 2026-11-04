package org.telegram.ui.Components;
public final class nw implements Runnable {
    public final int f36628a;
    public final float f36629b;
    public final int f36630c;
    public final Object d;

    public nw(Object obj, float f10, int i3, int i10) {
        this.f36628a = i10;
        this.d = obj;
        this.f36629b = f10;
        this.f36630c = i3;
    }

    @Override
    public final void run() {
        switch (this.f36628a) {
            case 0:
                float f10 = this.f36629b;
                int i3 = this.f36630c;
                ey eyVar = ((ow) this.d).G;
                try {
                    ni.m mVar = new ni.m(eyVar.Q.getContext(), 0, f10);
                    mVar.f55704a = i3;
                    eyVar.R.w0(mVar);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.g11 g11Var = (org.telegram.ui.g11) this.d;
                float f11 = this.f36629b;
                int i10 = this.f36630c;
                try {
                    ni.m mVar2 = new ni.m(g11Var.f45456i0.getContext(), 0, f11);
                    mVar2.f55704a = i10;
                    g11Var.f45476s0.w0(mVar2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
