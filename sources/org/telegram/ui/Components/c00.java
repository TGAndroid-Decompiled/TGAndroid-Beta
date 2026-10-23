package org.telegram.ui.Components;
public final class c00 implements Runnable {
    public final int f25187a;
    public final boolean f25188b;
    public final boolean f25189c;
    public final boolean d;
    public final Object e;

    public c00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f25187a = i10;
        this.e = obj;
        this.f25188b = z10;
        this.f25189c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f25187a) {
            case 0:
                e00 e00Var = (e00) this.e;
                if (this.f25188b) {
                    i00 i00Var = e00Var.J;
                    i00Var.f27083a = true;
                    i00Var.f27086b = true;
                }
                if (this.f25189c) {
                    e00Var.f25801x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(e00Var.f25790a0 - currentTimeMillis) > 30) {
                    e00Var.f25790a0 = currentTimeMillis;
                    e00Var.f25795d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ig0) this.e).A1(this.f25188b, this.f25189c, this.d);
                return;
        }
    }
}
