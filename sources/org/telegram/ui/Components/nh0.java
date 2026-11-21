package org.telegram.ui.Components;
public final class nh0 implements Runnable {
    public final int f37875a;
    public final oh0 f37876b;

    public nh0(oh0 oh0Var, int i7) {
        this.f37875a = i7;
        this.f37876b = oh0Var;
    }

    @Override
    public final void run() {
        switch (this.f37875a) {
            case 0:
                oh0 oh0Var = this.f37876b;
                oh0Var.getClass();
                try {
                    bg.i iVar = oh0Var.C0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.g3(oh0Var.A0);
                return;
            case 1:
                oh0 oh0Var2 = this.f37876b;
                oh0Var2.Q = null;
                oh0Var2.p();
                return;
            case 2:
                oh0.h(this.f37876b);
                return;
            case 3:
                oh0.e(this.f37876b);
                return;
            case 4:
                oh0.d(this.f37876b);
                return;
            case 5:
                oh0.f(this.f37876b);
                return;
            default:
                this.f37876b.m();
                return;
        }
    }
}
