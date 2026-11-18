package org.telegram.ui.Components;
public final class tv0 implements Runnable {
    public final int f40110a;
    public final iw0 f40111b;

    public tv0(iw0 iw0Var, int i7) {
        this.f40110a = i7;
        this.f40111b = iw0Var;
    }

    @Override
    public final void run() {
        switch (this.f40110a) {
            case 0:
                this.f40111b.f36247o1.f();
                return;
            case 1:
                this.f40111b.f36247o1.f();
                return;
            case 2:
                iw0 iw0Var = this.f40111b;
                iw0Var.dismiss();
                org.telegram.messenger.ri.d0(iw0Var.f30187a).k2(iw0Var.getContext(), iw0Var.N1, 1, iw0Var.G1, false, false);
                return;
            case 3:
                iw0 iw0Var2 = this.f40111b;
                org.telegram.messenger.mp.u1(iw0Var2.f30187a).F3("stickers", iw0Var2.G1, 1, null);
                return;
            default:
                iw0 iw0Var3 = this.f40111b;
                iw0Var3.dismiss();
                org.telegram.messenger.ri.d0(iw0Var3.f30187a).k2(iw0Var3.getContext(), iw0Var3.N1, 1, iw0Var3.G1, false, false);
                return;
        }
    }
}
