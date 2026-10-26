package org.telegram.ui.Components;
public final class yr0 implements Runnable {
    public final int f35130a;
    public final aw0 f35131b;
    public final int f35132c;

    public yr0(aw0 aw0Var, int i10, int i11) {
        this.f35130a = i11;
        this.f35131b = aw0Var;
        this.f35132c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35130a) {
            case 0:
                this.f35131b.m1(this.f35132c);
                return;
            case 1:
                aw0 aw0Var = this.f35131b;
                aw0Var.U0(aw0Var.f26704x1, aw0Var.l1, this.f35132c);
                return;
            case 2:
                this.f35131b.l1(this.f35132c, false);
                return;
            case 3:
                this.f35131b.m1(this.f35132c);
                return;
            default:
                aw0 aw0Var2 = this.f35131b;
                aw0Var2.V0(aw0Var2.f26704x1, aw0Var2.l1, this.f35132c);
                return;
        }
    }
}
