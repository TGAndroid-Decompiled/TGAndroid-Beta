package org.telegram.ui.Components;
public final class cc0 implements Runnable {
    public final int f25188a;
    public final qc0 f25189b;

    public cc0(qc0 qc0Var, int i10) {
        this.f25188a = i10;
        this.f25189b = qc0Var;
    }

    @Override
    public final void run() {
        switch (this.f25188a) {
            case 0:
                qc0 qc0Var = this.f25189b;
                jc0 jc0Var = qc0Var.f30134f;
                if (qc0Var.f30132c0.d.webpageTop) {
                    jc0Var.w0(-jc0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                jc0Var.w0(jc0Var.computeVerticalScrollRange() - (jc0Var.computeVerticalScrollExtent() + jc0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f25189b.g(true, false);
                return;
        }
    }
}
