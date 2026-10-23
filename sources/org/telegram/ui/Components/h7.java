package org.telegram.ui.Components;
public final class h7 implements Runnable {
    public final int f26810a;
    public final k8 f26811b;
    public final j80 f26812c;

    public h7(k8 k8Var, j80 j80Var, int i10) {
        this.f26810a = i10;
        this.f26811b = k8Var;
        this.f26812c = j80Var;
    }

    @Override
    public final void run() {
        switch (this.f26810a) {
            case 0:
                k8 k8Var = this.f26811b;
                k8Var.getClass();
                this.f26812c.u();
                k8Var.A0(1);
                return;
            case 1:
                k8 k8Var2 = this.f26811b;
                k8Var2.getClass();
                this.f26812c.u();
                k8Var2.A0(2);
                return;
            case 2:
                k8 k8Var3 = this.f26811b;
                k8Var3.getClass();
                this.f26812c.u();
                k8Var3.A0(4);
                return;
            case 3:
                k8 k8Var4 = this.f26811b;
                k8Var4.getClass();
                this.f26812c.u();
                k8Var4.A0(7);
                return;
            default:
                k8.n(this.f26811b, this.f26812c);
                return;
        }
    }
}
