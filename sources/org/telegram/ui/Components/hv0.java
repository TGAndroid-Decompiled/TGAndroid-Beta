package org.telegram.ui.Components;
public final class hv0 implements Runnable {
    public final int f34519a;
    public final xv0 f34520b;

    public hv0(xv0 xv0Var, int i3) {
        this.f34519a = i3;
        this.f34520b = xv0Var;
    }

    @Override
    public final void run() {
        switch (this.f34519a) {
            case 0:
                this.f34520b.f40517l1.f();
                return;
            case 1:
                this.f34520b.f40517l1.f();
                return;
            case 2:
                xv0 xv0Var = this.f34520b;
                xv0Var.dismiss();
                org.telegram.messenger.li.b0(xv0Var.f28583a).f2(xv0Var.getContext(), xv0Var.K1, 1, xv0Var.D1, false, false);
                return;
            case 3:
                xv0 xv0Var2 = this.f34520b;
                org.telegram.messenger.hp.s1(xv0Var2.f28583a).y3("stickers", xv0Var2.D1, 1, null);
                return;
            default:
                xv0 xv0Var3 = this.f34520b;
                xv0Var3.dismiss();
                org.telegram.messenger.li.b0(xv0Var3.f28583a).f2(xv0Var3.getContext(), xv0Var3.K1, 1, xv0Var3.D1, false, false);
                return;
        }
    }
}
