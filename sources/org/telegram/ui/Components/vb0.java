package org.telegram.ui.Components;
public final class vb0 implements Runnable {
    public boolean f31244a;
    public final ac0 f31245b;

    public vb0(ac0 ac0Var) {
        this.f31245b = ac0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f31244a;
        ac0 ac0Var = this.f31245b;
        ac0Var.a(z10);
        ac0Var.postDelayed(this, ac0Var.M);
    }
}
