package org.telegram.ui.Components;
public final class m00 implements Runnable {
    public final int f28330a;
    public final boolean f28331b;
    public final boolean f28332c;
    public final boolean d;
    public final Object f28333e;

    public m00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28330a = i10;
        this.f28333e = obj;
        this.f28331b = z10;
        this.f28332c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28330a) {
            case 0:
                o00 o00Var = (o00) this.f28333e;
                if (this.f28331b) {
                    s00 s00Var = o00Var.J;
                    s00Var.f30286a = true;
                    s00Var.f30289b = true;
                }
                if (this.f28332c) {
                    o00Var.f29014x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(o00Var.f29002a0 - currentTimeMillis) > 30) {
                    o00Var.f29002a0 = currentTimeMillis;
                    o00Var.f29007d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.xg0) this.f28333e).w1(this.f28331b, this.f28332c, this.d);
                return;
        }
    }
}
