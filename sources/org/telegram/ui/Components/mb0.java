package org.telegram.ui.Components;
public final class mb0 implements Runnable {
    public final int f26419a;
    public final ac0 f26420b;

    public mb0(ac0 ac0Var, int i10) {
        this.f26419a = i10;
        this.f26420b = ac0Var;
    }

    @Override
    public final void run() {
        switch (this.f26419a) {
            case 0:
                ac0 ac0Var = this.f26420b;
                tb0 tb0Var = ac0Var.f22651f;
                if (ac0Var.f22650c0.d.webpageTop) {
                    tb0Var.x0(-tb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                tb0Var.x0(tb0Var.computeVerticalScrollRange() - (tb0Var.computeVerticalScrollExtent() + tb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f26420b.g(true, false);
                return;
        }
    }
}
