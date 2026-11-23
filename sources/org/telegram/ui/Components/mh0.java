package org.telegram.ui.Components;
public final class mh0 implements Runnable {
    public final int f37456a;
    public final nh0 f37457b;

    public mh0(nh0 nh0Var, int i7) {
        this.f37456a = i7;
        this.f37457b = nh0Var;
    }

    @Override
    public final void run() {
        switch (this.f37456a) {
            case 0:
                nh0 nh0Var = this.f37457b;
                nh0Var.getClass();
                try {
                    bg.i iVar = nh0Var.C0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.g3(nh0Var.A0);
                return;
            case 1:
                nh0 nh0Var2 = this.f37457b;
                nh0Var2.Q = null;
                nh0Var2.p();
                return;
            case 2:
                nh0.h(this.f37457b);
                return;
            case 3:
                nh0.e(this.f37457b);
                return;
            case 4:
                nh0.d(this.f37457b);
                return;
            case 5:
                nh0.f(this.f37457b);
                return;
            default:
                this.f37457b.m();
                return;
        }
    }
}
