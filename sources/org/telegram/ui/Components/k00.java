package org.telegram.ui.Components;
public final class k00 implements Runnable {
    public final int f27793a;
    public final boolean f27794b;
    public final boolean f27795c;
    public final boolean d;
    public final Object f27796e;

    public k00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27793a = i10;
        this.f27796e = obj;
        this.f27794b = z10;
        this.f27795c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f27793a) {
            case 0:
                m00 m00Var = (m00) this.f27796e;
                if (this.f27794b) {
                    q00 q00Var = m00Var.J;
                    q00Var.f29888a = true;
                    q00Var.f29891b = true;
                }
                if (this.f27795c) {
                    m00Var.f28498x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(m00Var.f28486a0 - currentTimeMillis) > 30) {
                    m00Var.f28486a0 = currentTimeMillis;
                    m00Var.f28491d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.vg0) this.f27796e).w1(this.f27794b, this.f27795c, this.d);
                return;
        }
    }
}
