package org.telegram.ui;
public final class dp0 implements Runnable {
    public final int f33168a;
    public final np0 f33169b;

    public dp0(np0 np0Var, int i10) {
        this.f33168a = i10;
        this.f33169b = np0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f33168a;
        np0 np0Var = this.f33169b;
        switch (i10) {
            case 0:
                if (np0Var.G) {
                    np0Var.f35938b.invalidate();
                    return;
                }
                return;
            case 1:
                np0Var.h();
                return;
            case 2:
                int i11 = np0.f35935q0;
                np0Var.h();
                return;
            default:
                int i12 = np0.f35935q0;
                np0Var.h();
                return;
        }
    }
}
