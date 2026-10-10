package org.telegram.ui.Components;
public final class cc0 implements Runnable {
    public final int f25267a;
    public final qc0 f25268b;

    public cc0(qc0 qc0Var, int i10) {
        this.f25267a = i10;
        this.f25268b = qc0Var;
    }

    @Override
    public final void run() {
        switch (this.f25267a) {
            case 0:
                qc0 qc0Var = this.f25268b;
                jc0 jc0Var = qc0Var.f30185f;
                if (qc0Var.f30183c0.d.webpageTop) {
                    jc0Var.w0(-jc0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                jc0Var.w0(jc0Var.computeVerticalScrollRange() - (jc0Var.computeVerticalScrollExtent() + jc0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f25268b.g(true, false);
                return;
        }
    }
}
