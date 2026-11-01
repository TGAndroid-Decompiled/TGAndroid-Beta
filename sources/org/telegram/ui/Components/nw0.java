package org.telegram.ui.Components;
public final class nw0 implements Runnable {
    public final int f28968a;
    public final dx0 f28969b;

    public nw0(dx0 dx0Var, int i10) {
        this.f28968a = i10;
        this.f28969b = dx0Var;
    }

    @Override
    public final void run() {
        switch (this.f28968a) {
            case 0:
                this.f28969b.f25621k1.f();
                return;
            case 1:
                this.f28969b.f25621k1.f();
                return;
            case 2:
                dx0 dx0Var = this.f28969b;
                dx0Var.dismiss();
                org.telegram.messenger.vi.b0(dx0Var.f21584a).f2(dx0Var.getContext(), dx0Var.J1, 1, dx0Var.C1, false, false);
                return;
            case 3:
                dx0 dx0Var2 = this.f28969b;
                org.telegram.messenger.wp.r1(dx0Var2.f21584a).v3("stickers", dx0Var2.C1, 1, null);
                return;
            default:
                dx0 dx0Var3 = this.f28969b;
                dx0Var3.dismiss();
                org.telegram.messenger.vi.b0(dx0Var3.f21584a).f2(dx0Var3.getContext(), dx0Var3.J1, 1, dx0Var3.C1, false, false);
                return;
        }
    }
}
