package org.telegram.ui;
public final class f11 implements Runnable {
    public final int f34136a;
    public final j11 f34137b;
    public final int f34138c;

    public f11(j11 j11Var, int i10, int i11) {
        this.f34136a = i11;
        this.f34137b = j11Var;
        this.f34138c = i10;
    }

    @Override
    public final void run() {
        switch (this.f34136a) {
            case 0:
                j11 j11Var = this.f34137b;
                org.telegram.ui.Components.k81 k81Var = j11Var.f35201n;
                i11 i11Var = j11Var.f35203s;
                int i10 = this.f34138c;
                k81Var.d(i10, i11Var.i(i10));
                return;
            default:
                j11 j11Var2 = this.f34137b;
                org.telegram.ui.Components.k81 k81Var2 = j11Var2.f35201n;
                i11 i11Var2 = j11Var2.f35203s;
                int i11 = this.f34138c;
                k81Var2.d(i11, i11Var2.i(i11));
                return;
        }
    }
}
