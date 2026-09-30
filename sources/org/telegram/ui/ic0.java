package org.telegram.ui;
public final class ic0 implements Runnable {
    public final int f34490a;
    public final cd0 f34491b;
    public final boolean f34492c;

    public ic0(cd0 cd0Var, boolean z10, int i10) {
        this.f34490a = i10;
        this.f34491b = cd0Var;
        this.f34492c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34490a) {
            case 0:
                boolean z10 = this.f34492c;
                cd0 cd0Var = this.f34491b;
                if (!z10) {
                    cd0Var.f32659b.setVisibility(8);
                    return;
                } else {
                    cd0Var.getClass();
                    return;
                }
            default:
                this.f34491b.s0(this.f34492c);
                return;
        }
    }
}
