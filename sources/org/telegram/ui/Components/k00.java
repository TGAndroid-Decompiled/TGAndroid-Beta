package org.telegram.ui.Components;
public final class k00 implements Runnable {
    public final int f27841a;
    public final boolean f27842b;
    public final boolean f27843c;
    public final boolean d;
    public final Object f27844e;

    public k00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27841a = i10;
        this.f27844e = obj;
        this.f27842b = z10;
        this.f27843c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f27841a) {
            case 0:
                m00 m00Var = (m00) this.f27844e;
                if (this.f27842b) {
                    q00 q00Var = m00Var.J;
                    q00Var.f29914a = true;
                    q00Var.f29917b = true;
                }
                if (this.f27843c) {
                    m00Var.f28578x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(m00Var.f28566a0 - currentTimeMillis) > 30) {
                    m00Var.f28566a0 = currentTimeMillis;
                    m00Var.f28571d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.wg0) this.f27844e).w1(this.f27842b, this.f27843c, this.d);
                return;
        }
    }
}
