package org.telegram.ui.Components;
public final class mw0 implements Runnable {
    public final int f28615a;
    public final cx0 f28616b;

    public mw0(cx0 cx0Var, int i10) {
        this.f28615a = i10;
        this.f28616b = cx0Var;
    }

    @Override
    public final void run() {
        switch (this.f28615a) {
            case 0:
                this.f28616b.f25208k1.f();
                return;
            case 1:
                this.f28616b.f25208k1.f();
                return;
            case 2:
                cx0 cx0Var = this.f28616b;
                cx0Var.dismiss();
                org.telegram.messenger.ui.b0(cx0Var.f21583a).f2(cx0Var.getContext(), cx0Var.J1, 1, cx0Var.C1, false, false);
                return;
            case 3:
                cx0 cx0Var2 = this.f28616b;
                org.telegram.messenger.vp.r1(cx0Var2.f21583a).v3("stickers", cx0Var2.C1, 1, null);
                return;
            default:
                cx0 cx0Var3 = this.f28616b;
                cx0Var3.dismiss();
                org.telegram.messenger.ui.b0(cx0Var3.f21583a).f2(cx0Var3.getContext(), cx0Var3.J1, 1, cx0Var3.C1, false, false);
                return;
        }
    }
}
