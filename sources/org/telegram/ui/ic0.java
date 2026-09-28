package org.telegram.ui;
public final class ic0 implements Runnable {
    public final int f34487a;
    public final cd0 f34488b;
    public final boolean f34489c;

    public ic0(cd0 cd0Var, boolean z10, int i10) {
        this.f34487a = i10;
        this.f34488b = cd0Var;
        this.f34489c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34487a) {
            case 0:
                boolean z10 = this.f34489c;
                cd0 cd0Var = this.f34488b;
                if (!z10) {
                    cd0Var.f32657b.setVisibility(8);
                    return;
                } else {
                    cd0Var.getClass();
                    return;
                }
            default:
                this.f34488b.s0(this.f34489c);
                return;
        }
    }
}
