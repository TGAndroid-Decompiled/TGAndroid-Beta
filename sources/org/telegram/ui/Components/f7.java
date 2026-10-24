package org.telegram.ui.Components;
public final class f7 implements Runnable {
    public final int f26214a;
    public final i8 f26215b;
    public final h80 f26216c;

    public f7(i8 i8Var, h80 h80Var, int i10) {
        this.f26214a = i10;
        this.f26215b = i8Var;
        this.f26216c = h80Var;
    }

    @Override
    public final void run() {
        switch (this.f26214a) {
            case 0:
                i8 i8Var = this.f26215b;
                i8Var.getClass();
                this.f26216c.u();
                i8Var.A0(1);
                return;
            case 1:
                i8 i8Var2 = this.f26215b;
                i8Var2.getClass();
                this.f26216c.u();
                i8Var2.A0(2);
                return;
            case 2:
                i8 i8Var3 = this.f26215b;
                i8Var3.getClass();
                this.f26216c.u();
                i8Var3.A0(4);
                return;
            case 3:
                i8 i8Var4 = this.f26215b;
                i8Var4.getClass();
                this.f26216c.u();
                i8Var4.A0(7);
                return;
            default:
                i8.n(this.f26215b, this.f26216c);
                return;
        }
    }
}
