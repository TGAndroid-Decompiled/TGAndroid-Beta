package org.telegram.ui.ActionBar;

public final class q1 implements Runnable {

    public final int f23737a;

    public final b2 f23738b;

    public q1(b2 b2Var, int i10) {
        this.f23737a = i10;
        this.f23738b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f23737a) {
            case 0:
                this.f23738b.dismiss();
                break;
            default:
                b2 b2Var = this.f23738b;
                if (!b2Var.isShowing()) {
                    try {
                        b2Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
        }
    }
}
