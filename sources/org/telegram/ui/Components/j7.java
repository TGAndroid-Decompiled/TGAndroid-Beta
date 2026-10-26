package org.telegram.ui.Components;
public final class j7 implements Runnable {
    public final int f29501a;
    public final m8 f29502b;
    public final k80 f29503c;

    public j7(m8 m8Var, k80 k80Var, int i10) {
        this.f29501a = i10;
        this.f29502b = m8Var;
        this.f29503c = k80Var;
    }

    @Override
    public final void run() {
        switch (this.f29501a) {
            case 0:
                m8 m8Var = this.f29502b;
                m8Var.getClass();
                this.f29503c.u();
                m8Var.A0(1);
                return;
            case 1:
                m8 m8Var2 = this.f29502b;
                m8Var2.getClass();
                this.f29503c.u();
                m8Var2.A0(2);
                return;
            case 2:
                m8 m8Var3 = this.f29502b;
                m8Var3.getClass();
                this.f29503c.u();
                m8Var3.A0(4);
                return;
            case 3:
                m8 m8Var4 = this.f29502b;
                m8Var4.getClass();
                this.f29503c.u();
                m8Var4.A0(7);
                return;
            default:
                m8.n(this.f29502b, this.f29503c);
                return;
        }
    }
}
