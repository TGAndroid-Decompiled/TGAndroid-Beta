package org.telegram.ui.Components;
public final class lb0 implements Runnable {
    public final int f26048a;
    public final ac0 f26049b;

    public lb0(ac0 ac0Var, int i10) {
        this.f26048a = i10;
        this.f26049b = ac0Var;
    }

    @Override
    public final void run() {
        switch (this.f26048a) {
            case 0:
                ac0 ac0Var = this.f26049b;
                sb0 sb0Var = ac0Var.f22626f;
                if (ac0Var.f22625c0.d.webpageTop) {
                    sb0Var.x0(-sb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                sb0Var.x0(sb0Var.computeVerticalScrollRange() - (sb0Var.computeVerticalScrollExtent() + sb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f26049b.g(true, false);
                return;
        }
    }
}
