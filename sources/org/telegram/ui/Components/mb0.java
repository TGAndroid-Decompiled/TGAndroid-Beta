package org.telegram.ui.Components;
public final class mb0 implements Runnable {
    public final int f26351a;
    public final ac0 f26352b;

    public mb0(ac0 ac0Var, int i10) {
        this.f26351a = i10;
        this.f26352b = ac0Var;
    }

    @Override
    public final void run() {
        switch (this.f26351a) {
            case 0:
                ac0 ac0Var = this.f26352b;
                tb0 tb0Var = ac0Var.f22607f;
                if (ac0Var.f22606c0.d.webpageTop) {
                    tb0Var.w0(-tb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                tb0Var.w0(tb0Var.computeVerticalScrollRange() - (tb0Var.computeVerticalScrollExtent() + tb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f26352b.g(true, false);
                return;
        }
    }
}
