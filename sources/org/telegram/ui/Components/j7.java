package org.telegram.ui.Components;
public final class j7 implements Runnable {
    public final int f26209a;
    public final m8 f26210b;
    public final m80 f26211c;

    public j7(m8 m8Var, m80 m80Var, int i10) {
        this.f26209a = i10;
        this.f26210b = m8Var;
        this.f26211c = m80Var;
    }

    @Override
    public final void run() {
        switch (this.f26209a) {
            case 0:
                m8 m8Var = this.f26210b;
                m8Var.getClass();
                this.f26211c.u();
                m8Var.u0(1);
                return;
            case 1:
                m8 m8Var2 = this.f26210b;
                m8Var2.getClass();
                this.f26211c.u();
                m8Var2.u0(2);
                return;
            case 2:
                m8 m8Var3 = this.f26210b;
                m8Var3.getClass();
                this.f26211c.u();
                m8Var3.u0(4);
                return;
            case 3:
                m8 m8Var4 = this.f26210b;
                m8Var4.getClass();
                this.f26211c.u();
                m8Var4.u0(7);
                return;
            default:
                m8.s(this.f26210b, this.f26211c);
                return;
        }
    }
}
