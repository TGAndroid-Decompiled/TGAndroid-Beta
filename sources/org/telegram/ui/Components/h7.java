package org.telegram.ui.Components;
public final class h7 implements Runnable {
    public final int f26648a;
    public final k8 f26649b;
    public final n70 f26650c;

    public h7(k8 k8Var, n70 n70Var, int i10) {
        this.f26648a = i10;
        this.f26649b = k8Var;
        this.f26650c = n70Var;
    }

    @Override
    public final void run() {
        switch (this.f26648a) {
            case 0:
                k8 k8Var = this.f26649b;
                k8Var.getClass();
                this.f26650c.u();
                k8Var.t0(1);
                return;
            case 1:
                k8 k8Var2 = this.f26649b;
                k8Var2.getClass();
                this.f26650c.u();
                k8Var2.t0(2);
                return;
            case 2:
                k8 k8Var3 = this.f26649b;
                k8Var3.getClass();
                this.f26650c.u();
                k8Var3.t0(4);
                return;
            case 3:
                k8 k8Var4 = this.f26649b;
                k8Var4.getClass();
                this.f26650c.u();
                k8Var4.t0(7);
                return;
            default:
                k8.q(this.f26649b, this.f26650c);
                return;
        }
    }
}
