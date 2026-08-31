package org.telegram.ui;
public final class gc0 implements Runnable {
    public final int f37155a;
    public final bd0 f37156b;
    public final boolean f37157c;

    public gc0(bd0 bd0Var, boolean z4, int i10) {
        this.f37155a = i10;
        this.f37156b = bd0Var;
        this.f37157c = z4;
    }

    @Override
    public final void run() {
        switch (this.f37155a) {
            case 0:
                boolean z4 = this.f37157c;
                bd0 bd0Var = this.f37156b;
                if (!z4) {
                    bd0Var.f35454b.setVisibility(8);
                    return;
                } else {
                    bd0Var.getClass();
                    return;
                }
            default:
                this.f37156b.s0(this.f37157c);
                return;
        }
    }
}
