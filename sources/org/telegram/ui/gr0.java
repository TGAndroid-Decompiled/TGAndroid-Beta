package org.telegram.ui;
public final class gr0 implements Runnable {
    public final int f45709a;
    public final pr0 f45710b;

    public gr0(pr0 pr0Var, int i3) {
        this.f45709a = i3;
        this.f45710b = pr0Var;
    }

    @Override
    public final void run() {
        switch (this.f45709a) {
            case 0:
                pr0 pr0Var = this.f45710b;
                org.telegram.messenger.g0.h3(new gr0(pr0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = pr0Var.M;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = pr0Var.M;
                    q1Var2.f29873c6 = null;
                    q1Var2.invalidate();
                }
                pl plVar = pr0Var.f48647f0;
                if (plVar != null) {
                    org.telegram.messenger.g0.h3(plVar);
                    pr0Var.f48647f0 = null;
                    return;
                }
                return;
            case 1:
                this.f45710b.c(false);
                return;
            case 2:
                this.f45710b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public gr0(pr0 pr0Var, boolean z10) {
        this.f45709a = 0;
        this.f45710b = pr0Var;
    }
}
