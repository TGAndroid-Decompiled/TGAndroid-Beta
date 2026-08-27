package org.telegram.ui.Components;

public final class a7 implements Runnable {

    public final int f26651a;

    public final b8 f26652b;

    public final b70 f26653c;

    public a7(b8 b8Var, b70 b70Var, int i10) {
        this.f26651a = i10;
        this.f26652b = b8Var;
        this.f26653c = b70Var;
    }

    @Override
    public final void run() {
        switch (this.f26651a) {
            case 0:
                b8 b8Var = this.f26652b;
                b8Var.getClass();
                this.f26653c.u();
                b8Var.t0(1);
                break;
            case 1:
                b8 b8Var2 = this.f26652b;
                b8Var2.getClass();
                this.f26653c.u();
                b8Var2.t0(2);
                break;
            case 2:
                b8 b8Var3 = this.f26652b;
                b8Var3.getClass();
                this.f26653c.u();
                b8Var3.t0(4);
                break;
            case 3:
                b8 b8Var4 = this.f26652b;
                b8Var4.getClass();
                this.f26653c.u();
                b8Var4.t0(7);
                break;
            default:
                b8.r(this.f26652b, this.f26653c);
                break;
        }
    }
}
