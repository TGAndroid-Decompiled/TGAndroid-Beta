package org.telegram.ui;
public final class hc0 implements Runnable {
    public final int f34638a;
    public final cd0 f34639b;
    public final boolean f34640c;

    public hc0(cd0 cd0Var, boolean z4, int i10) {
        this.f34638a = i10;
        this.f34639b = cd0Var;
        this.f34640c = z4;
    }

    @Override
    public final void run() {
        switch (this.f34638a) {
            case 0:
                boolean z4 = this.f34640c;
                cd0 cd0Var = this.f34639b;
                if (!z4) {
                    cd0Var.f33085b.setVisibility(8);
                    return;
                } else {
                    cd0Var.getClass();
                    return;
                }
            default:
                this.f34639b.s0(this.f34640c);
                return;
        }
    }
}
