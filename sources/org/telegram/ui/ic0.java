package org.telegram.ui;
public final class ic0 implements Runnable {
    public final int f34582a;
    public final cd0 f34583b;
    public final boolean f34584c;

    public ic0(cd0 cd0Var, boolean z10, int i10) {
        this.f34582a = i10;
        this.f34583b = cd0Var;
        this.f34584c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34582a) {
            case 0:
                boolean z10 = this.f34584c;
                cd0 cd0Var = this.f34583b;
                if (!z10) {
                    cd0Var.f32745b.setVisibility(8);
                    return;
                } else {
                    cd0Var.getClass();
                    return;
                }
            default:
                this.f34583b.s0(this.f34584c);
                return;
        }
    }
}
