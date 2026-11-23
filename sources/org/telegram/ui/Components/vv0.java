package org.telegram.ui.Components;
public final class vv0 implements Runnable {
    public final int f41563a;
    public final kw0 f41564b;

    public vv0(kw0 kw0Var, int i7) {
        this.f41563a = i7;
        this.f41564b = kw0Var;
    }

    @Override
    public final void run() {
        switch (this.f41563a) {
            case 0:
                this.f41564b.f37018o1.f();
                return;
            case 1:
                this.f41564b.f37018o1.f();
                return;
            case 2:
                kw0 kw0Var = this.f41564b;
                kw0Var.dismiss();
                org.telegram.messenger.si.d0(kw0Var.f30173a).k2(kw0Var.getContext(), kw0Var.N1, 1, kw0Var.G1, false, false);
                return;
            case 3:
                kw0 kw0Var2 = this.f41564b;
                org.telegram.messenger.np.u1(kw0Var2.f30173a).F3("stickers", kw0Var2.G1, 1, null);
                return;
            default:
                kw0 kw0Var3 = this.f41564b;
                kw0Var3.dismiss();
                org.telegram.messenger.si.d0(kw0Var3.f30173a).k2(kw0Var3.getContext(), kw0Var3.N1, 1, kw0Var3.G1, false, false);
                return;
        }
    }
}
