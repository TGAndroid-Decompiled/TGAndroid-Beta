package org.telegram.ui.ActionBar;
public final class e0 implements Runnable {
    public final int f28884a;
    public final r0 f28885b;
    public final int f28886c;

    public e0(r0 r0Var, int i7, int i10) {
        this.f28884a = i10;
        this.f28885b = r0Var;
        this.f28886c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28884a) {
            case 0:
                r0 r0Var = this.f28885b;
                if (r0Var.f29916b.getSwipeBack() != null) {
                    r0Var.f29916b.getSwipeBack().e(this.f28886c);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.f28885b;
                if (r0Var2.f29916b.getSwipeBack() != null) {
                    r0Var2.f29916b.getSwipeBack().e(this.f28886c);
                    return;
                }
                return;
        }
    }
}
