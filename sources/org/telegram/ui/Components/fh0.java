package org.telegram.ui.Components;
public final class fh0 implements Runnable {
    public final int f24115a;
    public final ih0 f24116b;

    public fh0(ih0 ih0Var, int i10) {
        this.f24115a = i10;
        this.f24116b = ih0Var;
    }

    @Override
    public final void run() {
        switch (this.f24115a) {
            case 0:
                this.f24116b.a(true);
                return;
            default:
                this.f24116b.d();
                return;
        }
    }
}
