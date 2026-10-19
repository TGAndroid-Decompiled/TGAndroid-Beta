package org.telegram.ui.Components;
public final class c00 implements Runnable {
    public final int f25052a;
    public final boolean f25053b;
    public final boolean f25054c;
    public final boolean d;
    public final Object e;

    public c00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f25052a = i10;
        this.e = obj;
        this.f25053b = z10;
        this.f25054c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f25052a) {
            case 0:
                e00 e00Var = (e00) this.e;
                if (this.f25053b) {
                    i00 i00Var = e00Var.J;
                    i00Var.f26968a = true;
                    i00Var.f26971b = true;
                }
                if (this.f25054c) {
                    e00Var.f25711x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(e00Var.f25700a0 - currentTimeMillis) > 30) {
                    e00Var.f25700a0 = currentTimeMillis;
                    e00Var.f25705d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.dg0) this.e).w1(this.f25053b, this.f25054c, this.d);
                return;
        }
    }
}
