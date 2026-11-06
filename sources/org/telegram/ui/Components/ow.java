package org.telegram.ui.Components;
public final class ow implements Runnable {
    public final int f36786a;
    public final float f36787b;
    public final int f36788c;
    public final Object d;

    public ow(Object obj, float f10, int i7, int i10) {
        this.f36786a = i10;
        this.d = obj;
        this.f36787b = f10;
        this.f36788c = i7;
    }

    @Override
    public final void run() {
        switch (this.f36786a) {
            case 0:
                float f10 = this.f36787b;
                int i7 = this.f36788c;
                gy gyVar = ((pw) this.d).F;
                try {
                    mi.m mVar = new mi.m(gyVar.P.getContext(), 0, f10);
                    mVar.f57096a = i7;
                    gyVar.Q.w0(mVar);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.q11 q11Var = (org.telegram.ui.q11) this.d;
                float f11 = this.f36787b;
                int i10 = this.f36788c;
                try {
                    mi.m mVar2 = new mi.m(q11Var.f49008h0.getContext(), 0, f11);
                    mVar2.f57096a = i10;
                    q11Var.f49027r0.w0(mVar2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
