package org.telegram.ui;
public final class gb0 implements Runnable {
    public final int f37501a;
    public final yb0 f37502b;
    public final boolean f37503c;

    public gb0(yb0 yb0Var, boolean z10, int i10) {
        this.f37501a = i10;
        this.f37502b = yb0Var;
        this.f37503c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37501a) {
            case 0:
                boolean z10 = this.f37503c;
                yb0 yb0Var = this.f37502b;
                if (!z10) {
                    yb0Var.f43782b.setVisibility(8);
                    return;
                } else {
                    yb0Var.getClass();
                    return;
                }
            default:
                if (!this.f37503c) {
                    this.f37502b.e.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
