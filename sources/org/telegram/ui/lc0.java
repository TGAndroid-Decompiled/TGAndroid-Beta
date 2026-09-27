package org.telegram.ui;
public final class lc0 implements Runnable {
    public final int f35311a;
    public final fd0 f35312b;
    public final boolean f35313c;

    public lc0(fd0 fd0Var, boolean z10, int i10) {
        this.f35311a = i10;
        this.f35312b = fd0Var;
        this.f35313c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35311a) {
            case 0:
                boolean z10 = this.f35313c;
                fd0 fd0Var = this.f35312b;
                if (!z10) {
                    fd0Var.f33488b.setVisibility(8);
                    return;
                } else {
                    fd0Var.getClass();
                    return;
                }
            default:
                this.f35312b.s0(this.f35313c);
                return;
        }
    }
}
