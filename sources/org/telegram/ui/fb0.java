package org.telegram.ui;
public final class fb0 implements Runnable {
    public final int f37094a;
    public final xb0 f37095b;
    public final boolean f37096c;

    public fb0(xb0 xb0Var, boolean z10, int i10) {
        this.f37094a = i10;
        this.f37095b = xb0Var;
        this.f37096c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37094a) {
            case 0:
                boolean z10 = this.f37096c;
                xb0 xb0Var = this.f37095b;
                if (!z10) {
                    xb0Var.f43302b.setVisibility(8);
                    return;
                } else {
                    xb0Var.getClass();
                    return;
                }
            default:
                if (!this.f37096c) {
                    this.f37095b.e.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
