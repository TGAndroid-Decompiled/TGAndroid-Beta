package org.telegram.ui.Components;
public final class vb0 implements Runnable {
    public boolean f31209a;
    public final ac0 f31210b;

    public vb0(ac0 ac0Var) {
        this.f31210b = ac0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f31209a;
        ac0 ac0Var = this.f31210b;
        ac0Var.a(z10);
        ac0Var.postDelayed(this, ac0Var.M);
    }
}
