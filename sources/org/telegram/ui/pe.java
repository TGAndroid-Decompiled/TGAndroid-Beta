package org.telegram.ui;
public final class pe implements Runnable {
    public final int f36095a;
    public final org.telegram.ui.Components.bm0 f36096b;

    public pe(org.telegram.ui.Components.bm0 bm0Var, int i10) {
        this.f36095a = i10;
        this.f36096b = bm0Var;
    }

    @Override
    public final void run() {
        switch (this.f36095a) {
            case 0:
                org.telegram.ui.Components.bm0 bm0Var = this.f36096b;
                if (!bm0Var.M) {
                    bm0Var.M = true;
                    bm0Var.c(new org.telegram.ui.Components.zl0(bm0Var, 0), false);
                    bm0Var.f22786s.invalidate();
                    return;
                }
                return;
            default:
                this.f36096b.dismiss();
                return;
        }
    }
}
