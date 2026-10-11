package org.telegram.ui.Components;
public final class k00 implements Runnable {
    public final int f27900a;
    public final boolean f27901b;
    public final boolean f27902c;
    public final boolean d;
    public final Object f27903e;

    public k00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27900a = i10;
        this.f27903e = obj;
        this.f27901b = z10;
        this.f27902c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f27900a) {
            case 0:
                m00 m00Var = (m00) this.f27903e;
                if (this.f27901b) {
                    q00 q00Var = m00Var.J;
                    q00Var.f30017a = true;
                    q00Var.f30020b = true;
                }
                if (this.f27902c) {
                    m00Var.f28654x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(m00Var.f28642a0 - currentTimeMillis) > 30) {
                    m00Var.f28642a0 = currentTimeMillis;
                    m00Var.f28647d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.vg0) this.f27903e).w1(this.f27901b, this.f27902c, this.d);
                return;
        }
    }
}
