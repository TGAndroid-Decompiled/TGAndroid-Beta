package org.telegram.ui.Components;
public final class zr0 implements Runnable {
    public final int f35437a;
    public final bw0 f35438b;
    public final int f35439c;

    public zr0(bw0 bw0Var, int i10, int i11) {
        this.f35437a = i11;
        this.f35438b = bw0Var;
        this.f35439c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35437a) {
            case 0:
                this.f35438b.m1(this.f35439c);
                return;
            case 1:
                bw0 bw0Var = this.f35438b;
                bw0Var.U0(bw0Var.f26992x1, bw0Var.l1, this.f35439c);
                return;
            case 2:
                this.f35438b.l1(this.f35439c, false);
                return;
            case 3:
                this.f35438b.m1(this.f35439c);
                return;
            default:
                bw0 bw0Var2 = this.f35438b;
                bw0Var2.V0(bw0Var2.f26992x1, bw0Var2.l1, this.f35439c);
                return;
        }
    }
}
