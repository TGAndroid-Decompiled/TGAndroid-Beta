package org.telegram.ui.Components;
public final class ow implements Runnable {
    public final int f36698a;
    public final float f36699b;
    public final int f36700c;
    public final Object d;

    public ow(Object obj, float f10, int i7, int i10) {
        this.f36698a = i10;
        this.d = obj;
        this.f36699b = f10;
        this.f36700c = i7;
    }

    @Override
    public final void run() {
        switch (this.f36698a) {
            case 0:
                float f10 = this.f36699b;
                int i7 = this.f36700c;
                gy gyVar = ((pw) this.d).F;
                try {
                    mi.m mVar = new mi.m(gyVar.P.getContext(), 0, f10);
                    mVar.f57221a = i7;
                    gyVar.Q.w0(mVar);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.t11 t11Var = (org.telegram.ui.t11) this.d;
                float f11 = this.f36699b;
                int i10 = this.f36700c;
                try {
                    mi.m mVar2 = new mi.m(t11Var.f50036h0.getContext(), 0, f11);
                    mVar2.f57221a = i10;
                    t11Var.f50055r0.w0(mVar2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
