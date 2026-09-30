package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f18866a;
    public final u0 f18867b;
    public final int f18868c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f18866a = i11;
        this.f18867b = u0Var;
        this.f18868c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18866a) {
            case 0:
                u0 u0Var = this.f18867b;
                if (u0Var.f19790b.getSwipeBack() != null) {
                    u0Var.f19790b.getSwipeBack().e(this.f18868c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f18867b;
                if (u0Var2.f19790b.getSwipeBack() != null) {
                    u0Var2.f19790b.getSwipeBack().e(this.f18868c);
                    return;
                }
                return;
        }
    }
}
