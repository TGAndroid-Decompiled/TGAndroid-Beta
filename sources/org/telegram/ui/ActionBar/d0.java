package org.telegram.ui.ActionBar;
public final class d0 implements Runnable {
    public final int f27384a;
    public final r0 f27385b;
    public final int f27386c;

    public d0(r0 r0Var, int i7, int i10) {
        this.f27384a = i10;
        this.f27385b = r0Var;
        this.f27386c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27384a) {
            case 0:
                r0 r0Var = this.f27385b;
                if (r0Var.f28430b.getSwipeBack() != null) {
                    r0Var.f28430b.getSwipeBack().e(this.f27386c);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.f27385b;
                if (r0Var2.f28430b.getSwipeBack() != null) {
                    r0Var2.f28430b.getSwipeBack().e(this.f27386c);
                    return;
                }
                return;
        }
    }
}
