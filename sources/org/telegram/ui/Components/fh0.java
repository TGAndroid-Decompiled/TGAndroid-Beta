package org.telegram.ui.Components;
public final class fh0 implements Runnable {
    public final int f23008a;
    public final ih0 f23009b;

    public fh0(ih0 ih0Var, int i10) {
        this.f23008a = i10;
        this.f23009b = ih0Var;
    }

    @Override
    public final void run() {
        switch (this.f23008a) {
            case 0:
                this.f23009b.a(true);
                return;
            default:
                this.f23009b.d();
                return;
        }
    }
}
