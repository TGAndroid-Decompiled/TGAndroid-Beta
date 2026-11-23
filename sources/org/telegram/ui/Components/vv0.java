package org.telegram.ui.Components;
public final class vv0 implements Runnable {
    public final int f41537a;
    public final kw0 f41538b;

    public vv0(kw0 kw0Var, int i7) {
        this.f41537a = i7;
        this.f41538b = kw0Var;
    }

    @Override
    public final void run() {
        switch (this.f41537a) {
            case 0:
                this.f41538b.f36975o1.f();
                return;
            case 1:
                this.f41538b.f36975o1.f();
                return;
            case 2:
                kw0 kw0Var = this.f41538b;
                kw0Var.dismiss();
                org.telegram.messenger.si.d0(kw0Var.f30139a).k2(kw0Var.getContext(), kw0Var.N1, 1, kw0Var.G1, false, false);
                return;
            case 3:
                kw0 kw0Var2 = this.f41538b;
                org.telegram.messenger.np.u1(kw0Var2.f30139a).F3("stickers", kw0Var2.G1, 1, null);
                return;
            default:
                kw0 kw0Var3 = this.f41538b;
                kw0Var3.dismiss();
                org.telegram.messenger.si.d0(kw0Var3.f30139a).k2(kw0Var3.getContext(), kw0Var3.N1, 1, kw0Var3.G1, false, false);
                return;
        }
    }
}
