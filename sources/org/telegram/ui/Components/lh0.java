package org.telegram.ui.Components;
public final class lh0 implements Runnable {
    public final int f37127a;
    public final mh0 f37128b;

    public lh0(mh0 mh0Var, int i7) {
        this.f37127a = i7;
        this.f37128b = mh0Var;
    }

    @Override
    public final void run() {
        switch (this.f37127a) {
            case 0:
                mh0 mh0Var = this.f37128b;
                mh0Var.getClass();
                try {
                    bg.i iVar = mh0Var.C0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.g3(mh0Var.A0);
                return;
            case 1:
                mh0 mh0Var2 = this.f37128b;
                mh0Var2.Q = null;
                mh0Var2.p();
                return;
            case 2:
                mh0.h(this.f37128b);
                return;
            case 3:
                mh0.e(this.f37128b);
                return;
            case 4:
                mh0.d(this.f37128b);
                return;
            case 5:
                mh0.f(this.f37128b);
                return;
            default:
                this.f37128b.m();
                return;
        }
    }
}
