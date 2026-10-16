package org.telegram.ui.Components;
public final class j7 implements Runnable {
    public final int f25902a;
    public final m8 f25903b;
    public final l80 f25904c;

    public j7(m8 m8Var, l80 l80Var, int i10) {
        this.f25902a = i10;
        this.f25903b = m8Var;
        this.f25904c = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f25902a) {
            case 0:
                m8 m8Var = this.f25903b;
                m8Var.getClass();
                this.f25904c.u();
                m8Var.u0(1);
                return;
            case 1:
                m8 m8Var2 = this.f25903b;
                m8Var2.getClass();
                this.f25904c.u();
                m8Var2.u0(2);
                return;
            case 2:
                m8 m8Var3 = this.f25903b;
                m8Var3.getClass();
                this.f25904c.u();
                m8Var3.u0(4);
                return;
            case 3:
                m8 m8Var4 = this.f25903b;
                m8Var4.getClass();
                this.f25904c.u();
                m8Var4.u0(7);
                return;
            default:
                m8.s(this.f25903b, this.f25904c);
                return;
        }
    }
}
