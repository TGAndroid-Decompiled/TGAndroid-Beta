package org.telegram.ui;
public final class jc0 implements Runnable {
    public final int f34408a;
    public final dd0 f34409b;
    public final boolean f34410c;

    public jc0(dd0 dd0Var, boolean z10, int i10) {
        this.f34408a = i10;
        this.f34409b = dd0Var;
        this.f34410c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34408a) {
            case 0:
                boolean z10 = this.f34410c;
                dd0 dd0Var = this.f34409b;
                if (!z10) {
                    dd0Var.f32582b.setVisibility(8);
                    return;
                } else {
                    dd0Var.getClass();
                    return;
                }
            default:
                this.f34409b.s0(this.f34410c);
                return;
        }
    }
}
