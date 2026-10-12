package org.telegram.ui.Components;
public final class m00 implements Runnable {
    public final int f28335a;
    public final boolean f28336b;
    public final boolean f28337c;
    public final boolean d;
    public final Object f28338e;

    public m00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28335a = i10;
        this.f28338e = obj;
        this.f28336b = z10;
        this.f28337c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28335a) {
            case 0:
                o00 o00Var = (o00) this.f28338e;
                if (this.f28336b) {
                    s00 s00Var = o00Var.J;
                    s00Var.f30290a = true;
                    s00Var.f30293b = true;
                }
                if (this.f28337c) {
                    o00Var.f29010x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(o00Var.f28998a0 - currentTimeMillis) > 30) {
                    o00Var.f28998a0 = currentTimeMillis;
                    o00Var.f29003d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.xg0) this.f28338e).w1(this.f28336b, this.f28337c, this.d);
                return;
        }
    }
}
