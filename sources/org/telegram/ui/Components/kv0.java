package org.telegram.ui.Components;
public final class kv0 implements Runnable {
    public final int f35491a;
    public final zv0 f35492b;

    public kv0(zv0 zv0Var, int i7) {
        this.f35491a = i7;
        this.f35492b = zv0Var;
    }

    @Override
    public final void run() {
        switch (this.f35491a) {
            case 0:
                this.f35492b.f41155k1.f();
                return;
            case 1:
                this.f35492b.f41155k1.f();
                return;
            case 2:
                zv0 zv0Var = this.f35492b;
                zv0Var.dismiss();
                org.telegram.messenger.ui.b0(zv0Var.f28621a).f2(zv0Var.getContext(), zv0Var.J1, 1, zv0Var.C1, false, false);
                return;
            case 3:
                zv0 zv0Var2 = this.f35492b;
                org.telegram.messenger.qp.s1(zv0Var2.f28621a).y3("stickers", zv0Var2.C1, 1, null);
                return;
            default:
                zv0 zv0Var3 = this.f35492b;
                zv0Var3.dismiss();
                org.telegram.messenger.ui.b0(zv0Var3.f28621a).f2(zv0Var3.getContext(), zv0Var3.J1, 1, zv0Var3.C1, false, false);
                return;
        }
    }
}
