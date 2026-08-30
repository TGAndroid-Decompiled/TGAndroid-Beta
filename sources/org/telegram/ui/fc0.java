package org.telegram.ui;
public final class fc0 implements Runnable {
    public final int f34214a;
    public final ad0 f34215b;
    public final boolean f34216c;

    public fc0(ad0 ad0Var, boolean z4, int i10) {
        this.f34214a = i10;
        this.f34215b = ad0Var;
        this.f34216c = z4;
    }

    @Override
    public final void run() {
        switch (this.f34214a) {
            case 0:
                boolean z4 = this.f34216c;
                ad0 ad0Var = this.f34215b;
                if (!z4) {
                    ad0Var.f32523b.setVisibility(8);
                    return;
                } else {
                    ad0Var.getClass();
                    return;
                }
            default:
                this.f34215b.s0(this.f34216c);
                return;
        }
    }
}
