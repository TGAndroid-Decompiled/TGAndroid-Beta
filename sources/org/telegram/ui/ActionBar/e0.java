package org.telegram.ui.ActionBar;
public final class e0 implements Runnable {
    public final int f28886a;
    public final r0 f28887b;
    public final int f28888c;

    public e0(r0 r0Var, int i7, int i10) {
        this.f28886a = i10;
        this.f28887b = r0Var;
        this.f28888c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28886a) {
            case 0:
                r0 r0Var = this.f28887b;
                if (r0Var.f29918b.getSwipeBack() != null) {
                    r0Var.f29918b.getSwipeBack().e(this.f28888c);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.f28887b;
                if (r0Var2.f29918b.getSwipeBack() != null) {
                    r0Var2.f29918b.getSwipeBack().e(this.f28888c);
                    return;
                }
                return;
        }
    }
}
