package org.telegram.ui;
public final class qe implements Runnable {
    public final int f40796a;
    public final org.telegram.ui.Components.bn0 f40797b;

    public qe(org.telegram.ui.Components.bn0 bn0Var, int i10) {
        this.f40796a = i10;
        this.f40797b = bn0Var;
    }

    @Override
    public final void run() {
        switch (this.f40796a) {
            case 0:
                org.telegram.ui.Components.bn0 bn0Var = this.f40797b;
                if (!bn0Var.M) {
                    bn0Var.M = true;
                    bn0Var.c(new org.telegram.ui.Components.zm0(bn0Var, 0), false);
                    bn0Var.f25059s.invalidate();
                    return;
                }
                return;
            default:
                this.f40797b.dismiss();
                return;
        }
    }
}
