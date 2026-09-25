package org.telegram.ui;
public final class ic0 implements Runnable {
    public final int f34488a;
    public final cd0 f34489b;
    public final boolean f34490c;

    public ic0(cd0 cd0Var, boolean z10, int i10) {
        this.f34488a = i10;
        this.f34489b = cd0Var;
        this.f34490c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34488a) {
            case 0:
                boolean z10 = this.f34490c;
                cd0 cd0Var = this.f34489b;
                if (!z10) {
                    cd0Var.f32658b.setVisibility(8);
                    return;
                } else {
                    cd0Var.getClass();
                    return;
                }
            default:
                this.f34489b.s0(this.f34490c);
                return;
        }
    }
}
