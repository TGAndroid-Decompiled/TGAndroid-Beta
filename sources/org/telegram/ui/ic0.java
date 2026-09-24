package org.telegram.ui;
public final class ic0 implements Runnable {
    public final int f34474a;
    public final cd0 f34475b;
    public final boolean f34476c;

    public ic0(cd0 cd0Var, boolean z10, int i10) {
        this.f34474a = i10;
        this.f34475b = cd0Var;
        this.f34476c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34474a) {
            case 0:
                boolean z10 = this.f34476c;
                cd0 cd0Var = this.f34475b;
                if (!z10) {
                    cd0Var.f32643b.setVisibility(8);
                    return;
                } else {
                    cd0Var.getClass();
                    return;
                }
            default:
                this.f34475b.s0(this.f34476c);
                return;
        }
    }
}
