package org.telegram.ui.Components;
public final class bh0 implements Runnable {
    public final int f33279a;
    public final ch0 f33280b;

    public bh0(ch0 ch0Var, int i7) {
        this.f33279a = i7;
        this.f33280b = ch0Var;
    }

    @Override
    public final void run() {
        switch (this.f33279a) {
            case 0:
                ch0 ch0Var = this.f33280b;
                ch0Var.getClass();
                try {
                    bg.i iVar = ch0Var.C0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.h3(ch0Var.A0);
                return;
            case 1:
                ch0 ch0Var2 = this.f33280b;
                ch0Var2.Q = null;
                ch0Var2.p();
                return;
            case 2:
                ch0.h(this.f33280b);
                return;
            case 3:
                ch0.e(this.f33280b);
                return;
            case 4:
                ch0.d(this.f33280b);
                return;
            case 5:
                ch0.f(this.f33280b);
                return;
            default:
                this.f33280b.m();
                return;
        }
    }
}
