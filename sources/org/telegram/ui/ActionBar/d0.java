package org.telegram.ui.ActionBar;
public final class d0 implements Runnable {
    public final int f27420a;
    public final r0 f27421b;
    public final int f27422c;

    public d0(r0 r0Var, int i7, int i10) {
        this.f27420a = i10;
        this.f27421b = r0Var;
        this.f27422c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27420a) {
            case 0:
                r0 r0Var = this.f27421b;
                if (r0Var.f28424b.getSwipeBack() != null) {
                    r0Var.f28424b.getSwipeBack().e(this.f27422c);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.f27421b;
                if (r0Var2.f28424b.getSwipeBack() != null) {
                    r0Var2.f28424b.getSwipeBack().e(this.f27422c);
                    return;
                }
                return;
        }
    }
}
