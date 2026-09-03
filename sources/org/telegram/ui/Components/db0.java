package org.telegram.ui.Components;
public final class db0 implements Runnable {
    public final int f24240a;
    public final rb0 f24241b;

    public db0(rb0 rb0Var, int i10) {
        this.f24240a = i10;
        this.f24241b = rb0Var;
    }

    @Override
    public final void run() {
        switch (this.f24240a) {
            case 0:
                rb0 rb0Var = this.f24241b;
                jb0 jb0Var = rb0Var.f28443f;
                if (rb0Var.W.d.webpageTop) {
                    jb0Var.w0(-jb0Var.computeVerticalScrollOffset(), 250, wh.n.V);
                    return;
                }
                jb0Var.w0(jb0Var.computeVerticalScrollRange() - (jb0Var.computeVerticalScrollExtent() + jb0Var.computeVerticalScrollOffset()), 250, wh.n.V);
                return;
            default:
                this.f24241b.g(true, false);
                return;
        }
    }
}
