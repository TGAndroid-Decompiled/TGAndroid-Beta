package org.telegram.ui.Components;
public final class h7 implements Runnable {
    public final int f26783a;
    public final k8 f26784b;
    public final i80 f26785c;

    public h7(k8 k8Var, i80 i80Var, int i10) {
        this.f26783a = i10;
        this.f26784b = k8Var;
        this.f26785c = i80Var;
    }

    @Override
    public final void run() {
        switch (this.f26783a) {
            case 0:
                k8 k8Var = this.f26784b;
                k8Var.getClass();
                this.f26785c.u();
                k8Var.u0(1);
                return;
            case 1:
                k8 k8Var2 = this.f26784b;
                k8Var2.getClass();
                this.f26785c.u();
                k8Var2.u0(2);
                return;
            case 2:
                k8 k8Var3 = this.f26784b;
                k8Var3.getClass();
                this.f26785c.u();
                k8Var3.u0(4);
                return;
            case 3:
                k8 k8Var4 = this.f26784b;
                k8Var4.getClass();
                this.f26785c.u();
                k8Var4.u0(7);
                return;
            default:
                k8.r(this.f26784b, this.f26785c);
                return;
        }
    }
}
