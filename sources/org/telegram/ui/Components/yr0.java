package org.telegram.ui.Components;
public final class yr0 implements Runnable {
    public final int f35127a;
    public final aw0 f35128b;
    public final int f35129c;

    public yr0(aw0 aw0Var, int i10, int i11) {
        this.f35127a = i11;
        this.f35128b = aw0Var;
        this.f35129c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35127a) {
            case 0:
                this.f35128b.m1(this.f35129c);
                return;
            case 1:
                aw0 aw0Var = this.f35128b;
                aw0Var.U0(aw0Var.f26702x1, aw0Var.l1, this.f35129c);
                return;
            case 2:
                this.f35128b.l1(this.f35129c, false);
                return;
            case 3:
                this.f35128b.m1(this.f35129c);
                return;
            default:
                aw0 aw0Var2 = this.f35128b;
                aw0Var2.V0(aw0Var2.f26702x1, aw0Var2.l1, this.f35129c);
                return;
        }
    }
}
