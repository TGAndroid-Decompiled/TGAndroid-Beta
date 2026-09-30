package org.telegram.ui;
public final class dp0 implements Runnable {
    public final int f33157a;
    public final np0 f33158b;

    public dp0(np0 np0Var, int i10) {
        this.f33157a = i10;
        this.f33158b = np0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f33157a;
        np0 np0Var = this.f33158b;
        switch (i10) {
            case 0:
                if (np0Var.G) {
                    np0Var.f35932b.invalidate();
                    return;
                }
                return;
            case 1:
                np0Var.h();
                return;
            case 2:
                int i11 = np0.f35929q0;
                np0Var.h();
                return;
            default:
                int i12 = np0.f35929q0;
                np0Var.h();
                return;
        }
    }
}
