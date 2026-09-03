package org.telegram.ui.Components;
public final class ch0 implements Runnable {
    public final int f23946a;
    public final fh0 f23947b;

    public ch0(fh0 fh0Var, int i10) {
        this.f23946a = i10;
        this.f23947b = fh0Var;
    }

    @Override
    public final void run() {
        switch (this.f23946a) {
            case 0:
                this.f23947b.a(true);
                return;
            default:
                this.f23947b.d();
                return;
        }
    }
}
