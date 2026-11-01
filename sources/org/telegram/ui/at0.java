package org.telegram.ui;
public final class at0 implements Runnable {
    public final int f35833a;
    public final jt0 f35834b;

    public at0(jt0 jt0Var, int i10) {
        this.f35833a = i10;
        this.f35834b = jt0Var;
    }

    @Override
    public final void run() {
        switch (this.f35833a) {
            case 0:
                jt0 jt0Var = this.f35834b;
                org.telegram.messenger.i0.g3(new at0(jt0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = jt0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = jt0Var.L;
                    q1Var2.f22505b6 = null;
                    q1Var2.invalidate();
                }
                pm pmVar = jt0Var.f38547e0;
                if (pmVar != null) {
                    org.telegram.messenger.i0.g3(pmVar);
                    jt0Var.f38547e0 = null;
                    return;
                }
                return;
            case 1:
                this.f35834b.c(false);
                return;
            case 2:
                this.f35834b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public at0(jt0 jt0Var, boolean z10) {
        this.f35833a = 0;
        this.f35834b = jt0Var;
    }
}
