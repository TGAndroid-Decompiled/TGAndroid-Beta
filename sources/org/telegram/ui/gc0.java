package org.telegram.ui;
public final class gc0 implements Runnable {
    public final int f37062a;
    public final bd0 f37063b;
    public final boolean f37064c;

    public gc0(bd0 bd0Var, boolean z4, int i10) {
        this.f37062a = i10;
        this.f37063b = bd0Var;
        this.f37064c = z4;
    }

    @Override
    public final void run() {
        switch (this.f37062a) {
            case 0:
                boolean z4 = this.f37064c;
                bd0 bd0Var = this.f37063b;
                if (!z4) {
                    bd0Var.f35470b.setVisibility(8);
                    return;
                } else {
                    bd0Var.getClass();
                    return;
                }
            default:
                this.f37063b.s0(this.f37064c);
                return;
        }
    }
}
