package org.telegram.ui.Components;
public final class pw implements Runnable {
    public final int f37099a;
    public final float f37100b;
    public final int f37101c;
    public final Object d;

    public pw(Object obj, float f10, int i7, int i10) {
        this.f37099a = i10;
        this.d = obj;
        this.f37100b = f10;
        this.f37101c = i7;
    }

    @Override
    public final void run() {
        switch (this.f37099a) {
            case 0:
                float f10 = this.f37100b;
                int i7 = this.f37101c;
                hy hyVar = ((qw) this.d).F;
                try {
                    mi.m mVar = new mi.m(hyVar.P.getContext(), 0, f10);
                    mVar.f57225a = i7;
                    hyVar.Q.w0(mVar);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.s11 s11Var = (org.telegram.ui.s11) this.d;
                float f11 = this.f37100b;
                int i10 = this.f37101c;
                try {
                    mi.m mVar2 = new mi.m(s11Var.f49680h0.getContext(), 0, f11);
                    mVar2.f57225a = i10;
                    s11Var.f49699r0.w0(mVar2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
