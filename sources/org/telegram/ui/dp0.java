package org.telegram.ui;
public final class dp0 implements Runnable {
    public final int f33141a;
    public final np0 f33142b;

    public dp0(np0 np0Var, int i10) {
        this.f33141a = i10;
        this.f33142b = np0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f33141a;
        np0 np0Var = this.f33142b;
        switch (i10) {
            case 0:
                if (np0Var.G) {
                    np0Var.f35915b.invalidate();
                    return;
                }
                return;
            case 1:
                np0Var.h();
                return;
            case 2:
                int i11 = np0.f35912q0;
                np0Var.h();
                return;
            default:
                int i12 = np0.f35912q0;
                np0Var.h();
                return;
        }
    }
}
