package org.telegram.ui.Components;
public final class iv0 implements Runnable {
    public final int f34804a;
    public final yv0 f34805b;

    public iv0(yv0 yv0Var, int i7) {
        this.f34804a = i7;
        this.f34805b = yv0Var;
    }

    @Override
    public final void run() {
        switch (this.f34804a) {
            case 0:
                this.f34805b.f40732k1.f();
                return;
            case 1:
                this.f34805b.f40732k1.f();
                return;
            case 2:
                yv0 yv0Var = this.f34805b;
                yv0Var.dismiss();
                org.telegram.messenger.ui.b0(yv0Var.f28612a).f2(yv0Var.getContext(), yv0Var.J1, 1, yv0Var.C1, false, false);
                return;
            case 3:
                yv0 yv0Var2 = this.f34805b;
                org.telegram.messenger.qp.s1(yv0Var2.f28612a).y3("stickers", yv0Var2.C1, 1, null);
                return;
            default:
                yv0 yv0Var3 = this.f34805b;
                yv0Var3.dismiss();
                org.telegram.messenger.ui.b0(yv0Var3.f28612a).f2(yv0Var3.getContext(), yv0Var3.J1, 1, yv0Var3.C1, false, false);
                return;
        }
    }
}
