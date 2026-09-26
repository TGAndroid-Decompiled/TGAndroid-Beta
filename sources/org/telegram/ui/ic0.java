package org.telegram.ui;
public final class ic0 implements Runnable {
    public final int f34486a;
    public final cd0 f34487b;
    public final boolean f34488c;

    public ic0(cd0 cd0Var, boolean z10, int i10) {
        this.f34486a = i10;
        this.f34487b = cd0Var;
        this.f34488c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34486a) {
            case 0:
                boolean z10 = this.f34488c;
                cd0 cd0Var = this.f34487b;
                if (!z10) {
                    cd0Var.f32656b.setVisibility(8);
                    return;
                } else {
                    cd0Var.getClass();
                    return;
                }
            default:
                this.f34487b.s0(this.f34488c);
                return;
        }
    }
}
