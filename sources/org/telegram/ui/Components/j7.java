package org.telegram.ui.Components;
public final class j7 implements Runnable {
    public final int f29499a;
    public final m8 f29500b;
    public final k80 f29501c;

    public j7(m8 m8Var, k80 k80Var, int i10) {
        this.f29499a = i10;
        this.f29500b = m8Var;
        this.f29501c = k80Var;
    }

    @Override
    public final void run() {
        switch (this.f29499a) {
            case 0:
                m8 m8Var = this.f29500b;
                m8Var.getClass();
                this.f29501c.u();
                m8Var.A0(1);
                return;
            case 1:
                m8 m8Var2 = this.f29500b;
                m8Var2.getClass();
                this.f29501c.u();
                m8Var2.A0(2);
                return;
            case 2:
                m8 m8Var3 = this.f29500b;
                m8Var3.getClass();
                this.f29501c.u();
                m8Var3.A0(4);
                return;
            case 3:
                m8 m8Var4 = this.f29500b;
                m8Var4.getClass();
                this.f29501c.u();
                m8Var4.A0(7);
                return;
            default:
                m8.n(this.f29500b, this.f29501c);
                return;
        }
    }
}
