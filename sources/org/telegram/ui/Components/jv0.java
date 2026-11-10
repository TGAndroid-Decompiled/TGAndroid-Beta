package org.telegram.ui.Components;
public final class jv0 implements Runnable {
    public final int f35082a;
    public final yv0 f35083b;

    public jv0(yv0 yv0Var, int i7) {
        this.f35082a = i7;
        this.f35083b = yv0Var;
    }

    @Override
    public final void run() {
        switch (this.f35082a) {
            case 0:
                this.f35083b.n1.f();
                return;
            case 1:
                this.f35083b.n1.f();
                return;
            case 2:
                yv0 yv0Var = this.f35083b;
                yv0Var.dismiss();
                org.telegram.messenger.ui.b0(yv0Var.f28669a).f2(yv0Var.getContext(), yv0Var.M1, 1, yv0Var.F1, false, false);
                return;
            case 3:
                yv0 yv0Var2 = this.f35083b;
                org.telegram.messenger.qp.s1(yv0Var2.f28669a).y3("stickers", yv0Var2.F1, 1, null);
                return;
            default:
                yv0 yv0Var3 = this.f35083b;
                yv0Var3.dismiss();
                org.telegram.messenger.ui.b0(yv0Var3.f28669a).f2(yv0Var3.getContext(), yv0Var3.M1, 1, yv0Var3.F1, false, false);
                return;
        }
    }
}
