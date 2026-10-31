package org.telegram.ui;
public final class bt0 implements Runnable {
    public final int f36300a;
    public final kt0 f36301b;

    public bt0(kt0 kt0Var, int i10) {
        this.f36300a = i10;
        this.f36301b = kt0Var;
    }

    @Override
    public final void run() {
        switch (this.f36300a) {
            case 0:
                kt0 kt0Var = this.f36301b;
                org.telegram.messenger.i0.g3(new bt0(kt0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = kt0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = kt0Var.L;
                    q1Var2.f22504b6 = null;
                    q1Var2.invalidate();
                }
                pm pmVar = kt0Var.f38941e0;
                if (pmVar != null) {
                    org.telegram.messenger.i0.g3(pmVar);
                    kt0Var.f38941e0 = null;
                    return;
                }
                return;
            case 1:
                this.f36301b.c(false);
                return;
            case 2:
                this.f36301b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public bt0(kt0 kt0Var, boolean z10) {
        this.f36300a = 0;
        this.f36301b = kt0Var;
    }
}
